package workshop4;

public class Test05 {

	public static void main(String[] args) {
		// workshop04 -5
		int x = Integer.parseInt(args[0]);
		
		int sum = 0;
		if(x > 0 && x < 6) {
			for(int i = x; i < 11; i ++) {
				if((i % 3 != 0) && (i % 5 != 0)) {
					System.out.print(i + " ");
					sum += i;
				}
			}
			System.out.println();
			System.out.println("결과 : " + sum);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		

	}

}
