package main;

import java.util.Scanner;

import board.BoardController;
import grade.Grade_Controller;
import member.Controller;
import student.StudentController;
import subject.Sub_Controller;
import timetable.TController;

public class Menu {
	private Controller cm;			// 회원관리
	private BoardController cb;		// 게시판관리
	private Sub_Controller cs;		// 과목관리
	private Grade_Controller cg;	// 성적관리
	private StudentController s;	// 수강신청
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
			System.out.println("1.회원관리 2.학사관리 3.게시판 4.종료");
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
			System.out.println("로그인하세요");
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
//			System.out.println("1.가입 2.로그인 3.내정보수정 4.로그아웃 5.탈퇴 6.종료");
			System.out.println("1.내정보수정 2.탈퇴 3.종료");
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
			System.out.println("1.과목확인 2.강의계획서 3.수강신청 4.수강취소 5.내 수강목록 6.시간표 7.성적확인 8.종료");
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
			System.out.println("1.과목관리 2.성적관리 3.종료");
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
			System.out.println("1.과목추가 2.전체 과목검색 3.과목검색(과목넘버) 4.과목수정 5.과목삭제 6.강의계획서 7.종료");
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
			System.out.println("1.성적입력 2.성적취소 3.종료");
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
			System.out.println("1.글쓰기 2.글보기 3.글수정 4.글삭제 5.전체목록 6.작성자로검색 7.제목으로검색 8.종료");
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
