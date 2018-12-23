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
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			
			System.out.print("\n메뉴 번호 선택 : ");
			number = sc.nextInt();
			
			switch(number) {
			case 1 : bM.putBook(inputBook()); break;
			case 2 : bM.printBookmap(bM.sortedBookMap());; break;
			case 3 : bM.removeBook(bM.searchBook(inputBookTitle()));; break;
			case 4 : bM.printBook(bM.searchBook(inputBookTitle())); break;
			case 5 : bM.displayAll(); break;
			case 6 : System.out.println("프로그램을 종료합니다.");
			 		return;
			 	default : System.out.println("메뉴를 다시 선택해주세요.");
			}
			
		}while(true);
	}
	
	public static Book inputBook() {
		
		System.out.print("도서번호 : ");
		String snum = sc.next();
		
		System.out.print("도서분류코드 입력 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int catagory = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		sc.nextLine();
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.next();
			
		Book bb = new Book(snum, catagory, title, author);
		
			return bb;
		
	}
	public static String inputBookTitle() {
		System.out.print("책 제목 : ");
		String bT = sc.nextLine();
		
		return bT;
	}

}
