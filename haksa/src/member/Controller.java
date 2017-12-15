package member;

import java.util.Scanner;

public class Controller {
	public static String loginNum = "";
	public static int loginType = 0;
	private Service serviceM;

	public Controller() {
		serviceM = new ServiceImpl();
	}
	
	
	public String getname() {
		Member m = serviceM.getMember(loginNum);
		return m.getName();
	}
			
	public void join(Scanner sc) {
		if (!loginNum.equals("")) {
			System.out.println("이미 로그인된 상태입니다");
			return;
		}
		System.out.println("회원가입");
		Member m = new Member();
		System.out.println("회원종류선택\n1.학생 2.교수");
		int type = sc.nextInt();
		m.setType(type);
		String stu_num;
		while (true) {
			if(type == 1) {
				System.out.print("학번:");
			} else {
				System.out.println("교번:");
			}
			stu_num = sc.next();
			if (serviceM.checkDupId(stu_num)) {
				break;
			} else {
				if(type == 1) {
					System.out.print("중복된 학번입니다");
				} else {
					System.out.println("중복된 교번입니다");
				}
				System.out.println();
			}
		}
		m.setStu_num(stu_num);
		System.out.print("비밀번호:");
		m.setPwd(sc.next());
		System.out.print("이름:");
		m.setName(sc.next());
		System.out.print("학과:");
		m.setDept(sc.next());
		if(type == 1) {
			System.out.print("학년:");
			m.setGrade(sc.nextInt());
		}	
		serviceM.addMember(m);
		System.out.println("가입되었습니다");
	}

	public void login(Scanner sc) {
		System.out.println("로그인");
		while (true) {
			System.out.print("학번(교번):");
			String stu_num = sc.next();
			System.out.print("비밀번호:");
			String pwd = sc.next();
			if (serviceM.login(stu_num, pwd)) {
//				System.out.println("로그인 성공");
				loginType = serviceM.getMember(stu_num).getType();
				System.out.println("["+loginNum+"]" + "님 로그인");
				break;
			} else {
				System.out.println("로그인 실패");
			}
		}	
	}

	public void editInfo(Scanner sc) {
		if (loginNum.equals("")) {
			System.out.println("로그인하세요");
			return;
		}
		Member m = serviceM.getMember(loginNum);
		System.out.println("현재 정보");
		System.out.println(m);
		System.out.print("new pwd:");
		m.setPwd(sc.next());
		serviceM.editMember(m);
		System.out.println("수정된 정보");
		System.out.println(serviceM.getMember(loginNum));
	}

	public void logout() {
		if (loginNum.equals("")) {
			System.out.println("로그인하세요");
			return;
		}
		loginNum = "";
	}

	public void out(Scanner sc) {
		if (loginNum.equals("")) {
			System.out.println("로그인하세요");
			return;
		}
		System.out.println("정말 탈퇴하시겠습니까?\n1.예 2.아니오");
		int result = sc.nextInt();
		if (result == 1) {
			serviceM.delMember(loginNum);
			loginNum = "";
			System.out.println("정상처리되었습니다.");
		}else {
			System.out.println("취소되었습니다.");
		}
	}
	public Member getstu_num() {
		return serviceM.getMember(loginNum);
	}
}









