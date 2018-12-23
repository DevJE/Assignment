package practice3;

import java.util.*;

import collection.practice2.Book;

public class AscBookTitle implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int re = 0;
		
		if(o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			
			if(b1.getTitle().compareTo(b2.getTitle()) > 0) {
				re = 1;
			} else if(b1.getTitle().compareTo(b2.getTitle()) < 0) {
				re = -1;
			}
		}
		return re;
	}

}
