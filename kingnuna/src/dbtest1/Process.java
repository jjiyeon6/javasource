package dbtest1;

import java.util.Scanner;

import order.Order;

public class Process {
	private Service serviceP; // 공장서비스
	private order.Service serviceO; // 편의점서비스

	public Process() {
		serviceP = new ServiceImpl();
		serviceO = new order.ServiceImpl();
	}

	public String checkResult(Scanner sc) {
		System.out.println("결제");
		System.out.println("결제할 주문번호");
		int order_num = sc.nextInt();
		Order o = serviceO.getOrder(order_num);
		if (o != null && o.getResult().equals("N")) {
			if(serviceP.editNum(o.getSno(), o.getNum())) {//주문수량과 재고 비교
				serviceO.makeResult(order_num);
			} else {
				System.out.println("수량부족으로 주문취소");
			}
		} else {
			System.out.println("없거나 이미 결제한 주문임");
		}
		return "false";
	}
	
	public void delOrder(Scanner sc) {
		System.out.println("삭제");
		System.out.println("삭제할 주문번호");
		int order_num = sc.nextInt();
		Order o = serviceO.getOrder(order_num);
		if( o!=null && o.getResult().equals("N")) {
			serviceO.delOrder(order_num);
		} else {
			System.out.println("없거나 이미 결제하여 취소 불가");
		}
	}

	public void menuO(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		int order_num = 0;
		while (flag) {
			System.out.println("1.주문 2.주문검색 3.수정 4.삭제 5.주문목록 6.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				serviceO.addOrder(sc);
				break;
			case 2:
				System.out.println("주문조회");
				System.out.println("주문번호");
				order_num = sc.nextInt();
				System.out.println(serviceO.getOrder(order_num));
				break;
			case 3:
				checkResult(sc);
//				serviceO.makeResult(sc);
				break;
			case 4:
				delOrder(sc);
//				serviceO.delOrder(sc);
				break;
			case 5:
				serviceO.getOrders();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}

	public void menuP(Scanner sc) {
		boolean flag = true;
		int menu = 0, sno = 0;
		while (flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				serviceP.addProduct(sc);
				break;
			case 2:
				System.out.println("sno:");
				sno = sc.nextInt();
				System.out.println(serviceP.getProduct(sno));
				break;
			case 3:
				serviceP.editProduct(sc);
				break;
			case 4:
				serviceP.delProduct(sc);
				break;
			case 5:
				serviceP.getAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
}
