package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

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
	public void insert(Board b) {
		// TODO Auto-generated method stub
		String sql = "insert into board values(seq_board.nextval,sysdate,?,?,?,?)";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getId());
			pstmt.setString(2, b.getPwd());
			pstmt.setString(3, b.getTitle());
			pstmt.setString(4, b.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Board select(int num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from board where num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int num2 = rs.getInt(1);
				Date date = rs.getDate(2);
				String id = rs.getString(3);
				String pwd = rs.getString(4);
				String title = rs.getString(5);
				String content = rs.getString(6);
				Board x = new Board(num2, date, id, pwd, title, content);
				return x;
//				return new Board(num2, date, id, pwd, title, content);
//				return new Board(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
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
	public ArrayList<Board> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		ResultSet rs = null;
		String sql = "select * from board";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
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
	public void update(Board b) {
		// TODO Auto-generated method stub
		String sql = "update board set w_date = sysdate, title = ?, content = ? where num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getNum());
//			pstmt.setString(4, b.getPwd());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql = "delete from board where num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public ArrayList<Board> selectByWriter(String id) {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		ResultSet rs = null;
		String sql = "select * from board where id = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
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
	public ArrayList<Board> selectByTitle(String title) {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		ResultSet rs = null;
		String sql = "select * from board where title like '%"+title+"%'";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
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
