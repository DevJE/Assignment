package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		// 문제 1. 2차원 배열에 들어있는 데이터들의 합계와 평균 구하기.
		int [][] array = {
				{12,41,36,56,21},
				{82,10,12,61,45},
				{14,16,18,78,65},
				{45,26,72,23,34}
			};
		int sum = 0;
		double c = 0.0;
		double avg = 0.0;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j ++) {
				sum += array[i][j];
				
				c ++;
			}
		}
		avg = sum / c;
		
		System.out.printf("합계 : %.2f \n", (double)sum);
		System.out.printf("평균 : %.2f \n", avg);

	}

}
