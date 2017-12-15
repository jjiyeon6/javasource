package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:orcl";

	//싱글톤??

	//생성자
	private DBConnect() {
		// TODO Auto-generated constructor stub
		
	}

	//내부에서 만든 객체를 반환해주는 
	public static DBConnect getInstance() {
		return db;
	}

	public Connection getConnection() {
		try {
			//드라이버로드
			Class.forName(jdbc_driver);
			//연결
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
