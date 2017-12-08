package seller;

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
	public void insert(Seller s) {
		// TODO Auto-generated method stub
		String sql = "insert into seller values(seq_seller.nextval,?,?,?,?,?)";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getId());
			pstmt.setString(2, s.getTitle());
			pstmt.setString(3, s.getExplain());
			pstmt.setInt(4, s.getPrice());
			pstmt.setInt(5, s.getQty());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Seller selectByNum(int num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from seller where num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Seller(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Seller> selectByTitle(String title) {
		// TODO Auto-generated method stub
		ArrayList<Seller> list = new ArrayList<Seller>();
		ResultSet rs = null;
		String sql = "select * from seller where title like '%"+title+"%'";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Seller(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Seller> selectMyAll(String id) {
		// TODO Auto-generated method stub
		ArrayList<Seller> list = new ArrayList<Seller>();
		ResultSet rs = null;
		String sql = "select num, title, price from seller where id = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Seller(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public ArrayList<Seller> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Seller> list = new ArrayList<Seller>();
		ResultSet rs = null;
		String sql = "select num, title, price from seller";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Seller(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Seller s) {
		// TODO Auto-generated method stub
		String sql = "update seller set explain = ?, price = ?, qty = ? where num = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getExplain());
			pstmt.setInt(2, s.getPrice());
			pstmt.setInt(3, s.getQty());
			pstmt.setInt(4, s.getNum());
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
		String sql = "delete from seller where num = ?";
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


}
