package workshop03;

public class Calc {
	//workshop03 -2
	public int calculate(int data) {
		int sum = 0;
		int x = 1;
		while(x <= data) {
			if(x % 2 == 0) 
				sum += x;
			
			x ++;
		}
		return sum;
	}

}
