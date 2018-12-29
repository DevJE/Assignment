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
		list.add(new Book("�ڹ��� ����", "���ü�", 30000, "��������", 0.15));
		list.add(new Book("�������� �ڹ�", "������", 29000, "������", 0.2));
		list.add(new Book("��ü���� JAVA8", "�ݿ���", 30000, "�Ͻ�Ȩ", 0.1));
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
			System.out.println(book + "\n���ε� ���� : " + last + "��");
		}
		
	}

}
