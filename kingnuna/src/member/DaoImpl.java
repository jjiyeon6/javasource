package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public void insert(Member m) {
		// TODO Auto-generated method stub
		String sql = "insert into member values(?,?,?,?,?)";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			pstmt.setInt(5, m.getType());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from member where id = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
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
	public void update(Member m) {
		// TODO Auto-generated method stub
		String sql = "update member set pwd = ? where id = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from member where id = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
