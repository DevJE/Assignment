package ncs.test4;

import java.util.*;

public class ProductTest {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 문제 4. 수량 구매가격 출력
		Product p = new Product();
		System.out.print("제품이름 : ");
		p.setName(sc.nextLine());
		System.out.print("가격 : ");
		p.setPrice(sc.nextInt());
		System.out.print("수량 : ");
		p.setQuantity(sc.nextInt());
		
		int sum = p.getPrice() * p.getQuantity();
		
		System.out.println(p.imformation() + "\n총 구매 가격 : " + sum + "원");
	
		
		

	}

}
