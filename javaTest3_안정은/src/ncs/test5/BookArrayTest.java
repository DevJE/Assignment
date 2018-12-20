package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		// 문제 5. Book 출력, 모두 getter 이용
		Book bArray [] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVAB", "금영옥", 30000, "북스홈", 0.1);
		
		/*Book []bar = {
				new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1),
				new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1),
				new Book("객체지향 JAVAB", "금영옥", 30000, "북스홈", 0.1)
				};*/
		
		for(int i = 0; i < bArray.length; i ++) {
			System.out.println();
			System.out.println(bArray[i].getTitle() + ", " 
							 + bArray[i].getAuthor() + ", " 
							 + bArray[i].getPrice() + "원, " 
							 + bArray[i].getPublisher() + ", " 
							 + (int)(bArray[i].getDiscountRate()*100) + "% 할인"
							 );
			System.out.println(
				"할인된 가격 : " + (int)(bArray[i].getPrice() - (bArray[i].getPrice() * bArray[i].getDiscountRate())) + "원");
		}

	}

}
