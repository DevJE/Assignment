package workshop03;

public class Test01 {

	public static void main(String[] args) {
		// workshop03 -1
		int [][]dice = new int[7][7];
		
		for(int d1 = 1; d1 < dice.length; d1 ++) {
			for(int d2 = 1; d2 < dice[d1].length; d2 ++) {
				if(d1-d2 > 0 && d1-d2 <= 3) {
					dice[d1][d2] = d1 - d2;
					System.out.printf("%d-%d = %d\n", d1, d2, dice[d1][d2]);
				}
			}
		}
	}
}
