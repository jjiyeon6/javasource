/**
 * 1.JDBC ����̹� �ε� (Class.forName())
 * 2.Connection Ŭ����
 * 3.SQL ���� (Statement Ŭ����)
 * 4.ResultSet Ŭ����
 * 5.Close() �ڿ� ��ȯ 
 */
package jdbc;

//Import required packages
import java.sql.*;

public class FirstExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	
	// Database credentials
	static final String DB_USER = "ora_user";
	static final String DB_PW = "yuk";
	
	public static void main(String[] args) {

		Connection conn = null;//����
		Statement stmt = null;//SQL
		
		try {
			
			//1.JDBC ����̹� �ε� (Class.forName())
			Class.forName(JDBC_DRIVER);
			
			//2.Connection Ŭ����
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
			
			//3.SQL ���� (Statement Ŭ����)
			String sql = "SELECT empno,ename FROM EMP";
			stmt = conn.createStatement();//statement
			//4.ResultSet Ŭ����
			ResultSet rs = stmt.executeQuery(sql);
			
			// Extract data from result set
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				
				System.out.print("empno : " + empno);
				System.out.println(", ename : " + ename);
			}
		
			//5.Close() �ڿ� ��ȯ 
			rs.close();
			stmt.close();
			conn.close();
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException se) {}
			
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException se) {}
			
		}
		
	}

}
