package com.test3;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		// workshop02 -3
		Student []sTArray = new Student[3];
		
			sTArray[0] = new Student("홍길동", 15, 170, 80);
			sTArray[1] = new Student("한사람", 13, 180, 70);
			sTArray[2] = new Student("임걱정", 16, 175, 65);
				
		int aSum = 0, hSum = 0, wSum = 0;
		double aAvg = 0.0, hAvg  = 0.0, wAvg = 0.0;
		int m1 = Integer.MIN_VALUE, m3 = Integer.MIN_VALUE, m5 = Integer.MIN_VALUE;
		int m2 = Integer.MAX_VALUE, m4 = Integer.MAX_VALUE, m6 = Integer.MAX_VALUE;
		
			System.out.print("이름\t나이\t신장\t몸무게\n");
		for(int i = 0; i < sTArray.length; i ++) {
			System.out.println(sTArray[i].toStringInfo());
			aAvg = (double)(aSum += sTArray[i].getAge())/sTArray.length;
			hAvg = (double)(hSum += sTArray[i].getHeight())/sTArray.length;
			wAvg = (double)(wSum += sTArray[i].getWeight())/sTArray.length;			
		}
		System.out.printf("\n나이 평균 : %.3f\n신장 평균 : %.3f\n몸무게 평균 : %.3f\n", aAvg, hAvg, wAvg);

		String name = null, name2 = null;
		for(int i = 0 ; i < sTArray.length; i ++) {
			if(m1 < sTArray[i].getAge()) m1 = sTArray[i].getAge();
			if(sTArray[i].getAge() == m1) name = sTArray[i].getName();
			
			if(m2 > sTArray[i].getAge()) m2 = sTArray[i].getAge();
			if(sTArray[i].getAge() == m2) name2 = sTArray[i].getName();
		}
		System.out.printf("\n나이가 가장 많은 학생 : %s\n나이가 가장 적은 학생 : %s\n", name, name2);
		
		for(int i = 0 ; i < sTArray.length; i ++) {
			if(m3 < sTArray[i].getHeight()) m3 = sTArray[i].getHeight();
			if(sTArray[i].getHeight() == m3) name = sTArray[i].getName();
			
			if(m4 > sTArray[i].getHeight()) m4 = sTArray[i].getHeight();
			if(sTArray[i].getHeight() == m4) name2 = sTArray[i].getName();
		}
		System.out.printf("\n신장이 가장 큰 학생 : %s\n신장이 가장 작은 학생 : %s\n", name, name2);
		
		for(int i = 0 ; i < sTArray.length; i ++) {
			if(m5 < sTArray[i].getWeight()) m5 = sTArray[i].getWeight();
			if(sTArray[i].getWeight() == m5) name = sTArray[i].getName();
			
			if(m6 > sTArray[i].getWeight()) m6 = sTArray[i].getWeight();
			if(sTArray[i].getWeight() == m6) name2 = sTArray[i].getName();
		}
		System.out.printf("\n몸무게가 가장 많이 나가는 학생 : %s\n몸무게가 가장 적게 나가는 학생 : %s\n", name, name2);

	}

}
