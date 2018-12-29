package ncs4.test4;

import java.io.*;
import java.util.*;

public class GoodsTest {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BufferedReader br = null;
		Goods goods = new Goods();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			goods.setName(br.readLine());
		
			System.out.print("가격 : ");
			goods.setPrice(Integer.parseInt(br.readLine()));
		
			System.out.print("수량 : ");
			goods.setQuantity(Integer.parseInt(br.readLine()));
		
			/*Goods g = new Goods(name,price,quantity);*/
			
			int total = goods.getPrice()*goods.getQuantity();
			
			System.out.println(goods);
			System.out.println("총 구매 가격 : " + total + "원");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
