package member;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Controller c = new Controller();
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.���� 2.�α��� 3.���������� 4.�α׾ƿ� 5.Ż�� 6.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				c.join(sc);
				break;
			case 2:
				c.login(sc);
				break;
			case 3:
				c.editInfo(sc);
				break;
			case 4:
				c.logout(sc);
				break;	
			case 5:
				c.leave(sc);
				break;
			case 6:
				flag = false;
				break;	
			}
		}
		sc.close();
	}

}
