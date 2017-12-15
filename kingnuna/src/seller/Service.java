package seller;

import java.util.ArrayList;

public interface Service {
	void addGoods(Seller s);
	Seller getGoodsByNum(int num);
	ArrayList<Seller> getGoodsByTitle(String title);
	ArrayList<Seller> getGoodsById(String id);
	ArrayList<Seller> getAll();
	void editGoods(Seller s);
	void editQuantity(int num, int qty);
	void delGoods(int num);
}
