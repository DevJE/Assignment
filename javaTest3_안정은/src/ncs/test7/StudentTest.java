package ncs.test7;

public class StudentTest {

	public static void main(String[] args) {
		// ���� 7. Student Object ���� �� ���.
		Student []sar = new Student[3];
			sar[0] = new Student("ȫ���", 25, 171, 81, "201401", "�������");
			sar[1] = new Student("�ѻ��", 23, 183, 72, "201402", "������");
			sar[2] = new Student("�Ӳ���", 26, 175, 65, "201403", "ü����");
			
			for(int i = 0; i < sar.length; i ++) {
				System.out.println(sar[i].toString());
			}
		
		
		

	}

}
