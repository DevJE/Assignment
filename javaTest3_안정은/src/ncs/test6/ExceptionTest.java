package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	private static Scanner sc = new Scanner(System.in);
	
	/*public static void main (String[] args) throws InvalidException {
		// 문제 6. 정수 입력받은 후 합 출력, 오류가 있다면 오류 메세지 출력
		Calculator c = new Calculator();
		System.out.print("정수 입력 : ");
		System.out.println("결과 값 : " + c.getSum(sc.nextInt()));
		
	}*/
	public static void main (String[] args) {
		Calculator c = new Calculator();
		System.out.print("정수 입력 : ");
		try {
			System.out.println("결과 값 : " + c.getSum(sc.nextInt()));
		}catch(InvalidException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
