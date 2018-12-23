package practice3;

import java.util.*;
import collection.practice2.*;

public class BookManagerMap {
	
	private HashMap booksMap;
	
	public BookManagerMap() {
		booksMap = new HashMap();
	}
	
	public BookManagerMap(HashMap hMap) {
		booksMap = new HashMap(hMap);
	}
	
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}
	
	public void removeBook(String key) {
		booksMap.remove(key);
	}
	
	public String searchBook(String bTitle) {
		String str = null;
		
		Set<Map.Entry<String, Book>> sBentry = booksMap.entrySet(); //이 줄이 문제야... why?
		Iterator<Map.Entry<String, Book>> iTb = sBentry.iterator();
		
		while(iTb.hasNext()) {
			Map.Entry<String, Book> entries = (Map.Entry<String, Book>)iTb.next();
			/*String*/ str = (String)entries.getKey();
			Book value = (Book)entries.getValue();
			
			//str = (value.getTitle().equals(bTitle) ?  key : null);
			
			if((value.getTitle()).equals(bTitle) == true) {
				break;
			}
		}
		
		return str;
	}
	
	public void displayAll() {
		Iterator iBook = booksMap.keySet().iterator();
		
		while(iBook.hasNext()) {
			System.out.println(booksMap.get(iBook.next()));
		}
		
		//booksMap.keySet();
		
	}
	
	public Book[] sortedBookMap() {
		List<Book> booksList = new ArrayList<Book>(booksMap.values());
		
		booksList.sort(new AscBookTitle());
		
		Book []bar = new Book[booksList.size()];
		booksList.toArray(bar);
		
		return bar;
	}
	
	public void printBookmap(Book[] br) {
		for(Book b : br) {
			System.out.println(b);
		}
	}
	
	public void printBook(String key) {
		System.out.println(booksMap.get(key));
	}

}
