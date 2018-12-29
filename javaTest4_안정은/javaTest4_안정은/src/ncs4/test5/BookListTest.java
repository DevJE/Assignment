package ncs4.test5;

import java.util.*;
import java.io.*;

public class BookListTest {

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book> ();
		
		test5.storeList(list);
		test5.saveFile(list);
		
		List<Book> booksList = test5.loadFile();
		test5.printList(booksList);

	}
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book> list) {
		try(ObjectOutputStream ooS = new ObjectOutputStream(new FileOutputStream("books.dat")))
		{
			int x = 0;
			while(x < list.size()) {
				ooS.writeObject(list.get(x));
				
				x ++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Book> loadFile() {
		Book []book = new Book[200];
		List<Book> list = new ArrayList<Book>();
		int index = 0;
		int y = 0;
		try(ObjectInputStream oIs = new ObjectInputStream(new FileInputStream("books.dat")))
		{
			
			while(true) {
				book[index] = (Book)oIs.readObject();
				
				index ++;
			}
			
		} catch(EOFException e) {
			while(y < index) {
				list.add(book[y]);
				y ++;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void printList(List<Book> list) {
		for(Book book : list) {
			
			int last = (int)(book.getPrice() - (book.getPrice()*book.getDiscountRate()));
			System.out.println(book + "\n할인된 가격 : " + last + "원");
		}
		
	}

}
