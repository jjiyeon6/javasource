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
			System.out.println("1.가입 2.로그인 3.내정보수정 4.로그아웃 5.탈퇴 6.종료");
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
			System.out.println("1.글쓰기 2.번호로검색 3.작성자로검색 4.제목으로 검색 5.전체검색 6.수정 7.삭제 8.종료");
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
			System.out.println("[판매자] 1.판매등록 2.내상품목록 3.전체목록 4.수정 5.삭제 6.제목으로검색 7.번호로검색 8.종료");
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
			System.out.println("[구매자] 1.구매 2.종료");
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
