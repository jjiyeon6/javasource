package seller;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerController {
	private Service serviceS;
	
	public SellerController() {
		serviceS = new ServiceImpl();
	}

	//1.판매등록
	public void regist(Scanner sc) {
		System.out.println("판매 등록");
		Seller s = new Seller();
		s.setId(member.Controller.loginId);
		System.out.println("판매제목:");
		s.setTitle(sc.next());
		System.out.println("설명:");
		s.setExplain(sc.next());
		System.out.println("가격:");
		s.setPrice(sc.nextInt());
		System.out.println("수량:");
		s.setQty(sc.nextInt());
		System.out.println(s);
		serviceS.addGoods(s);
		System.out.println("등록되었습니다");
	}
	
	public void printAll(ArrayList<Seller> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	//2.내상품목록
	public void getMyGoods() {
		System.out.println("내가 등록한 상품 목록");
		ArrayList<Seller> list = serviceS.getGoodsById(member.Controller.loginId);
		if(list.size() ==0) {
			System.out.println("검색된 결과가 없습니다");
		} else {
			printAll(list);
		}	
	}
	//3.전체상품목록
	public void getAll() {
		System.out.println("전체 상품 목록");
		ArrayList<Seller> list = serviceS.getAll();
		if(list.size() ==0) {
			System.out.println("검색된 결과가 없습니다");
		} else {
			printAll(list);
		}	
	}
	
	//4.수정
	public void editGoods(Scanner sc) {
		System.out.println("판매 수정");
		System.out.println("수정할 제품번호:");
		Seller s = serviceS.getGoodsByNum(sc.nextInt());
		if(s==null) {
			System.out.println("수정할 제품이 없습니다");
			return;
		} else {
			System.out.println("수정전 판매제품");
			System.out.println(s);
		}
		if(s.getId().equals(member.Controller.loginId)) {
			System.out.println("설명:");
			s.setExplain(sc.next());
			System.out.println("가격:");
			s.setPrice(sc.nextInt());
			System.out.println("수량:");
			s.setQty(sc.nextInt());
			System.out.println(s);
			serviceS.editGoods(s);
			System.out.println("수정되었습니다");
		} else {
			System.out.println("본인이 등록한 제품만 수정할 수 있습니다");
		}
	}
	
	//5.삭제
	public void delGoods(Scanner sc) {
		System.out.println("판매 삭제");
		System.out.println("삭제할 제품번호:");
		int num = sc.nextInt();
		Seller s = serviceS.getGoodsByNum(num);
		if(s==null) {
			System.out.println("삭제할 제품이 없습니다");
			return;
		}
		if(s.getId().equals(member.Controller.loginId)) {
			serviceS.delGoods(num);
			System.out.println("삭제되었습니다");
		} else {
			System.out.println("본인이 등록한 제품만 삭제할 수 있습니다");
		}
	}
	
	//6.제품명으로검색
	public void getGoodsByTitle(Scanner sc) {
		System.out.println("판매명으로 검색");
		System.out.println("title:");
		ArrayList<Seller> list = serviceS.getGoodsByTitle(sc.next());
		if(list.size()==0) {
			System.out.println("검색된 결과가 없습니다");
		} else {
			printAll(list);
		}
	}
	
	//7.번호로검색
	public void getGoodsByNum(Scanner sc) {
		System.out.println("판매번호로 검색");
		System.out.println("num:");
		Seller s = serviceS.getGoodsByNum(sc.nextInt());
		if (s == null) {
			System.out.println("검색된 결과가 없습니다");
		} else {
			System.out.println(s);
		}
	}
}
