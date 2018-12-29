package ncs4.test1;

import java.util.Comparator;

public class Decending implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		/*int re = o2.compareTo(o1);*/
		
		return o2.compareTo(o1);
	}

}
