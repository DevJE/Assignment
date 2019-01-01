package workshop2;

public class Test02 {

	public static void main(String[] args) {
		// workshop02 -2
		/*int inx = 0;                                       
		while(inx <= 6) {
			int jnx = 0;
			while( jnx <= inx) {
				System.out.print("*");
				jnx++;
			}
			System.out.print("@");
			inx++;
		}*/
		//for문으로 변경하기
		for(int inx = 0; inx <=6; inx ++) {
			for(int jnx = 0; jnx <= inx; jnx ++) {
				System.out.print("*");
			}
			System.out.print("@");
		}

	}

}
