package product2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

	private Dao dao;
	private Scanner sc;
	
	public Service(Scanner sc) {
		dao = new Dao();
		this.sc = sc;
	}
	
	public void addProduct() {
		System.out.println("�� ��ǰ �߰�");
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("price: ");
		int price = sc.nextInt();
		System.out.println("num: ");
		int num = sc.nextInt();
		
		dao.add(new Product(name, price, num));
	}
	
	public void getProduct() {
		System.out.println("��ǰ �˻�");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		Product p2 = new Product();
		p2.setSno(sno);
		Product p = dao.get(p2);
		if(p!=null) {
			System.out.println(p);
		} else {
			System.out.println("���� ��ǰ");
		}
		
	}
	
	public void printAll() {
		System.out.println("��ü ���");
		ArrayList<Product> d = dao.getAll();
		Iterator<Product> it = d.iterator();	//iterator�ݺ��� �÷��ǿ��� �� ����
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
		if(dao.edit(new Product(sno, "", price, num))) {
			System.out.println("������ ����ó�� �Ǿ���");
		} 
	}
	
	public void delProduct() {
		System.out.println("��ǰ ����");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		if(dao.delete(new Product(sno, "", 0, 0))) {
			System.out.println("������ ����ó�� �Ǿ���");
		} 
	}
}
