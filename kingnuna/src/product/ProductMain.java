package product;

import java.util.Scanner;

public class ProductMain {
	
	private static boolean flag = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] datas = new Product[30];
		Scanner sc = new Scanner(System.in);
		Service service = new Service(datas, sc);
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����");
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
				flag = false;
				break;	
			}
		}
		System.out.println("����");

	}

}
