package main;

import java.util.Scanner;

import member.Controller;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("**�л�����ý����Դϴ�**");
		Controller c = new Controller();
		Menu m = new Menu();
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.�α��� 2.�α׾ƿ� 3.ȸ������ 4.����");
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
