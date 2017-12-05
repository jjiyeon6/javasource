package order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceImpl implements Service {
	
	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("�ֹ� �ۼ�");
		System.out.println("�ֹ��� ��ǰ ��ȣ");
		Order o = new Order();
		o.setSno(sc.nextInt());
		System.out.println("�ֹ�����");
		o.setNum(sc.nextInt());
		dao.insert(o);
		System.out.println("��ϵǾ����ϴ�.");
	}

	@Override
	public Order getOrder(int order_num) {
		// TODO Auto-generated method stub
		Order o = dao.select(order_num);
		if(o==null) {
			System.out.println("�ֹ������� �����ϴ�.");
		} else {
			System.out.println(o);
		}
		return o;
	}

	@Override
	public void getOrders() {
		// TODO Auto-generated method stub
		System.out.println("�ֹ���ü��ȸ");
		ArrayList<Order> list = dao.selectAll();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		Iterator<Order> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Override
	public void makeResult(int order_num) {
		// TODO Auto-generated method stub
//		System.out.println("�ֹ� ����");
//		System.out.println("order_num:");
//		int order_num = sc.nextInt();
//		Order o = dao.select(order_num);
//		if(o==null) {
//			System.out.println("�ֹ������� �����ϴ�.");
//		} else {
//			System.out.println(o);
//			System.out.println("�� ����");
//			o.setNum(sc.nextInt());
//			System.out.println("��������");
//			o.setResult(sc.next());
//			System.out.println(o);
//			dao.editResult(o.getNum(), o.getResult());
//			System.out.println(o);
//			System.out.println("�����Ǿ����ϴ�.");
//		}
		System.out.println("�����Ϸ�");
		dao.editResult(order_num, "Y");

	}

	@Override
	public void delOrder(int order_num) {
		// TODO Auto-generated method stub
		System.out.println("�ֹ� ���");
//		System.out.println("order_num:");
//		int order_num = sc.nextInt();
//		dao.delete(order_num);
//		dao.delete(sc.nextInt());
		dao.delete(order_num);
	}

}
