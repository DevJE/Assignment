package workshop4;

public class Test01 {

	public static void main(String[] args) {
		// workshop04 -1
		int [][] arr2 = {
				{5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20},
				{30, 30, 30, 30}
		};
		
		int sum = 0;
		double avg = 0.0;
		int c = 0;
		
		for(int i = 0; i < arr2.length; i ++) {
			for( int j = 0; j < arr2[i].length; j ++) {
				sum += arr2[i][j];
				c ++;
			}
		}
		avg = sum / c;
		System.out.printf("total = %d\naverage = %.1f", sum, avg);

	}

}
