package workshop2;

public class Test01 {
	
	public static void main(String[] args) {
		// workshop02 -1
		int x = 0;
		int m1 = Integer.MIN_VALUE;
		int m2 = Integer.MAX_VALUE;
		while(x < args.length) {
			System.out.print(args[x] + " ");
			int y = Integer.parseInt(args[x]);
			if(m1 < y) m1 = y;
			if(m2 > y) m2 = y;
			
			x ++;
		}
		System.out.printf("\n최대값 : %d\n최소값 : %d", m1, m2);
	}

}
