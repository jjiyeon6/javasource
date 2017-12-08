package member;

import java.util.Scanner;

import board.BoardController;
import seller.SellerController;

public class Menu {
	private Controller cm;
	private BoardController cb;
	private SellerController cs;
	
	public Menu() {
		cm = new Controller();
		cb = new BoardController();
		cs = new SellerController();
	}
	
	public void menuMember(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.���� 2.�α��� 3.���������� 4.�α׾ƿ� 5.Ż�� 6.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cm.join(sc);
				break;
			case 2:
				cm.login(sc);
				break;
			case 3:
				cm.editInfo(sc);
				break;
			case 4:
				cm.logout(sc);
				break;	
			case 5:
				cm.leave(sc);
				break;
			case 6:
				flag = false;
				break;	
			}
		}
	}
	
	public void menuBoard(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.�۾��� 2.��ȣ�ΰ˻� 3.�ۼ��ڷΰ˻� 4.�������� �˻� 5.��ü�˻� 6.���� 7.���� 8.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cb.write(sc);
				break;
			case 2:
				cb.getByNum(sc);
				break;
			case 3:
				cb.getByWriter(sc);
				break;
			case 4:
				cb.getByTitle(sc);
				break;	
			case 5:
				cb.getAll();
				break;
			case 6:
				cb.modify(sc);
				break;	
			case 7:
				cb.delete(sc);
				break;	
			case 8:
				flag = false;
				break;	
			}
		}	
	}
	
	public void menuSeller(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("[�Ǹ���] 1.�Ǹŵ�� 2.����ǰ��� 3.��ü��� 4.���� 5.���� 6.�������ΰ˻� 7.��ȣ�ΰ˻� 8.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cs.regist(sc);
				break;
			case 2:
				cs.getMyGoods();
				break;
			case 3:
				cs.getAll();
				break;
			case 4:
				cs.editGoods(sc);
				break;	
			case 5:
				cs.delGoods(sc);
				break;
			case 6:
				cs.getGoodsByTitle(sc);
				break;
			case 7:
				cs.getGoodsByNum(sc);
				break;	
			case 8:
				flag = false;
				break;	
			}
		}
	}
	
	
	public void menuBuyer(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("[������] 1.���� 2.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cs.regist(sc);
				break;
			case 2:
				flag = false;
				break;	
			}
		}
	}
}
