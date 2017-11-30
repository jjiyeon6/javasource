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
			System.out.println("1.��Ա� | 2.���ڱ� | 3.��� | 4.��ϱ� | 5.����Ȯ�� | 6.����  | 7.Ư�����");
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
				System.out.println("��������");
				return;
			case 7:
				if(mon instanceof Picachu) {//��ü�� Ÿ�� Ȯ��
					((Picachu)mon).�������();
				} else if (mon instanceof Kkobugi) {
					((Kkobugi)mon).������();
				} else if (mon instanceof Esanghaessi) {
					((Esanghaessi)mon).����();
				}
				break;
				
			}
		}
		System.out.println("ĳ���� ���. ��������");
	}

}
