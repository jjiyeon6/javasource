package order;

import java.util.ArrayList;
import java.util.Scanner;

public interface Service {
//	void addOrder(Scanner sc);
//
//	Order getOrder(Scanner sc);
//
//	ArrayList<Order> getOrders();
//
//	void makeResult(Scanner sc);//결제유무
//
//	void delOrder(Scanner sc);
	
	void addOrder(Scanner sc);

	Order getOrder(int order_num);

	void getOrders();

	void makeResult(int order_num);//결제유무

	void delOrder(int order_num);
}
