package member;

import java.util.Scanner;

public class Controller {
	public static String loginId = "";
	public static int loginType = 0;
	private Service serviceM;
	
	public Controller() {
		serviceM = new ServiceImpl();
	}
	
	public void join(Scanner sc) {
		if(!loginId.equals("")) {
			System.out.println("이미 로그인상태입니다");
			return;
		}
		System.out.println("회원가입");
		String id;
		while(true) {
			System.out.println("id:");
			id = sc.next();
			if(serviceM.checkDupId(id)) {//true
				break;
			} else {
				System.out.println("중복된 아이디입니다.");//false
			}
		}
		Member m = new Member();
		m.setId(id);
		System.out.println("pwd:");
		String pwd = sc.next();
		m.setPwd(pwd);
		System.out.println("name:");
		m.setName(sc.next());
		System.out.println("email:");
		m.setEmail(sc.next());
		System.out.println("회원종류선택\n1.판매자 2.구매자");
		m.setType(sc.nextInt());
		serviceM.addMember(m);
		System.out.println("회원가입되었습니다.");
		
	}
	
	public void login(Scanner sc) {
		System.out.println("id:");
		String id = sc.next();
		System.out.println("pwd:");
		String pwd = sc.next();
		if(serviceM.login(id, pwd)) {
			loginType = serviceM.getMember(id).getType();
			System.out.println(loginId+"님 로그인");
		}
	}
	
	public void editInfo(Scanner sc) {
		System.out.println("내정보수정");
		System.out.println("loginId:"+loginId);
//		if(loginId == null || loginId == "") {
		if(loginId.equals("")) {
			System.out.println("로그인하세요");
			return;
		} else {
			Member m = serviceM.getMember(loginId);
			System.out.println(m);
			System.out.println("new pwd:");
			m.setPwd(sc.next());
//			Member m = new Member();
//			m.setId(loginId);
			serviceM.editMember(m);
			System.out.println("수정되었습니다.");
			System.out.println("수정된 정보");
			System.out.println(serviceM.getMember(loginId));
		}
	}
	
	public void logout(Scanner sc) {
//		if(loginId == null || loginId == "") {
		if(loginId.equals("")) {	
			System.out.println("로그인하세요");
			return;
		} else {
			loginId = "";
			System.out.println("로그아웃되었습니다.");
		}	
	}
	
	public void leave(Scanner sc) {
//		if(loginId == null || loginId == "") {
		if(loginId.equals("")) {	
			System.out.println("로그인하세요");
			return;
		} else {
			System.out.println("정말 탈퇴하시겠습니까?\n1.예 2.아니오");
			int result = sc.nextInt();
			if (result == 1) {
				serviceM.delMember(loginId);
				loginId = "";
				System.out.println("탈퇴처리되었습니다.");
			} else {
				System.out.println("취소되었습니다. ");
			}
		}	
	}
	
	public boolean checkType(String id) {
		Member m = serviceM.getMember(loginId);
		int type = m.getType();
		if(type==1) {
			return true;
		} else {
			return false;
		}
	}
}
