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
			System.out.println("1.���� 2.������ 3.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				while(flag2) {
					System.out.println("[����] 1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.�����޴�");
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
					System.out.println("[������] 1.��ǰ����Ʈ 2.�ֹ� 3.���� 4.�ֹ���� 5.�ֹ�����Ʈ 6.�����޴�");
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
		System.out.println("����");
		
		
		

	}

}
