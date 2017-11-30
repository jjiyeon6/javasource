package damagochi;

import java.util.Scanner;

public class PocketMonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ĳ���� ����\n1.��ī�� 2.���α� 3.�̻��ؾ�");
		int ch = sc.nextInt();
		PocketMon m = null;
		switch(ch){
			case 1:
				m = new Picachu();
				break;
			case 2:
				m = new Kkobugi();
				break;
			case 3:
				m = new Esanghaessi();
				break;
			default:
				m = new Picachu();
		}
		GameProcess g = new GameProcess(m);
		g.game();
	}
	
}	
	
	
	
	
/*	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ϸ��� �����ϼ���");
		System.out.println("1.��ī�� | 2.���α� | 3.�̻��ؾ�");
		System.out.println("����>");
		Scanner scanner = new Scanner(System.in);
		int selectMon = scanner.nextInt();
		
		if(selectMon==1) {
			System.out.println("������ ���ϸ�>"+selectMon+".��ī��");
		} else if (selectMon==2) {
			System.out.println("������ ���ϸ�>"+selectMon+".���α�");
		} else if (selectMon==3) {
			System.out.println("������ ���ϸ�>"+selectMon+".�̻��ؾ�");
		}
//		printMenu();
//		int selectMenu = scanner.nextInt();
//		System.out.println("������ �޴� "+selectMenu);
//		PocketMon pm1 = new Picachu();
//		pm1.eat();
		
		while(true) {
			printMenu();
//			Scanner scanner = new Scanner(System.in);
			int selectMenu = scanner.nextInt();
			switch(selectMenu) {
			case 1:
				System.out.println("������ �޴� "+selectMenu);
				if(selectMon==1) {
					PocketMon pm1 = new Picachu();
					pm1.eat();
				} else if (selectMon==2) {
					PocketMon pm2 = new Kkobugi();
					pm2.eat();
				} else if (selectMon==3) {
					PocketMon pm3 = new Esanghaessi();
					pm3.eat();
				}
				break;
			case 2:
				System.out.println("������ �޴� "+selectMenu);
				if(selectMon==1) {
					PocketMon pm1 = new Picachu();
					pm1.sleep();
				} else if (selectMon==2) {
					PocketMon pm2 = new Kkobugi();
					pm2.sleep();
				} else if (selectMon==3) {
					PocketMon pm3 = new Esanghaessi();
					pm3.sleep();
				}
				break;	
			default:
				break;
			}
		}
		

	}
	
	public static void selectPocketMon() {
		System.out.println("���ϸ��� �����ϼ���");
		System.out.println("1.��ī�� | 2.���α� | 3.�̻��ؾ�");
		System.out.println("����>");
		Scanner scanner = new Scanner(System.in);
		int selectMon = scanner.nextInt();
		
		if(selectMon==1) {
			System.out.println("������ ���ϸ�>"+selectMon+".��ī��");
		} else if (selectMon==2) {
			System.out.println("������ ���ϸ�>"+selectMon+".���α�");
		} else if (selectMon==3) {
			System.out.println("������ ���ϸ�>"+selectMon+".�̻��ؾ�");
		}
	}
	
	public static void printMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("1.��Ա� | 2.���ڱ� | 3.��� | 4.��ϱ� | 5.����Ȯ�� | 6.���� ");
		System.out.println("------------------------------------------------");
		
	}
	
*/
