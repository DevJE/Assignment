package ncs.test7;

public class StudentTest {

	public static void main(String[] args) {
		// 문제 7. Student Object 생성 후 출력.
		Student []sar = new Student[3];
			sar[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
			sar[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
			sar[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
			
			for(int i = 0; i < sar.length; i ++) {
				System.out.println(sar[i].toString());
			}
		
		
		

	}

}
