package common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import product.exception.ProductException;

public class JdbcTemp {
	public static Connection getConnection() throws ProductException{
		Connection conn = null;
		Properties p = new Properties();
		
		try {
			p.load(new FileReader("properties/dbserver.properties"));
			Class.forName(p.getProperty("driver"));
			conn = DriverManager.getConnection
					(p.getProperty("url"), p.getProperty("user"), p.getProperty("pin"));
			
			conn.setAutoCommit(false);
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
		
		return conn;
	}
	
	public static void close(Connection conn) throws ProductException{
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	public static void close(Statement stat) throws ProductException{
		try {
			if(stat != null && !stat.isClosed())
				stat.close();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	public static void close(ResultSet reSet) throws ProductException{
		try {
			if(reSet != null && !reSet.isClosed())
				reSet.close();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	public static void rollback(Connection conn) throws ProductException{
		try {
			if(conn != null && !conn.isClosed())
				conn.rollback();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	public static void commit(Connection conn) throws ProductException{
		try {
			if(conn != null && !conn.isClosed())
				conn.commit();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}
}
