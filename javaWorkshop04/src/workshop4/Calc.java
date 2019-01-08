package workshop4;

public class Calc {
	public int calculate(int data) {
		int sum = 0;
		int n = 1;
		System.out.print("Â¦¼ö : ");
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
