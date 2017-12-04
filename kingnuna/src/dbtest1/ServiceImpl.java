package dbtest1;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl implements Service {

	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ���");
		System.out.println("��ǰ��");
		String name = sc.next();
		System.out.println("����");
		int price = sc.nextInt();
		System.out.println("����");
		int num = sc.nextInt();
		dao.insert(new Product(0, name, price, num));
	}

	@Override
	public void getProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ �˻�");
		System.out.println("sno:");
		int sno = sc.nextInt();
		Product p = dao.select(sno);
		if (p == null) {
			System.out.println("����");
		} else {
			System.out.println(p);
		}

	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ ���");
		ArrayList<Product> list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@Override
	public void editProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ ����");
		System.out.println("sno:");
		int sno = sc.nextInt();
		Product p = dao.select(sno);
		if (p == null) {
			System.out.println("����");
		} else {
			System.out.println(p);
			System.out.println("�� ����");
			p.setPrice(sc.nextInt());
			System.out.println("�� ����");
			p.setNum(sc.nextInt());
			dao.update(p);
		}
	}

	@Override
	public void delProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ ����");
		System.out.println("sno:");
		int sno = sc.nextInt();
		dao.delete(sno);
	}

}
