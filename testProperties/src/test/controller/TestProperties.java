package test.controller;

import java.io.*;
import java.util.*;
import test.entity.Employee;

public class TestProperties {

	public static void main(String[] args) {
		// Employee Test
		TestProperties test = new TestProperties();
		Properties prop = new Properties();
		
		/*prop.setProperty("20130412", "È«±æµ¿,±âÈ¹ºÎ,38000000,0.2");
		prop.setProperty("20130216", "±è¿µ¼ö,È«º¸ºÎ,42000000,0.1");
		prop.setProperty("30180712", "È«Ã¶¼ö,ÃÑ¹«ºÎ,39000000,0.2");
		prop.setProperty("10320303", "ÀÌ¿µÈñ,°³¹ßºÎ,41000000,0.4");
		prop.setProperty("40183002", "¹Ú¼øÀÌ,È«º¸ºÎ,29000000,0.1");
		
		try {
			prop.store(new FileWriter("empData.txt"), "empData.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}*/
		Employee []er = test.readFile(prop);

		test.printConsole(prop);
		test.addEmpData(prop);
		test.printConsole(prop);
		
		test.saveEmpXML(er);

	}
	
	public void addEmpData(Properties p) {
		p.setProperty("50120912", "Peter,°³¹ßºÎ,51000000,0.3");
		p.setProperty("10231203", "Alice,ÃÑºÎ¹«,36000000,0.1");
		
		try {
			p.store(new FileWriter("empData.txt"), "2¸í Áõ¿ø");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public Employee[] readFile(Properties p) {
		
		Set<String> ks = p.stringPropertyNames();
		Employee []eY = new Employee[ks.size()];
		Iterator<String> iT = ks.iterator();
		
		try {
			p.load(new FileReader("empData.txt"));
			
		} catch(IOException ee) {
			ee.printStackTrace();
		}
		
		int k = 0;
		while(iT.hasNext()) {
			String key = iT.next();
			String value = p.getProperty(key);
			String []values = value.split(",");
			
			int eId = Integer.parseInt(key);
			String eName = values[0];
			String dept = values[1];
			int salary = Integer.parseInt(values[2]);
			double bonusPoint = Double.parseDouble(values[3]);
			
			eY[k] = new Employee(eId, eName, dept, salary, bonusPoint);
			k ++;
		}
		
		return eY;

	}
	
	public void printConsole(Properties p) {
		p.list(System.out);
	}
	
	public void saveEmpXML(Employee[] er) {
		Properties pr = new Properties();
		int i = 0;
		
		while(i < er.length) {
			
			er[i].setSalary((int)(er[i].getSalary() + (er[i].getSalary()*er[i].getBonusPoint())));
			pr.setProperty(String.valueOf(er[i].geteId()), er[i].toString());
			
			i ++;
		}
	
		try {
			pr.storeToXML(new FileOutputStream("empResult.xml"), "º¸³Ê½ºÆ÷ÀÎÆ®Àû¿ë¿¬ºÀ", "UTF-8");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
