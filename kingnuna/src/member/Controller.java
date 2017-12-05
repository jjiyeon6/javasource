package member;

import java.util.Scanner;

public class Controller {
	public static String loginId = "";
	private Service serviceM;
	
	public Controller() {
		serviceM = new ServiceImpl();
	}
	
	public void join(Scanner sc) {
		System.out.println("ȸ������");
		String id;
		while(true) {
			System.out.println("id:");
			id = sc.next();
			if(serviceM.checkDupId(id)) {//true
				break;
			} else {
				System.out.println("�ߺ��� ���̵��Դϴ�.");//false
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
		System.out.println("ȸ����������\n1.�Ǹ��� 2.������");
		m.setType(sc.nextInt());
		serviceM.addMember(m);
		System.out.println("ȸ�����ԵǾ����ϴ�.");
		
	}
	
	public void login(Scanner sc) {
		System.out.println("id:");
		String id = sc.next();
		System.out.println("pwd:");
		String pwd = sc.next();
		serviceM.login(id, pwd);
	}
	
	public void editInfo(Scanner sc) {
		System.out.println("����������");
		System.out.println("loginId:"+loginId);
		Member m = new Member();
		if(loginId == null || loginId == "") {
			System.out.println("�α����ϼ���");
		} else {
			System.out.println("������ pwd:");
			m.setPwd(sc.next());
			m.setId(loginId);
			serviceM.editMember(m);
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	
	public void logout(Scanner sc) {
		loginId = null;
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
	
	public void leave(Scanner sc) {
		serviceM.delMember(loginId);
		System.out.println("Ż��Ǿ����ϴ�.");
	}
}
