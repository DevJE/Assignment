package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// ���� 3. ���̰Ի�, ���� ���� ���
		int y = 1987;
		int m = 5;
		int d = 27;
		
		Date today = new Date();
		Calendar cd = new GregorianCalendar();

		int y2 = cd.get(Calendar.YEAR);
		int m2 = cd.get(Calendar.MONTH);
		int d2 = cd.get(Calendar.DAY_OF_MONTH);
		
		int age = y2 - y;
		 if(m*100 + d > m2*100 + d2);
			age --;
		
		SimpleDateFormat sdf = new SimpleDateFormat("'���� :' yyyy'��' MM'��' dd'��'");
		SimpleDateFormat sdf2 = new SimpleDateFormat("'���� :' 1987'��' 5'��' 27'��' E'����'");
		String d1 = sdf.format(today);
		String dd = sdf2.format(today);
		
		System.out.println(dd);
		System.out.println(d1);
		System.out.println("���� : " + age + "��");
	}
}
