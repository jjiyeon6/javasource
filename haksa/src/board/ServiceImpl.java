package board;

import java.util.ArrayList;

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
		return dao.select(num);
	}

	@Override
	public ArrayList<Board> getArticleByWriter(String stu_num) {
		// TODO Auto-generated method stub
		return dao.selectByWriter(stu_num);
	}
	
	@Override
	public ArrayList<Board> getArticleByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.selectByTitle(title);
	}

	@Override
	public ArrayList<Board> getAll() {
		// TODO Auto-generated method stub
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


}
