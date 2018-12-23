package practice3;

import java.util.Scanner;

import collection.practice2.*;
import practice3.BookManagerMap;
import java.util.*;

public class TestBookManagerMap {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Book bb = new Book("1", 1, "1", "1");
		BookManagerMap bm = new BookManagerMap();
		bm.searchBook("1");
		System.out.println(bm.searchBook("1"));*/

		
		BookManagerMap bM = new BookManagerMap();
		int number = 0;
		do {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻�");
			System.out.println("5. ��ü ���");
			System.out.println("6. ������");
			
			System.out.print("\n�޴� ��ȣ ���� : ");
			number = sc.nextInt();
			
			switch(number) {
			case 1 : bM.putBook(inputBook()); break;
			case 2 : bM.printBookmap(bM.sortedBookMap());; break;
			case 3 : bM.removeBook(bM.searchBook(inputBookTitle()));; break;
			case 4 : bM.printBook(bM.searchBook(inputBookTitle())); break;
			case 5 : bM.displayAll(); break;
			case 6 : System.out.println("���α׷��� �����մϴ�.");
			 		return;
			 	default : System.out.println("�޴��� �ٽ� �������ּ���.");
			}
			
		}while(true);
	}
	
	public static Book inputBook() {
		
		System.out.print("������ȣ : ");
		String snum = sc.next();
		
		System.out.print("�����з��ڵ� �Է� (1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
		int catagory = sc.nextInt();
		
		System.out.print("���� ���� : ");
		sc.nextLine();
		String title = sc.nextLine();
		
		System.out.print("���� : ");
		String author = sc.next();
			
		Book bb = new Book(snum, catagory, title, author);
		
			return bb;
		
	}
	public static String inputBookTitle() {
		System.out.print("å ���� : ");
		String bT = sc.nextLine();
		
		return bT;
	}

}
