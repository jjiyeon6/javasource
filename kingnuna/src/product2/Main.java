package product2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Service service = new Service(sc);
		OrderService oservice = new OrderService(sc);
		boolean flag1 = true;
		boolean flag2 = true;
		int menu = 0;
		while(flag1) {
			System.out.println("1.공장 2.편의점 3.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				while(flag2) {
					System.out.println("[공장] 1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.이전메뉴");
					menu = sc.nextInt();
					switch(menu) {
					case 1:
						service.addProduct();
						break;
					case 2:
						service.getProduct();
						break;
					case 3:
						service.editProduct();
						break;
					case 4:
						service.delProduct();
						break;	
					case 5:
						service.printAll();
						break;
					case 6:
						flag2 = false;
						break;	
					}
				}
				break;
			case 2:
				while(flag2) {
					System.out.println("[편의점] 1.제품리스트 2.주문 3.결제 4.주문취소 5.주문리스트 6.이전메뉴");
					menu = sc.nextInt();
					switch(menu) {
					case 1:
						service.printAll();
						break;
					case 2:
						oservice.addOrder();
//						service.getProduct();
						break;
					case 3:
						service.editProduct();
						break;
					case 4:
						oservice.delProduct();
						break;	
					case 5:
						oservice.printAll();
						break;
					case 6:
						flag2 = false;
						break;	
					}
				}
				break;
			case 3:
				flag1 = false;
				break;	
			}
			flag2 = true;
		}
		System.out.println("종료");
		
		
		

	}

}
