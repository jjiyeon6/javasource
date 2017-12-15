package board;

import java.sql.Connection;
import java.sql.Date;
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
	public void insert(Board b) {
		// TODO Auto-generated method stub
		String sql = "insert into board2 values(seq_board2.nextval, sysdate, ?, ?, ?, ?, ?)";
		connect();//db����
		PreparedStatement pstmt = null;
		try {
			//Ŀ�ؼ� ��ü�κ��� PreparedStatement�� ����. ������ sql���� �Ķ���ͷ� ����.
			pstmt = conn.prepareStatement(sql);
			//sql���� ?�� �������� ��Ī
			pstmt.setString(1, b.getStu_num());
			pstmt.setString(2, b.getW_pwd());
			pstmt.setString(3, b.getTitle());
			pstmt.setString(4, b.getContent());
			pstmt.setString(5, b.getW_file());
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
		String sql = "select * from board2 where num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int num2 = rs.getInt(1);//�۹�ȣ
				Date date = rs.getDate(2);//�ۼ���
				String stu_num = rs.getString(3);//�ۼ���
				String pwd = rs.getString(4);//�ۺ�й�ȣ
				String title = rs.getString(5);//������
				String content = rs.getString(6);//�۳���
				String w_file = rs.getString(7);
				Board x = new Board(num2, date, stu_num, pwd, title, content, w_file);
				return x;
				//return new Board(rs.getInt(1), rs.getDate(2), rs.getString(3),
				//rs.getString(4),rs.getString(5),rs.getString(6));
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
	public ArrayList<Board> selectByWriter(String stu_num) {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		ResultSet rs = null;
		String sql = "select * from board2 where stu_num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs = pstmt.executeQuery();
			while(rs.next()) {				
				list.add(new Board(rs.getInt(1), rs.getDate(2), rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
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
		String sql = "select * from board2 where title like '%"+title+"%'";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {				
				list.add(new Board(rs.getInt(1), rs.getDate(2), rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
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
	public ArrayList<Board> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		ResultSet rs = null;
		String sql = "select * from board2";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {				
				list.add(new Board(rs.getInt(1), rs.getDate(2), rs.getString(3),
				rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
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
		String sql = "update board2 set w_date=sysdate, title=?, content=? where stu_num=?";
		connect();//db����
		PreparedStatement pstmt = null;
		try {
			//Ŀ�ؼ� ��ü�κ��� PreparedStatement�� ����. ������ sql���� �Ķ���ͷ� ����.
			pstmt = conn.prepareStatement(sql);
			//sql���� ?�� �������� ��Ī			
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getStu_num());
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
		String sql = "delete board2 where num=?";
		connect();//db����
		PreparedStatement pstmt = null;
		try {
			//Ŀ�ؼ� ��ü�κ��� PreparedStatement�� ����. ������ sql���� �Ķ���ͷ� ����.
			pstmt = conn.prepareStatement(sql);
			//sql���� ?�� �������� ��Ī			
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}


}
