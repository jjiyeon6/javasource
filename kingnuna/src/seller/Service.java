package seller;

import java.util.ArrayList;

public interface Service {
	void addGoods(Seller s);
	Seller getGoodsByNum(int num);
	ArrayList<Seller> getGoodsByTitle(String title);
	ArrayList<Seller> getMyAll(String id);
	ArrayList<Seller> getAll();
	void editGoods(Seller s);
	void delGoods(int num);
}
