package dbtest1;

import java.util.ArrayList;

public interface Dao {
	void insert(Product p);

	Product select(int sno);

	ArrayList<Product> selectAll();

	void update(Product p);

	void delete(int sno);
	
	void updateNum(int sno, int num);
}
