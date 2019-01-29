package product.mvc.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import product.mvc.controller.ProductController;
import product.mvc.model.vo.Product;

public class ProductMenu {
	private Scanner sc = new Scanner(System.in);
	private ProductController pController = new ProductController();
	
	public ProductMenu() {}

	public void displayMenu() {
		boolean set = true;
		while(set) {
			System.out.println("==== 제품 관리 프로그램 ====");
			System.out.println("1.  추가" +
					 "\n2. 제품 가격 수정" + 
					 "\n3. 제품 삭제" +
					 "\n4. 제품 아이디로 조회" +
					 "\n5. 제품 이름으로 조회(List)" +
					 "\n6. 제품 이름으로 조회(Map)" +
					 "\n7. 제품 목록 전체 조회(List)" +
					 "\n8. 제품 목록 전체 조회 (Map)" +
					 "\n13. 끝내기");
			System.out.print("\n메뉴선택 : ");
			switch(sc.nextInt()) {
			case 1 : pController.insertProduct(inputProduct());				break;
			case 2 : pController.updateProduct(modifyProduct());			break;
			case 3 : pController.deleteProduct(inputProductId());			break;
			case 4 : pController.searchBook(inputProductId());				break;
			case 5 : pController.searchProductList(inputProductName());		break;
			case 6 : pController.searchProductMap(inputProductName());		break;
			case 7 : pController.selectAllList();							break;
			case 8 : pController.selectAllMap();							break;
			case 13 : 
					System.out.print("정말로 종료하시겠습니까? (y/n) : ");
					if(sc.next().toLowerCase().charAt(0) == 'y') {
						set = false;
						return;
					} else {
						break;
					}
				default : System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
	}
	
	public void printError(String message) {
		System.out.println("\n프로그램 오류 발생!");
		System.out.println("시스템 관리자에게 문의하세요");
		System.out.println("ERROR! [" + message + "]");	
	}

	public void printProduct(Product p) {
		System.out.println("\n조회된 제품의 정보는 다음과 같습니다 \n" + p);
		
	}
	public void printList(ArrayList<Product> goodList) {
		System.out.println("\n조회한 제품 목록 " + goodList.size() + "개");
		for(Product p : goodList) {
			System.out.println(p);
		}
		
	}
	public void printMap(HashMap<String, Product> goodMap) {
		System.out.println("\n조회한 제품 목록 " + goodMap.size() + "개");
		Product []par = new Product[goodMap.size()];
		for(Product p : goodMap.values().toArray(par)){
			System.out.println(p);
		}
		
	}
	
	public Product inputProduct() {
		Product p = new Product();
		System.out.println("\n새 제품 정보 입력");
		System.out.print("제품 이름 : ");
		p.setpName(sc.next());
		System.out.print("제품 코드 : ");
		p.setProductId(sc.next());
		System.out.print("제품 가격 : ");
		p.setPrice(sc.nextInt());
		System.out.print("제품 버전 : ");
		sc.nextLine();
		p.setDescription(sc.nextLine());
		
		return p;
	}
	
	public Product modifyProduct() {
		Product p = new Product();
		System.out.print("검색할 제품 코드 입력 : ");
		p.setProductId(sc.next());
		System.out.print("변경된 가격 입력 : ");
		p.setPrice(sc.nextInt());
		
		return p;
	}
	
	public String inputProductName() {
		System.out.print("검색할 제품 이름 : ");
		
		return sc.next();
	}
	
	public String inputProductId() {
		System.out.print("검색할 제품 코드 : ");
		
		return sc.next();
	}

}
