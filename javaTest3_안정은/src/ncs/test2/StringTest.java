package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		// ���� 2. String������ ","��ū ���. �и� �� �հ� ��� ���ϱ�.
		String str = "1.22,4.12,5.93,8.71,9.34";
		//int itr = Integer.parseInt(str);
		
		double data[] = new double[5];
		double sum = 0.0;
		
		String []st;
		st = str.split(",");
		
		/*for(int i = 0; i < st.length; i ++) {
			data[i] = Double.parseDouble(st[i]);
		}
		
		for(double d : data) {
			sum += d;
		}*/
		
		int count = 0;
		for(double d : data) {
			d = Double.parseDouble(st[count]);
			count ++;
			sum += d;
		}
			
		System.out.printf("�հ� : %.3f \n", sum);
		System.out.printf("��� : %.3f \n", (sum/5.0));
		

	}

} 
