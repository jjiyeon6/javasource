package main;

import java.util.Scanner;

import board.BoardController;
import grade.Grade_Controller;
import member.Controller;
import student.StudentController;
import subject.Sub_Controller;
import timetable.TController;

public class Menu {
	private Controller cm;			// ȸ������
	private BoardController cb;		// �Խ��ǰ���
	private Sub_Controller cs;		// �������
	private Grade_Controller cg;	// ��������
	private StudentController s;	// ������û
	private TController ct;
	
	public Menu() {
		cm = new Controller();
		cb = new BoardController();
		cs = new Sub_Controller();
		cg = new Grade_Controller();
		s = new StudentController();
		ct = new TController();
	}
	
	public void mainMenu(Scanner sc) {
//		Menu m = new Menu();
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.ȸ������ 2.�л���� 3.�Խ��� 4.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				menuMember(sc);
				break;
			case 2:
				checkType(sc);
				break;
			case 3:
				menuBoard(sc);
				break;	
			case 4:
				flag = false;
				break;	
			}
		}
	}
	
	public void checkType(Scanner sc) {
		if(Controller.loginType==0) {
			System.out.println("�α����ϼ���");
		} else {
			switch(Controller.loginType) {
			case 1:
				menuStudent(sc);
				break;
			case 2:
				menuProfessor(sc);
				break;
			}
		}
	}
	
	public void menuMember(Scanner sc) {
		boolean flag = true;
		int menu = 0;	
		while(flag) {
//			System.out.println("1.���� 2.�α��� 3.���������� 4.�α׾ƿ� 5.Ż�� 6.����");
			System.out.println("1.���������� 2.Ż�� 3.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cm.editInfo(sc);
//				cm.join(sc);
				break;
			case 2:
				cm.out(sc);
//				cm.login(sc);
				break;
			case 3:
//				cm.editInfo(sc);
//				break;
//			case 4:
//				cm.logout();
//				break;
//			case 5:
//				cm.out(sc);
//				break;
//			case 6:
				flag = false;
				break;
			}
		}
	}
	
	public void menuStudent(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.����Ȯ�� 2.���ǰ�ȹ�� 3.������û 4.������� 5.�� ������� 6.�ð�ǥ 7.����Ȯ�� 8.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				cs.selectAllsub();
				break;
			case 2:
				cs.select_Syl(sc);
				break;
			case 3:
				s.addStudent(sc);
				break;
			case 4:
				s.delsub(sc);
				break;
			case 5:
				s.myList(sc);
				break;
			case 6:
				ct.getAll();
				break;
			case 7:	
				s.checkscore(sc);
				break;
			case 8:	
				flag = false;
				break;
			}
		}
	}
	
	public void menuProfessor(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.������� 2.�������� 3.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				mngSubject(sc);
				break;
			case 2:
				mngScore(sc);
				break;
			case 3:
				flag = false;
				break;	
			}
		}
	}
	
	public void mngSubject(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.�����߰� 2.��ü ����˻� 3.����˻�(����ѹ�) 4.������� 5.������� 6.���ǰ�ȹ�� 7.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cs.addorder(sc);
				break;
			case 2:
				cs.selectAllsub();
				break;
			case 3:
				cs.selectnum_sub(sc);
				break;
			case 4:				
				cs.editsubject(sc);
				break;
			case 5:						
				cs.delsubject(sc);	
				break;
			case 6:
				cs.select_Syl(sc);
				break;	
			case 7:
				flag = false;
				break;	
			}
		}
	}
	
	public void mngScore(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.�����Է� 2.������� 3.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cg.Insert_score(sc);
				break;
			case 2:
				cg.delete_score(sc);
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}
	
	public void menuBoard(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.�۾��� 2.�ۺ��� 3.�ۼ��� 4.�ۻ��� 5.��ü��� 6.�ۼ��ڷΰ˻� 7.�������ΰ˻� 8.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cb.write(sc);
				break;
			case 2:
				cb.getDetail(sc);
				break;
			case 3:
				cb.editArticle(sc);
				break;
			case 4:
				cb.delArticle(sc);
				break;
			case 5:
				cb.getAll();
				break;	
			case 6:
				cb.getByWriter(sc);
				break;
			case 7:
				cb.getByTitle(sc);
				break;
			case 8:
				flag = false;
				break;	
			}
		}
	}

}
