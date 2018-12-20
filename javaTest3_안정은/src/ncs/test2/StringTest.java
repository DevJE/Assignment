package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		// 문제 2. String데이터 ","토큰 사용. 분리 후 합과 평균 구하기.
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
			
		System.out.printf("합계 : %.3f \n", sum);
		System.out.printf("평균 : %.3f \n", (sum/5.0));
		

	}

} 
