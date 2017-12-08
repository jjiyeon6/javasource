package seller;

import java.util.ArrayList;

public interface Dao {
	void insert(Seller s);
	Seller selectByNum(int num);
	ArrayList<Seller> selectByTitle(String title);
	ArrayList<Seller> selectMyAll(String id);
	ArrayList<Seller> selectAll();
	void update(Seller s);
	void delete(int num);
}
