package ncs.test4;

import java.util.*;

public class ProductTest {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// ���� 4. ���� ���Ű��� ���
		Product p = new Product();
		System.out.print("��ǰ�̸� : ");
		p.setName(sc.nextLine());
		System.out.print("���� : ");
		p.setPrice(sc.nextInt());
		System.out.print("���� : ");
		p.setQuantity(sc.nextInt());
		
		int sum = p.getPrice() * p.getQuantity();
		
		System.out.println(p.imformation() + "\n�� ���� ���� : " + sum + "��");
	
		
		

	}

}
