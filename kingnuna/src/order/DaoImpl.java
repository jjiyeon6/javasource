package order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbtest1.DBConnect;

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
	public void insert(Order o) {
		// TODO Auto-generated method stub
		String sql = "insert into myorder(order_num,sno,num,o_date,result) values(seq_myorder.nextval,?,?,sysdate,'N')";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, o.getSno());
			pstmt.setInt(2, o.getNum());
//			pstmt.setInt(3, o.getTotal_price());
//			pstmt.setString(3, o.getResult());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Order select(int order_num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from myorder where order_num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, order_num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Order(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	@Override
	public ArrayList<Order> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Order> list = new ArrayList<Order>();
		ResultSet rs = null;
		String sql = "select * from myorder";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return list;
	}

	@Override
	public void editResult(int order_num, String str) {
		// TODO Auto-generated method stub
		String sql = "update myorder set num = ?, result = ? where order_num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1,o.getNum());
//			pstmt.setInt(2, o.getTotal_price());
//			pstmt.setDate(3, o.getO_date());
			
//			pstmt.setInt(1, num);
			pstmt.setString(2, str);
			pstmt.setInt(3, order_num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}

	@Override
	public void delete(int order_num) {
		// TODO Auto-generated method stub
		String sql = "delete from myorder where order_num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, order_num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}
