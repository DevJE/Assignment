package workshop1;

public class Test01 {
	
	public static void main(String[] args) {
		// workshop01 -1
		double d1 = Double.parseDouble(args[0]);
		double d2 = Double.parseDouble(args[1]);

		if(d1 > 0 && d1 < 11 && d2 > 0 && d2 < 11) {
			String s = (((d1 % d2)) > 1 ? "�������� 1���� ũ��!" : "�������� 1���� �۰ų� ����!");
			System.out.println(s);
		} else {
			System.out.println("1���� 10 ������ ������ �Է����ּ���.");
		}		
	}


}
