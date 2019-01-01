package workshop1;

public class Test02 {
	
	public static void main(String[] args) {
		// workshop01 -2
		double plus = 0.0;
		double multiply = 1.0;
		double avg = 0.0;
		int x = Integer.parseInt(args[0]);
		
		if(x > 4 && x < 11) {
			double []dR = new double[x];
		
			for(int i = 0; i < x; i ++)
				dR[i] = i + 1;
			
			for(double d : dR) {
				plus += d;
				multiply *= d;
				avg = (plus / dR.length);
			}
			System.out.printf("합 : %.1f\n곱 : %.1f\n평균 : %.1f", plus, multiply, avg);
		} else {
			System.out.println("다시 입력해주세요");
		}	
	}


}
