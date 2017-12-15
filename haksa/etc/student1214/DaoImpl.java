package student;

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
	public void insert(Student s) {
		String sql = "insert into enrol values(?, ?, ?, ?, ?)";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getStu_num());
			pstmt.setString(2, s.getName());
			pstmt.setInt(3, s.getSub_num());
			pstmt.setString(4, s.getSub_name());
			pstmt.setInt(5, s.getScore());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Student selectNum(String stu_num) {
		ResultSet rs = null;
		String sql = "select * from enrol where stu_num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
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
	public ArrayList<Student> selectStu(String stu_num) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		ResultSet rs = null;
		String sql = "select * from enrol where stu_num=? order by score";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				list.add(new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5)));
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
	public ArrayList<Student> selectScore(String stu_num) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		ResultSet rs = null;
		String sql = "select * from enrol where stu_num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5)));
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
	public ArrayList<Student> selectSub(String stu_num) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		ResultSet rs = null;
		String sql = "select stu_num,name,sub_num,sub_name from enrol where stu_num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),0));
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
	public void delete(int sub_num) {
		// TODO Auto-generated method stub
		String sql = "delete enrol where sub_num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sub_num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}



}
