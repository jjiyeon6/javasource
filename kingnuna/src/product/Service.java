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
		Product p = dao.get(sno);
		if(p!=null) {
			System.out.println(p);
		} else {
			System.out.println("없는 제품");
		}
		
	}
	
	public void printAll() {
		System.out.println("전체 출력");
		Product[] d = dao.getAll();
		int cnt = dao.getCnt();
		for(int i=0; i<cnt; i++) {
			System.out.println(d[i]);
		}
	}
	
	public void editProduct() {
		System.out.println("제품 수정");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		Product p = dao.get(sno);
		System.out.println("new price: ");
		int price = sc.nextInt();
		System.out.println("new num: ");
		int num = sc.nextInt();
		if(p!=null) {
			dao.edit(new Product(sno, "", price, num));
			System.out.println("수정이 정상처리 되었음");
		} else {
			System.out.println("수정할 제품이 없습니다.");
		}
	}
	
	public void delProduct() {
		System.out.println("제품 삭제");
		System.out.println("sno: ");
		int sno = sc.nextInt();
		Product p = dao.get(sno);
		if(p!=null) {
			dao.delete(sno);
			System.out.println("삭제가 정상처리 되었음");
		} else {
			System.out.println("삭제할 제품이 없습니다.");
		}
	}
}
