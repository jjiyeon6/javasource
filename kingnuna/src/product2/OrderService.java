package product2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OrderService {

	private OrderDao orderDao;
	private Dao dao;
	private Scanner sc;
	
	public OrderService(Scanner sc) {
		orderDao = new OrderDao();
		dao = new Dao();
		this.sc = sc;
	}
	
	public void addOrder() {
		System.out.println("새 주문");
		System.out.println("sno: ");
//		Product p = new Product();
		
//		p.getSno();
//		o.setSno(p.getSno());
//		System.out.println(p);
		
//		System.out.println("sno: ");
//		int sno = sc.nextInt();
		System.out.println("orderNum: ");
		int orderNum = sc.nextInt();
		
//		dao.add(new Order(, orderNum));
//		System.out.println();
	}
	
	public void getProduct() {
		System.out.println("제품리스트");
//		System.out.println("sno: ");
//		int sno = sc.nextInt();
//		Product p2 = new Product();
//		p2.setSno(sno);
		Product p = new Product();
		if(p!=null) {
			System.out.println(p);
		} else {
			System.out.println("없는 제품");
		}
		
	}
	
	public void printAll() {
//		System.out.println("전체 출력");
		System.out.println("주문리스트");
		ArrayList<Order> d = orderDao.getAll();
		Iterator<Order> it = d.iterator();	//iterator반복자 컬렉션에는 다 있음
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void editProduct() {
		System.out.println("제품 수정");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		System.out.println("new price: ");
		int price = sc.nextInt();
		System.out.println("new num: ");
		int num = sc.nextInt();
//		if(dao.edit(new Product(sno, "", price, num))) {
			System.out.println("수정이 정상처리 되었음");
//		} 
	}
	
	public void delProduct() {
//		System.out.println("제품 삭제");
		System.out.println("주문 취소");
		System.out.println("orderNo: ");
		int orderNo = sc.nextInt();
		if(orderDao.delete(new Order(orderNo, 0, 0))) {
			System.out.println("삭제가 정상처리 되었음");
		} 
	}
}
