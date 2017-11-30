package damagochi;

import java.util.Scanner;

public class GameProcess {

	private PocketMon mon;
	private Scanner sc;
	private int menu;
	private boolean flag = true;

	public GameProcess(PocketMon mon) {
		this.mon = mon;
		sc = new Scanner(System.in);
	}
	
	public void game() {
		while(flag) {
			System.out.println("1.밥먹기 | 2.잠자기 | 3.놀기 | 4.운동하기 | 5.정보확인 | 6.종료  | 7.특기공격");
			menu = sc.nextInt();
			switch(menu){
			case 1:
				mon.eat();
				break;
			case 2:
				mon.sleep();
				break;
			case 3:
				flag = !(mon.play());
				break;
			case 4:
				flag = !(mon.exc());
				break;
			case 5:
				mon.printInfo();
				break;
			case 6:
				flag = false;
				System.out.println("게임종료");
				return;
			case 7:
				if(mon instanceof Picachu) {//객체의 타입 확인
					((Picachu)mon).전기공격();
				} else if (mon instanceof Kkobugi) {
					((Kkobugi)mon).물대포();
				} else if (mon instanceof Esanghaessi) {
					((Esanghaessi)mon).넝쿨();
				}
				break;
				
			}
		}
		System.out.println("캐릭터 사망. 게임종료");
	}

}
