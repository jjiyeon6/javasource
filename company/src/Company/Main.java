package Company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service(sc);
		OrderService odService = new OrderService(sc);
		
		boolean flag = true;
		int menu = 0;
		   
		while(flag) {
			System.out.println("1.공장 2.편의점 3.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				service.run();
				break;
			case 2:
				odService.run(service);
				break;
			case 3:
				flag = false;
				break;
			}
		}		
	}

}
