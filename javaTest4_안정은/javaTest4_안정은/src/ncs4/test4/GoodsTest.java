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
			System.out.println("���� �׸��� ���� �Է��Ͻÿ�.");
			System.out.print("��ǰ�� : ");
			goods.setName(br.readLine());
		
			System.out.print("���� : ");
			goods.setPrice(Integer.parseInt(br.readLine()));
		
			System.out.print("���� : ");
			goods.setQuantity(Integer.parseInt(br.readLine()));
		
			/*Goods g = new Goods(name,price,quantity);*/
			
			int total = goods.getPrice()*goods.getQuantity();
			
			System.out.println(goods);
			System.out.println("�� ���� ���� : " + total + "��");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
