package dbtest1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public void insert(Product p) {
		// TODO Auto-generated method stub
		String sql = "insert into product values(seq_product.nextval, ?, ?, ?)";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getNum());
			pstmt.executeUpdate();//db�� ����
//			pstmt.executeQuery();//�˻��ÿ� ���
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Product select(int sno) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from product where sno = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sno);
			rs = pstmt.executeQuery();//����� ����� rs�� ��´�.
			if(rs.next()) {//sno�� primary key ������ ����ũ. for���� �ƴ϶� next()�� ���پ� �о Product��ü�� ��� ��ȯ
				return new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
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
	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Product> list = new ArrayList<Product>();
		ResultSet rs = null;
		String sql = "select * from product";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
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
	public void update(Product p) {
		// TODO Auto-generated method stub
		String sql = "update product set price = ?, num = ?  where sno = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, p.getPrice());
			pstmt.setInt(2, p.getNum());
			pstmt.setInt(3, p.getSno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int sno) {
		// TODO Auto-generated method stub
		String sql = "delete from product where sno = ?";
		connect();
		PreparedStatement pstmt = null;
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, sno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
