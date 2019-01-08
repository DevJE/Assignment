package workshop4;

public class Calc {
	public int calculate(int data) {
		int sum = 0;
		int n = 1;
		System.out.print("짝수 : ");
		while(n <= data) {
			if(n%2 == 0)
				System.out.print(n + " ");
				sum += n;
			
				n ++;
		}
		System.out.println();
		return sum;
	}

}
