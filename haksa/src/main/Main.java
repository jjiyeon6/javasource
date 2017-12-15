package main;

import java.util.Scanner;

import member.Controller;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("**학사관리시스템입니다**");
		Controller c = new Controller();
		Menu m = new Menu();
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.로그인 2.로그아웃 3.회원가입 4.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				c.login(sc);
				m.mainMenu(sc);
				break;
			case 2:
				c.logout();
				break;
			case 3:
				c.join(sc);
				break;	
			case 4:
				flag = false;
				break;	
			}
		}
		sc.close();
	}

}
