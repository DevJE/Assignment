package workshop4;

public class Test04 {

	public static void main(String[] args) {
		// workshop04 -4
		int x = Integer.parseInt(args[0]);
		
		if(x > 4 && x < 11) 
			System.out.println("��� : " + new Calc().calculate(x));
		else
			System.out.println("�ٽ��Է����ּ���");

	}

}
