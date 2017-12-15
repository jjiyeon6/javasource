package grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoImpl implements Dao {

		private Connection conn;
		private dbcon.DBConnect db;

		public DaoImpl() {
			db = dbcon.DBConnect.getInstance();
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
	public void grade_Update(Grade_Dto gd) {
		String sql = "update enrol set score=? where stu_num=? and sub_name=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);							
			
			pstmt.setInt(1, gd.getScore());			
			pstmt.setInt(2, gd.getStu_num());
			pstmt.setString(3, gd.getSub_name());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	

	@Override
	public void grade_delete(Grade_Dto gd) {
		String sql = "update enrol set score=null where stu_num=? and sub_name=?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);									
			pstmt.setInt(1, gd.getStu_num());
			pstmt.setString(3, gd.getSub_name());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
