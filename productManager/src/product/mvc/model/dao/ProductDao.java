package product.mvc.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import product.exception.ProductException;
import product.mvc.model.vo.Product;
import static common.JdbcTemp.*;

public class ProductDao {
	private Properties pr = new Properties();
	
	public ProductDao() throws ProductException{
		try {
			pr.load(new FileReader("properties/query.properties"));
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	public int insertProduct(Connection conn, Product p) throws ProductException{
		int re = 0;
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(pr.getProperty("insert"));
			
			stat.setString(1, p.getProductId());
			stat.setString(2, p.getpName());
			stat.setInt(3, p.getPrice());
			stat.setString(4, p.getDescription());
			
			re = stat.executeUpdate();
			if(re <= 0) {
				rollback(conn);
				throw new ProductException("새 제품 목록 추가에 실패했습니다.");
			}
		} catch (Exception e) {
			rollback(conn);
			throw new ProductException(e.getMessage());
		} finally {
			close(stat);
		}
		return re;
	}
	
	public int updateBook(Connection conn, Product p) throws ProductException{
		int re = 0;
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(pr.getProperty("update"));
			
			stat.setInt(1, p.getPrice());
			stat.setString(2, p.getProductId());
			
			re = stat.executeUpdate();
			if(re <= 0) {
				rollback(conn);
				throw new ProductException(p.getProductId() + "의 제품이 없습니다.");
			}
		} catch (Exception e) {
			rollback(conn);
			throw new ProductException(e.getMessage());
		} finally {
			close(stat);
		}
		return re;
	} 

	public int deleteProduct(Connection conn, String productId) throws ProductException{
		int re = 0;
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(pr.getProperty("delete"));
			stat.setString(1, productId);
			re = stat.executeUpdate();
			
			if(re <= 0) {
				rollback(conn);
				throw new ProductException(productId + "제품을 목록에서 삭제하지 못했습니다. 확인 후 다시시도하세요");
			}
		} catch (Exception e) {
			rollback(conn);
			throw new ProductException(e.getMessage());
		} finally {
			close(stat);
		}
		return re;
	}
	
	public ArrayList<Product> selectList(Connection conn) throws ProductException{
		ArrayList<Product> goodList = new ArrayList<>();
		Statement stat = null;
		ResultSet reSet = null;
		
		try {
			stat = conn.createStatement();
			reSet = stat.executeQuery(pr.getProperty("selectAll"));
			while(reSet.next()) {
				Product p = new Product();
				p.setProductId(reSet.getString("product_id"));
				p.setpName(reSet.getString("p_name"));
				p.setPrice(reSet.getInt("price"));
				p.setDescription(reSet.getString("description"));
				
				goodList.add(p);
			}
			if(goodList.size() == 0)
				throw new ProductException("조회된 제품 목록이 없습니다.");
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(reSet);
			close(stat);
		}
		return goodList;
	}

	public ArrayList<Product> selectNameList(Connection conn, String pName) throws ProductException {
		ArrayList<Product> goodList = new ArrayList<>();
		PreparedStatement stat = null;
		ResultSet reSet = null;
		try {
			stat = conn.prepareStatement(pr.getProperty("selectOneName"));
			stat.setString(1, "%" + pName + "%");
			reSet = stat.executeQuery();
			
			while(reSet.next()) {
				Product p = new Product();
				p.setProductId(reSet.getString("product_id"));
				p.setpName(reSet.getString("p_name"));
				p.setPrice(reSet.getInt("price"));
				p.setDescription(reSet.getString("description"));
				
				goodList.add(p);
			}
			if(goodList.size() == 0)
				throw new ProductException(pName + " 제품이 없습니다.");
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(reSet);
			close(stat);
		}
		return goodList;
	}

	public HashMap<String, Product> selectMap(Connection conn) throws ProductException {
		HashMap<String, Product> goodMap = new HashMap<>();
		Statement stat = null;
		ResultSet reSet = null;
		try {
			stat = conn.createStatement();
			reSet = stat.executeQuery(pr.getProperty("selectAll"));
			
			while(reSet.next()) {
				Product p = new Product();
				p.setProductId(reSet.getString("product_id"));
				p.setpName(reSet.getString("p_name"));
				p.setPrice(reSet.getInt("price"));
				p.setDescription(reSet.getString("description"));
				
				goodMap.put(p.getProductId(), p);
			}
			if(goodMap.size() == 0)
				throw new ProductException("조회된 제품이 없습니다.");
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(reSet);
			close(stat);
		}
		return goodMap;
	}
	
	public HashMap<String, Product> selectNameMap(Connection conn, String pName) throws ProductException{
		HashMap<String, Product> goodMap = new HashMap<> ();
		PreparedStatement stat = null;
		ResultSet reSet = null;
		
		try {
			stat = conn.prepareStatement(pr.getProperty("selectOneName"));
			stat.setString(1, "%" + pName + "%");
			reSet = stat.executeQuery();
			
			while(reSet.next()) {
				Product p = new Product();
				p.setProductId(reSet.getString("product_id"));
				p.setpName(reSet.getString("p_name"));
				p.setPrice(reSet.getInt("price"));
				p.setDescription(reSet.getString("description"));
				
				goodMap.put(p.getProductId(), p);
			}
			
			if(goodMap.size() == 0)
				throw new ProductException(pName + "제품이 없습니다.");
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(reSet);
			close(stat);
		}
		return goodMap;
	}
	
	public Product selectProduct(Connection conn, String productId) throws ProductException {
		Product p = null;
		PreparedStatement stat = null;
		ResultSet reSet = null;
		try {
			stat = conn.prepareStatement(pr.getProperty("selectOneId"));
			stat.setString(1, productId);
			reSet = stat.executeQuery();
			
			while(reSet.next()) {
				p = new Product();
				p.setProductId(reSet.getString("product_id"));
				p.setpName(reSet.getString("p_name"));
				p.setPrice(reSet.getInt("price"));
				p.setDescription(reSet.getString("description"));
			}
			if(p == null)
				throw new ProductException(productId + " 제품이 없습니다.");
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(reSet);
			close(stat);
		}
		return p;
	}
}
