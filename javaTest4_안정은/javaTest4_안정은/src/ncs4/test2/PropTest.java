package ncs4.test2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class PropTest {

	public static void main(String[] args) {
		PropTest pT = new PropTest();
		Properties prop = new Properties();
		
		
		pT.fileSave(prop);
		pT.fileOpen(prop);
	}
	
	public void fileSave(Properties p) {
		
		p.setProperty("1", "apple,1200,3");
		p.setProperty("2", "banana,2500,2");
		p.setProperty("3", "grape,4500,5");
		p.setProperty("4", "orange,800,10");
		p.setProperty("5", "melon,5000,2");
		
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "data.xml");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen(Properties p) {
		Set<String> kS = p.stringPropertyNames();
		Fruit []f = new Fruit[kS.size()];
		Iterator<String> iT = kS.iterator();
		String str = null;
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		int k = 0;
		
		while(iT.hasNext()) {
			String key = iT.next();
			String value = p.getProperty(key);
			/*String []values = value.split(",");
			
			int i = Integer.parseInt(key);
			String name = values[0];
			int price = Integer.parseInt(values[1]);
			int quantity = Integer.parseInt(values[2]);
			
			f[k] = new Fruit(name, price, quantity);
			k ++;*/
			String []sT = new String[kS.size()];
			sT[k] = key + "=" + value;
			//System.out.println("sT[" + k + "] = " + sT[k]);
			Arrays.sort(sT, String.CASE_INSENSITIVE_ORDER);
			System.out.println(Arrays.toString(sT));
			
			k ++;
			
			//String []ss = str.split("=");
			//Arrays.sort(ss);
			//System.out.println(Arrays.toString(ss));
		}
		
		
		/*TreeMap<String> ts = new TreeMap<String>();
		Iterator<String> itt = ts.iterator();
		while(itt.hasNext()) {
			String keys = itt.next();
			System.out.println(keys);
		}*/
		
		
			
		/*p.list(System.out);*/
		
	}

}
