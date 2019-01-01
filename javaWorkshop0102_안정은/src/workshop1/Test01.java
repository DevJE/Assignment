package workshop1;

public class Test01 {
	
	public static void main(String[] args) {
		// workshop01 -1
		double d1 = Double.parseDouble(args[0]);
		double d2 = Double.parseDouble(args[1]);

		if(d1 > 0 && d1 < 11 && d2 > 0 && d2 < 11) {
			String s = (((d1 % d2)) > 1 ? "나머지가 1보다 크다!" : "나머지가 1보다 작거나 같다!");
			System.out.println(s);
		} else {
			System.out.println("1부터 10 사이의 정수를 입력해주세요.");
		}		
	}


}
