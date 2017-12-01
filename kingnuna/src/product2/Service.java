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
		System.out.println("새 제품 추가");
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("price: ");
		int price = sc.nextInt();
		System.out.println("num: ");
		int num = sc.nextInt();
		
		dao.add(new Product(name, price, num));
	}
	
	public void getProduct() {
		System.out.println("제품 검색");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		Product p2 = new Product();
		p2.setSno(sno);
		Product p = dao.get(p2);
		if(p!=null) {
			System.out.println(p);
		} else {
			System.out.println("없는 제품");
		}
		
	}
	
	public void printAll() {
		System.out.println("전체 출력");
		ArrayList<Product> d = dao.getAll();
		Iterator<Product> it = d.iterator();	//iterator반복자 컬렉션에는 다 있음
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
		if(dao.edit(new Product(sno, "", price, num))) {
			System.out.println("수정이 정상처리 되었음");
		} 
	}
	
	public void delProduct() {
		System.out.println("제품 삭제");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		if(dao.delete(new Product(sno, "", 0, 0))) {
			System.out.println("삭제가 정상처리 되었음");
		} 
	}
}
