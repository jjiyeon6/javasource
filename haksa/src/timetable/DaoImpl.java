package timetable;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import board.Board;
import dbConn.DBConnect;

public class DaoImpl implements Dao {
	private Connection conn;
	private DBConnect db;

	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	public void connect() {
		conn = db.getConnection();
	}

	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Timetable> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Timetable> list = new ArrayList<Timetable>();
		ResultSet rs = null;
		String sql = "SELECT  GUBN_1 \" \"\r\n" + 
				"        , DECODE(day, 2, GUBN_2) \"mon\"\r\n" + 
				"        , DECODE(day, 3, GUBN_2) \"tue\"\r\n" + 
				"        , DECODE(day, 4, GUBN_2) \"wed\"\r\n" + 
				"        , DECODE(day, 5, GUBN_2) \"thu\"\r\n" + 
				"        , DECODE(day, 6, GUBN_2) \"fri\" \r\n" + 
				"  FROM  (SELECT a.t_no\r\n" + 
				"                , a.t_name GUBN_1\r\n" + 
				"                , b.sub_name GUBN_2\r\n" + 
				"                , b.sub_num, b.time, b.day, e.sub_num \r\n" + 
				"           FROM t_table A, subject B, enrol e\r\n" + 
				"          WHERE A.T_NO = B.time(+)\r\n" + 
				"            and b.sub_num = e.sub_num(+)\r\n" + 
				"            and e.sub_num is not null) \r\n" + 
				"ORDER BY T_NO, GUBN_1, day";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Timetable(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}
