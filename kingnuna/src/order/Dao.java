package order;

import java.util.ArrayList;

public interface Dao {
	void insert(Order o);

	Order select(int order_num);

	ArrayList<Order> selectAll();

	void editResult(int order_num, String str);

	void delete(int order_num);
}
