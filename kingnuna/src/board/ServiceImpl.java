package board;

import java.util.ArrayList;
import java.util.Iterator;

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
//		Board b = dao.select(num);
//		return b;
		return dao.select(num);
		
	}

	@Override
	public ArrayList<Board> getAll() {
		// TODO Auto-generated method stub
//		dao.selectAll();
		
//		return null;
		return dao.selectAll();
		
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

	@Override
	public ArrayList<Board> getArticleByWriter(String id) {
		// TODO Auto-generated method stub
		return dao.selectByWriter(id);
	}

	@Override
	public ArrayList<Board> getArticleByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.selectByTitle(title);
	}

}
