package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public void insert(Member m) {
		// TODO Auto-generated method stub
		String sql = "insert into member2 values(?, ?, ?, ?, ?, ?)";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getStu_num());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getDept());
			pstmt.setInt(5, m.getGrade());
			pstmt.setInt(6, m.getType());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Member select(String stu_num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from member2 where stu_num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Member(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getInt(5), rs.getInt(6));
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
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> list = new ArrayList<Member>();
		ResultSet rs = null;
		String sql = "select * from member2";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Member(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getInt(5), rs.getInt(6)));
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
	public void update(Member m) {
		// TODO Auto-generated method stub
		String sql = "update member2 set pwd = ? where stu_num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getStu_num());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(String stu_num) {
		// TODO Auto-generated method stub
		String sql = "delete member where stu_num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, stu_num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
