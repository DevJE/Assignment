package month;

public class MonthsTest {

	public static void main(String[] args) {
		// workshop03 -3
		if(args.length < 2) {
			int x = Integer.parseInt(args[0]);
			System.out.printf("�Է¹����� : %d��\n", x);
				if(x > 0 && x < 13)
					System.out.printf("���������� : %d��\n", new Months().getDays(x));
				else
					System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�.");
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}
	}
}
