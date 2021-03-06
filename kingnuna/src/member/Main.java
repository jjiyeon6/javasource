package member;

import java.util.Scanner;

public class Main {
	public static void checkType(Menu m, Scanner sc) {
		if(Controller.loginType==0) {
			System.out.println("로그인하세요");
		} else {
			switch(Controller.loginType) {
			case 1:
				m.menuSeller(sc);
				break;
			case 2:
				m.menuBuyer(sc);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.회원관리 2.게시판 3.SHOP 4.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				m.menuMember(sc);
				break;
			case 2:
				m.menuBoard(sc);
				break;
			case 3:
				checkType(m, sc);
				break;	
			case 4:
				flag = false;
				break;	
			}
		}
		sc.close();
	}

}
