package subject;

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
	public void insert(Subject_Dto sd) {
		 String sql = "insert into subject values(?, ?, ?, ?, ?, ?, ?)";
	      connect();
	      PreparedStatement pstmt = null;
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, sd.getSub_num());
	         pstmt.setString(2, sd.getSub_name());
	         pstmt.setString(3, sd.getPro_name());
	         pstmt.setString(4, sd.getSpe_name());
	         pstmt.setString(5, sd.getTime());
	         pstmt.setString(6, sd.getDay());
	         pstmt.setString(7, sd.getWww());
	         pstmt.executeUpdate();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	         disconnect();
	      }
	   }


	@Override
	public Subject_Dto select(int sub_num) {
		ResultSet rs = null;//결과를 넣기 위해 만들어진 변수?
		String sql = "select * from subject where sub_num=?";//여기서 널포인트 예외가 생기면 그냥 db연결이 안된거
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sub_num);
			rs = pstmt.executeQuery();//검색결과를 rs에 던져줌 검색은 executeQuery ddt(insert, update, delete)는 executeUpdate
			if(rs.next()) {//rs.next 는 다음줄로 이동시켜주는 메소드 while이 아닌 이유는 1개만 불러올것이기떄문에
				return new Subject_Dto(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				//int num2 = rs.getInt(1),일일히 매칭 
				//board x = new board(num2, date, id , pwd, title, content)
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	@Override
	public ArrayList<Subject_Dto> selectAll() {
		ArrayList<Subject_Dto> list = new ArrayList<Subject_Dto>();
		ResultSet rs = null;
		String sql = "select * from subject";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Subject_Dto(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	@Override
	public void editsubject(Subject_Dto sd) {
		String sql = "update subject set sub_name=?, pro_name=?, spe_name =?, time =?, day =? where sub_num=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);							
			
			pstmt.setString(1, sd.getSub_name());
			pstmt.setString(2, sd.getPro_name());
			pstmt.setString(3, sd.getSpe_name());
			pstmt.setString(4, sd.getTime());
			pstmt.setString(5, sd.getDay());
			pstmt.setInt(6, sd.getSub_num());
	
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int sub_num) {
		// TODO Auto-generated method stub
		String sql = "delete subject where sub_num=?";
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


