package ncs4.test1;

import java.util.*;

public class ListTest {

	public void display(List<Integer> list) {
		
		for(Integer al : list) {
			System.out.print(al + " ");
		}
	}
	
	public static void main(String []args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		ListTest lt = new ListTest();
		
		int k = 0;
		while(k < 11) {
			aList.add((int)(Math.random() * 100) + 1);
			
			k ++;
		}
		System.out.print("������ : ");
		for(Integer ii : aList) {
			System.out.print(ii + " ");
		}
		
		aList.sort(new Decending());
		Integer[] iar = new Integer[aList.size()];
		aList.toArray(iar);
		System.out.print("\n������ : ");
		lt.display(aList);
		
		
		
	}

}
