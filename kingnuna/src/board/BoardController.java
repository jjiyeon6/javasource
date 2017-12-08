package board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import member.Controller;

public class BoardController {
	private Service serviceB;
	
	public BoardController() {
		serviceB = new ServiceImpl();
	}
	
	public boolean loginCheck() {
		return Controller.loginId.equals("");
	}
	
	//글작성 - id는입력받지 않고 member.Controller.loginId 로그인된상태에서만 작성. pwd title content 입력받아 작성
	public void write(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("로그인하세요");
//			return;
//		} else {
		if(loginCheck()) {
			System.out.println("로그인하세요");
			return;
		}	
			System.out.println("<새글 작성>");
			Board b = new Board();
			b.setId(Controller.loginId);
			System.out.println("제목:");
			sc.nextLine();
			b.setTitle(sc.nextLine());
			System.out.println("내용:");
			b.setContent(sc.nextLine());
			System.out.println("등록하시겠습니까?\n1.예 2.아니오");
			int result = sc.nextInt();
			if (result == 1) {
				System.out.println("비밀번호:");
				b.setPwd(sc.next());
				serviceB.addArticle(b);
				System.out.println("새글이 등록되었습니다");
			} else {
				System.out.println("취소되었습니다");
			}
//		}
	}
	//글검색 - num 입력.
	public void getByNum(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("로그인하세요");
//			return;
//		} else {
			System.out.println("<글 검색>");
			System.out.println("글번호:");
			Board b = serviceB.getArticle(sc.nextInt());
			if(b==null) {
				System.out.println("글이 없습니다.");
			} else {
				System.out.println(b);
			}
//		}
	}
	
	//글수정 - num 입력.pwd 입력받아 맞는지 확인. 새title, 새content입력받아서 수정
	public void modify(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("로그인하세요");
//			return;
//		} else {
		if(loginCheck()) {
			System.out.println("로그인하세요");
			return;
		}
			System.out.println("<글 수정>");
			System.out.println("수정할 글번호:");
//			Board b = serviceB.getArticle(sc.nextInt());
//			if(b==null) {
//				System.out.println("글이 없습니다.");
//			} else {
//				System.out.println("비밀번호를 입력하세요");
//				String pwd = sc.next();
//				System.out.println(b.getPwd() +"  "+pwd);
//				if(!b.getPwd().equals(pwd)) {
//					System.out.println("비밀번호가 틀립니다");
//				} else {
//					System.out.println(b);
//					System.out.println("수정할 제목:");
//					b.setTitle(sc.next());
//					System.out.println("수정할 내용:");
//					b.setContent(sc.next());
//					serviceB.editArticle(b);
//					System.out.println(b);
//					System.out.println("수정되었습니다");
//				}
//			}
			
			int num = sc.nextInt();
			String pwd = "";
			Board b = serviceB.getArticle(num);
			if(b==null) {
				System.out.println("글이 없습니다");
				return;
			} else {
				System.out.println("수정전 내용");
				System.out.println(b);
			}
			if(b.getId().equals(Controller.loginId)) {
				System.out.println("글 비밀번호");
				pwd = sc.next();
				if(pwd.equals(b.getPwd())) {
					System.out.println("new title");
					b.setTitle(sc.next());
					System.out.println("new content");
					b.setContent(sc.next());
					serviceB.editArticle(b);
				} else {
					System.out.println("글 비밀번호가 맞지 않습니다");
				}
			} else {
				System.out.println("다른 사람의 글은 수정할 수 없습니다");
			}
//		}
	}
	
	//글삭제 - num 입력.pwd 입력받아 맞는지 확인. (삭제할거야?)삭제
	public void delete(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("로그인하세요");
//			return;
//		} else {
//			System.out.println("<글 삭제>");
//			System.out.println("삭제할 글번호");
//			Board b = serviceB.getArticle(sc.nextInt());
//			if(b==null) {
//				System.out.println("글이 없습니다.");
//			} else {
//				System.out.println("비밀번호를 입력하세요");
//				String pwd = sc.next();
//				System.out.println(b.getPwd() +"  "+pwd);
//				if(!b.getPwd().equals(pwd)) {
//					System.out.println("비밀번호가 틀립니다");
//				} else {
//					System.out.println("정말 삭제하시겠습니까?\n1.예 2.아니오");
//					int result = sc.nextInt();
//					if (result == 1) {
//						serviceB.delArticle(sc.nextInt());
//						System.out.println("삭제되었습니다");
//					} else {
//						System.out.println("취소되었습니다");
//					}
//				}
//			}	
//		}
		if(loginCheck()) {
			System.out.println("로그인하세요");
			return;
		}
		System.out.println("<글 삭제>");
		System.out.println("삭제할 글번호");
		int num = sc.nextInt();
		String pwd = "";
		Board b = serviceB.getArticle(num);
		if(b==null) {
			System.out.println("글이 없습니다");
			return;
		}
		if(b.getId().equals(Controller.loginId)) {
			System.out.println("글 비밀번호");
			pwd = sc.next();
			if(pwd.equals(b.getPwd())) {
				serviceB.delArticle(num);
			} else {
				System.out.println("글 비밀번호가 맞지 않습니다");
			}
		} else {
			System.out.println("다른 사람의 글은 수정할 수 없습니다");
		}
	}
	
	//글전체출력
	public void getAll() {
		System.out.println("글전체출력");
//		ArrayList<Board> list = serviceB.getAll();
//		Iterator<Board> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		printAll(serviceB.getAll());
	}
	
	public void printAll(ArrayList<Board> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void getByWriter(Scanner sc) {
		System.out.println("글 작성자로 검색");
		System.out.println("작성자 아이디:");
		String id = sc.next();
		ArrayList<Board> list = serviceB.getArticleByWriter(id);
		if(list.size()==0) {
			System.out.println(id+"가 작성한 글이 없습니다.");
		} else {
			printAll(list);
		}
	}
	
	public void getByTitle(Scanner sc) {
		System.out.println("글 제목으로 검색");
		System.out.println("글 제목:");
		String title = sc.next();
		ArrayList<Board> list = serviceB.getArticleByTitle(title);
		if(list.size()==0) {
			System.out.println("검색된 글이 없습니다11.");
		} else {
			printAll(list);
		}
	}
	
	public void menuB(Scanner sc) {
		if(Controller.loginId.equals("")) {	
			System.out.println("로그인하세요");
			return;
		} else {
			boolean flag = true;
			int menu = 0;
			while (flag) {
				System.out.println("1.글작성 2.글검색 3.글수정 4.글삭제 5.전체출력 6.종료");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					write(sc);
					break;
				case 2:
					getByNum(sc);
					break;
				case 3:
					modify(sc);
					break;
				case 4:
					delete(sc);
					break;
				case 5:
					getAll();
					break;
				case 6:
					flag = false;
					break;
				}
			}
		}
	}	
					
			
}
