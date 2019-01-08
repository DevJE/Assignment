package workshop4;

public class Test02 {

	public static void main(String[] args) {
		// workshop04 -2
		int []arr3 = new int[5];
		
		int sum = 0;
		double avg = 0.0;
		for(int i : arr3) {
			i = (int)(Math.random() * 10) +1;
			System.out.print(i + " ");
			sum += i;
			avg = sum / arr3.length;
		}
		System.out.println("\nsum = " + sum);
		System.out.println("avg = " + avg);
	}

}
