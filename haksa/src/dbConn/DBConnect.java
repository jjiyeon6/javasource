package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:orcl";

	//�̱���??

	//������
	private DBConnect() {
		// TODO Auto-generated constructor stub
		
	}

	//���ο��� ���� ��ü�� ��ȯ���ִ� 
	public static DBConnect getInstance() {
		return db;
	}

	public Connection getConnection() {
		try {
			//����̹��ε�
			Class.forName(jdbc_driver);
			//����
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
