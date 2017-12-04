package dbtest1;

import java.util.Scanner;

public class Process {
	private Service serviceP;		//공장서비스
	private order.Service serviceO;	//편의점서비스
	
	public Process() {
		serviceP = new ServiceImpl();
		serviceO = new order.ServiceImpl();
	}
	
	public void menuO(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.주문 2.주문검색 3.수정 4.삭제 5.주문목록 6.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				serviceO.addOrder(sc);
				break;
			case 2:
				serviceO.getOrder(sc);
				break;
			case 3:
				serviceO.makeResult(sc);
				break;
			case 4:
				serviceO.delOrder(sc);
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
		int menu = 0;
		while(flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				serviceP.addProduct(sc);
				break;
			case 2:
				serviceP.getProduct(sc);
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
