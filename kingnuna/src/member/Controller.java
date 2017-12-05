package member;

import java.util.Scanner;

public class Controller {
	public static String loginId = "";
	private Service serviceM;
	
	public Controller() {
		serviceM = new ServiceImpl();
	}
	
	public void join(Scanner sc) {
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
		serviceM.login(id, pwd);
	}
	
	public void editInfo(Scanner sc) {
		System.out.println("내정보수정");
		System.out.println("loginId:"+loginId);
		Member m = new Member();
		if(loginId == null || loginId == "") {
			System.out.println("로그인하세요");
		} else {
			System.out.println("수정할 pwd:");
			m.setPwd(sc.next());
			m.setId(loginId);
			serviceM.editMember(m);
			System.out.println("수정되었습니다.");
		}
	}
	
	public void logout(Scanner sc) {
		loginId = null;
		System.out.println("로그아웃되었습니다.");
	}
	
	public void leave(Scanner sc) {
		serviceM.delMember(loginId);
		System.out.println("탈퇴되었습니다.");
	}
}
