package product;

import java.util.Scanner;

public class Service {

	private Dao dao;
	private Scanner sc;
	
	public Service(Product[] datas, Scanner sc) {
		dao = new Dao(datas);
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
		Product p = dao.get(sno);
		if(p!=null) {
			System.out.println(p);
		} else {
			System.out.println("���� ��ǰ");
		}
		
	}
	
	public void printAll() {
		System.out.println("��ü ���");
		Product[] d = dao.getAll();
		int cnt = dao.getCnt();
		for(int i=0; i<cnt; i++) {
			System.out.println(d[i]);
		}
	}
	
	public void editProduct() {
		
	}
	
	public void delProduct() {
		
	}
}
