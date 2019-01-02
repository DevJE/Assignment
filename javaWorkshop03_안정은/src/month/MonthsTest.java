package month;

public class MonthsTest {

	public static void main(String[] args) {
		// workshop03 -3
		if(args.length < 2) {
			int x = Integer.parseInt(args[0]);
			System.out.printf("입력받은월 : %d월\n", x);
				if(x > 0 && x < 13)
					System.out.printf("마지막일자 : %d일\n", new Months().getDays(x));
				else
					System.out.println("입력된 값이 잘못되었습니다.");
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}
}
