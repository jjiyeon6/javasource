package order;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl implements Service {
	
	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주문 등록");
		System.out.println("sno:");
		int sno = sc.nextInt();
		System.out.println("수량");
		int num = sc.nextInt();
		dao.insert(new Order(0, sno, num));
		System.out.println("등록되었습니다.");
	}

	@Override
	public void getOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주문 검색");
		System.out.println("order_num:");
		int order_num = sc.nextInt();
		Order o = dao.select(order_num);
		if(o==null) {
			System.out.println("주문내역이 없습니다.");
		} else {
			System.out.println(o);
		}
	}

	@Override
	public void getOrders() {
		// TODO Auto-generated method stub
		System.out.println("주문 목록");
		ArrayList<Order> list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@Override
	public void makeResult(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주문 수정");
		System.out.println("order_num:");
		int order_num = sc.nextInt();
		Order o = dao.select(order_num);
		if(o==null) {
			System.out.println("주문내역이 없습니다.");
		} else {
			System.out.println(o);
			System.out.println("새 수량");
			o.setNum(sc.nextInt());
			System.out.println("결제유무");
			o.setResult(sc.next());
			System.out.println(o);
			dao.editResult(o.getNum(), o.getResult());
			System.out.println(o);
			System.out.println("수정되었습니다.");
		}

	}

	@Override
	public void delOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주문 삭제");
		System.out.println("order_num:");
		int order_num = sc.nextInt();
		dao.delete(order_num);
	}

}
