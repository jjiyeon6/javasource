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
		System.out.println("�� �ֹ�");
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
		System.out.println("��ǰ����Ʈ");
//		System.out.println("sno: ");
//		int sno = sc.nextInt();
//		Product p2 = new Product();
//		p2.setSno(sno);
		Product p = new Product();
		if(p!=null) {
			System.out.println(p);
		} else {
			System.out.println("���� ��ǰ");
		}
		
	}
	
	public void printAll() {
//		System.out.println("��ü ���");
		System.out.println("�ֹ�����Ʈ");
		ArrayList<Order> d = orderDao.getAll();
		Iterator<Order> it = d.iterator();	//iterator�ݺ��� �÷��ǿ��� �� ����
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void editProduct() {
		System.out.println("��ǰ ����");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		System.out.println("new price: ");
		int price = sc.nextInt();
		System.out.println("new num: ");
		int num = sc.nextInt();
//		if(dao.edit(new Product(sno, "", price, num))) {
			System.out.println("������ ����ó�� �Ǿ���");
//		} 
	}
	
	public void delProduct() {
//		System.out.println("��ǰ ����");
		System.out.println("�ֹ� ���");
		System.out.println("orderNo: ");
		int orderNo = sc.nextInt();
		if(orderDao.delete(new Order(orderNo, 0, 0))) {
			System.out.println("������ ����ó�� �Ǿ���");
		} 
	}
}
