package dbtest1;

import java.util.ArrayList;
import java.util.Scanner;

public interface Service {
//	void addProduct(Scanner sc);
//
//	Product getProduct(Scanner sc);
//
//	ArrayList<Product> getAll();
//
//	void editProduct(Scanner sc);
//
//	void delProduct(Scanner sc);
	
	void addProduct(Scanner sc);

	Product getProduct(int sno);

	void getAll();

	void editProduct(Scanner sc);

	void delProduct(Scanner sc);
	
	boolean editNum(int sno, int num);
}
