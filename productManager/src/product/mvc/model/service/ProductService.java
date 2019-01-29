package product.mvc.model.service;

import product.exception.ProductException;
import product.mvc.model.dao.ProductDao;
import product.mvc.model.vo.Product;
import static common.JdbcTemp.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductService {
	private ProductDao pDao;
	public ProductService() throws ProductException {
		pDao = new ProductDao();
	}
	
	public int insert(Product p) throws ProductException {
		Connection conn = getConnection();
		int re = pDao.insertProduct(conn, p);
		if(re > 0)
			commit(conn);
		close(conn);
		return re;
	}
	
	public int update(Product p) throws ProductException {
		Connection conn = getConnection();
		int re = pDao.updateBook(conn, p);
		if(re > 0)
			commit(conn);
		close(conn);
		return re;
	}
	
	public int delete(String productId) throws ProductException {
		Connection conn = getConnection();
		int re = pDao.deleteProduct(conn, productId);
		if(re > 0)
			commit(conn);
		close(conn);
		return re;
	}
	
	public ArrayList<Product> selectList() throws ProductException {
		Connection conn = getConnection();
		ArrayList<Product> goodList = pDao.selectList(conn);
		close(conn);
		
		return goodList;
	}
	
	public ArrayList<Product> selectNameList(String pName) throws ProductException {
		Connection conn = getConnection();
		ArrayList<Product> goodList = pDao.selectNameList(conn, pName);
		close(conn);
		
		return goodList;
	}
	
	public HashMap<String, Product> selectMap() throws ProductException {
		Connection conn = getConnection();
		HashMap<String, Product> goodMap = pDao.selectMap(conn);
		close(conn);
		
		return goodMap;
	}
	
	public HashMap<String, Product> selectNameMap(String pName) throws ProductException {
		Connection conn = getConnection();
		HashMap<String, Product> goodMap = pDao.selectNameMap(conn, pName);
		close(conn);
		
		return goodMap;
	}
	
	public Product selectProduct(String productId) throws ProductException{
		Connection conn = getConnection();
		Product p = pDao.selectProduct(conn, productId);
		close(conn);
		
		return p;
		
	}

}
