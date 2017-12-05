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
			System.out.println("1.가입 2.로그인 3.내정보수정 4.로그아웃 5.탈퇴 6.종료");
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
