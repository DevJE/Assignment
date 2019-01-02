package workshop03;

public class Test02 {

	public static void main(String[] args) {
		// workshop03 -2
		
		int x = Integer.parseInt(args[0]);
		
		if(x > 4 && x < 11)
			System.out.println(new Calc().calculate(x));
		else			
			System.out.println("다시 입력해주세요.");
			
		
	}

}
