package board;

import java.util.ArrayList;
import java.util.Iterator;

import dbtest1.Product;
import order.Order;

public class ServiceImpl implements Service {
	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addArticle(Board b) {
		// TODO Auto-generated method stub
		dao.insert(b);
	}

	@Override
	public Board getArticle(int num) {
		// TODO Auto-generated method stub
		Board b = dao.select(num);
		return b;
	}

	@Override
	public ArrayList<Board> getAll() {
		// TODO Auto-generated method stub
//		dao.selectAll();
		
		ArrayList<Board> list = dao.selectAll();
		Iterator<Board> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		return null;
		
	}

	@Override
	public void editArticle(Board b) {
		// TODO Auto-generated method stub
		dao.update(b);
	}

	@Override
	public void delArticle(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}

}
