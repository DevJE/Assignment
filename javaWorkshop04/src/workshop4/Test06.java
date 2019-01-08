package workshop4;

public class Test06 {

	public static void main(String[] args) {
		// workshop04 -6
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double sum = 0.0;
		double c = 0.0;
		
		if(args.length > 2) {
			System.out.println("다시 입력하세요");
			return;
		} 
		
		if(x > 0 && x < 6)  {
			if(y > 0 && y < 6) {
				int [][]arr = new int[x][y];
				for(int i = 0; i < arr.length; i ++) {
					for(int j = 0; j < arr[i].length; j ++) {
						arr[i][j] = (int)(Math.random() * 5) + 1;
						sum += arr[i][j];
						c ++;
						
						System.out.print(arr[i][j] + " ");
					}
				}
				System.out.println("\nsum = " + sum
								  +"\navg = " + (sum/c));
			} else {
				System.out.println("숫자를 확인하세요");
			}
		} else {
			System.out.println("숫자를 확인하세요");
		}
	}

}
