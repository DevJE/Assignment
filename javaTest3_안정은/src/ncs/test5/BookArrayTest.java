package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		// ���� 5. Book ���, ��� getter �̿�
		Book bArray [] = new Book[3];
		bArray[0] = new Book("�ڹ��� ����", "���ü�", 30000, "��������", 0.1);
		bArray[1] = new Book("�������� �ڹ�", "������", 29000, "������", 0.1);
		bArray[2] = new Book("��ü���� JAVAB", "�ݿ���", 30000, "�Ͻ�Ȩ", 0.1);
		
		/*Book []bar = {
				new Book("�ڹ��� ����", "���ü�", 30000, "��������", 0.1),
				new Book("�������� �ڹ�", "������", 29000, "������", 0.1),
				new Book("��ü���� JAVAB", "�ݿ���", 30000, "�Ͻ�Ȩ", 0.1)
				};*/
		
		for(int i = 0; i < bArray.length; i ++) {
			System.out.println();
			System.out.println(bArray[i].getTitle() + ", " 
							 + bArray[i].getAuthor() + ", " 
							 + bArray[i].getPrice() + "��, " 
							 + bArray[i].getPublisher() + ", " 
							 + (int)(bArray[i].getDiscountRate()*100) + "% ����"
							 );
			System.out.println(
				"���ε� ���� : " + (int)(bArray[i].getPrice() - (bArray[i].getPrice() * bArray[i].getDiscountRate())) + "��");
		}

	}

}
