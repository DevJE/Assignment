package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	private static Scanner sc = new Scanner(System.in);
	
	/*public static void main (String[] args) throws InvalidException {
		// ���� 6. ���� �Է¹��� �� �� ���, ������ �ִٸ� ���� �޼��� ���
		Calculator c = new Calculator();
		System.out.print("���� �Է� : ");
		System.out.println("��� �� : " + c.getSum(sc.nextInt()));
		
	}*/
	public static void main (String[] args) {
		Calculator c = new Calculator();
		System.out.print("���� �Է� : ");
		try {
			System.out.println("��� �� : " + c.getSum(sc.nextInt()));
		}catch(InvalidException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
