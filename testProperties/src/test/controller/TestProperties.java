package test.controller;

import java.io.*;
import java.util.*;
import test.entity.Employee;

public class TestProperties {

	public static void main(String[] args) {
		// Employee Test
		TestProperties test = new TestProperties();
		Properties prop = new Properties();
		
		/*prop.setProperty("20130412", "ȫ�浿,��ȹ��,38000000,0.2");
		prop.setProperty("20130216", "�迵��,ȫ����,42000000,0.1");
		prop.setProperty("30180712", "ȫö��,�ѹ���,39000000,0.2");
		prop.setProperty("10320303", "�̿���,���ߺ�,41000000,0.4");
		prop.setProperty("40183002", "�ڼ���,ȫ����,29000000,0.1");
		
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
		p.setProperty("50120912", "Peter,���ߺ�,51000000,0.3");
		p.setProperty("10231203", "Alice,�Ѻι�,36000000,0.1");
		
		try {
			p.store(new FileWriter("empData.txt"), "2�� ����");
			
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
			pr.storeToXML(new FileOutputStream("empResult.xml"), "���ʽ�����Ʈ���뿬��", "UTF-8");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
