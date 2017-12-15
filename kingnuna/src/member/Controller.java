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
			System.out.println("�̹� �α��λ����Դϴ�");
			return;
		}
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
		if(serviceM.login(id, pwd)) {
			loginType = serviceM.getMember(id).getType();
			System.out.println(loginId+"�� �α���");
		}
	}
	
	public void editInfo(Scanner sc) {
		System.out.println("����������");
		System.out.println("loginId:"+loginId);
//		if(loginId == null || loginId == "") {
		if(loginId.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		} else {
			Member m = serviceM.getMember(loginId);
			System.out.println(m);
			System.out.println("new pwd:");
			m.setPwd(sc.next());
//			Member m = new Member();
//			m.setId(loginId);
			serviceM.editMember(m);
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("������ ����");
			System.out.println(serviceM.getMember(loginId));
		}
	}
	
	public void logout(Scanner sc) {
//		if(loginId == null || loginId == "") {
		if(loginId.equals("")) {	
			System.out.println("�α����ϼ���");
			return;
		} else {
			loginId = "";
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
		}	
	}
	
	public void leave(Scanner sc) {
//		if(loginId == null || loginId == "") {
		if(loginId.equals("")) {	
			System.out.println("�α����ϼ���");
			return;
		} else {
			System.out.println("���� Ż���Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
			int result = sc.nextInt();
			if (result == 1) {
				serviceM.delMember(loginId);
				loginId = "";
				System.out.println("Ż��ó���Ǿ����ϴ�.");
			} else {
				System.out.println("��ҵǾ����ϴ�. ");
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
