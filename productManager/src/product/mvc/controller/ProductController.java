package product.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;

import product.exception.ProductException;
import product.mvc.model.service.ProductService;
import product.mvc.model.vo.Product;
import product.mvc.view.ProductMenu;

public class ProductController {
	private ProductService pService;
	
	public ProductController() {
		try {
			pService = new ProductService();
		} catch (Exception e) {
			new ProductMenu().printError(e.getMessage());
		}
	}
	
	public void insertProduct(Product p) {
		ProductMenu pMenu = new ProductMenu();
		try {
			if(pService.insert(p) > 0)
				System.out.println("제품 목록 추가 성공!");
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
		}
	}
	
	public void updateProduct(Product p) {
		ProductMenu pMenu = new ProductMenu();
		try {
			if(pService.update(p) > 0)
				System.out.println("제품 가격 변경 완료!");
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
		}
	}
	
	public void deleteProduct(String productId) {
		ProductMenu pMenu = new ProductMenu();
		try {
			if(pService.delete(productId) > 0)
				System.out.println("제품 목록 삭제 성공!");
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
		}
	}
	
	public void searchBook(String productId) {
		ProductMenu pMenu = new ProductMenu();
		try {
			Product p = pService.selectProduct(productId);
			pMenu.printProduct(p);
			
			if(p != null)
				System.out.println("제품 조회 성공!");
		} catch (ProductException e) {
			new ProductMenu().printError(e.getMessage());
		}
	}
	
	public void selectAllList() {
		ProductMenu pMenu = new ProductMenu();
		try {
			pMenu.printList(pService.selectList());
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
		}
	}
	
	public void selectAllMap() {
		ProductMenu pMenu = new ProductMenu();
		try {
			pMenu.printMap(pService.selectMap());
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
		}
	}
	
	public void searchProductList(String pName) {
		ProductMenu pMenu = new ProductMenu();
		try {
			ArrayList<Product> goodList = pService.selectNameList(pName);
			pMenu.printList(goodList);
			
			if(goodList.size() > 0) 
				System.out.println("조회 성공!");
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
			
		}
	}
	
	public void searchProductMap(String pName) {
		ProductMenu pMenu = new ProductMenu();
		try {
			HashMap<String, Product> goodMap = pService.selectNameMap(pName);
			pMenu.printMap(goodMap);
			
			if(goodMap.size() > 0)
				System.out.println("조회 성공!");
		} catch (ProductException e) {
			pMenu.printError(e.getMessage());
		}
	}
	

}
