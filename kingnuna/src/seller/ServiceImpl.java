package seller;

import java.util.ArrayList;

public class ServiceImpl implements Service {
	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addGoods(Seller s) {
		// TODO Auto-generated method stub
		dao.insert(s);
	}

	@Override
	public Seller getGoodsByNum(int num) {
		// TODO Auto-generated method stub
		return dao.selectByNum(num);
	}

	@Override
	public ArrayList<Seller> getGoodsByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.selectByTitle(title);
	}

	@Override
	public ArrayList<Seller> getMyAll(String id) {
		// TODO Auto-generated method stub
		return dao.selectMyAll(id);
	}

	@Override
	public ArrayList<Seller> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editGoods(Seller s) {
		// TODO Auto-generated method stub
		dao.update(s);
	}

	@Override
	public void delGoods(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}


}
