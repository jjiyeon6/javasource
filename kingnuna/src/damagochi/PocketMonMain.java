package damagochi;

import java.util.Scanner;

public class PocketMonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터 선택\n1.피카츄 2.꼬부기 3.이상해씨");
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
		System.out.println("포켓몬을 선택하세요");
		System.out.println("1.피카츄 | 2.꼬부기 | 3.이상해씨");
		System.out.println("선택>");
		Scanner scanner = new Scanner(System.in);
		int selectMon = scanner.nextInt();
		
		if(selectMon==1) {
			System.out.println("선택한 포켓몬>"+selectMon+".피카츄");
		} else if (selectMon==2) {
			System.out.println("선택한 포켓몬>"+selectMon+".꼬부기");
		} else if (selectMon==3) {
			System.out.println("선택한 포켓몬>"+selectMon+".이상해씨");
		}
//		printMenu();
//		int selectMenu = scanner.nextInt();
//		System.out.println("선택한 메뉴 "+selectMenu);
//		PocketMon pm1 = new Picachu();
//		pm1.eat();
		
		while(true) {
			printMenu();
//			Scanner scanner = new Scanner(System.in);
			int selectMenu = scanner.nextInt();
			switch(selectMenu) {
			case 1:
				System.out.println("선택한 메뉴 "+selectMenu);
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
				System.out.println("선택한 메뉴 "+selectMenu);
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
		System.out.println("포켓몬을 선택하세요");
		System.out.println("1.피카츄 | 2.꼬부기 | 3.이상해씨");
		System.out.println("선택>");
		Scanner scanner = new Scanner(System.in);
		int selectMon = scanner.nextInt();
		
		if(selectMon==1) {
			System.out.println("선택한 포켓몬>"+selectMon+".피카츄");
		} else if (selectMon==2) {
			System.out.println("선택한 포켓몬>"+selectMon+".꼬부기");
		} else if (selectMon==3) {
			System.out.println("선택한 포켓몬>"+selectMon+".이상해씨");
		}
	}
	
	public static void printMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("1.밥먹기 | 2.잠자기 | 3.놀기 | 4.운동하기 | 5.정보확인 | 6.종료 ");
		System.out.println("------------------------------------------------");
		
	}
	
*/
