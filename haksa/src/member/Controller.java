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
			System.out.println("�̹� �α��ε� �����Դϴ�");
			return;
		}
		System.out.println("ȸ������");
		Member m = new Member();
		System.out.println("ȸ����������\n1.�л� 2.����");
		int type = sc.nextInt();
		m.setType(type);
		String stu_num;
		while (true) {
			if(type == 1) {
				System.out.print("�й�:");
			} else {
				System.out.println("����:");
			}
			stu_num = sc.next();
			if (serviceM.checkDupId(stu_num)) {
				break;
			} else {
				if(type == 1) {
					System.out.print("�ߺ��� �й��Դϴ�");
				} else {
					System.out.println("�ߺ��� �����Դϴ�");
				}
				System.out.println();
			}
		}
		m.setStu_num(stu_num);
		System.out.print("��й�ȣ:");
		m.setPwd(sc.next());
		System.out.print("�̸�:");
		m.setName(sc.next());
		System.out.print("�а�:");
		m.setDept(sc.next());
		if(type == 1) {
			System.out.print("�г�:");
			m.setGrade(sc.nextInt());
		}	
		serviceM.addMember(m);
		System.out.println("���ԵǾ����ϴ�");
	}

	public void login(Scanner sc) {
		System.out.println("�α���");
		while (true) {
			System.out.print("�й�(����):");
			String stu_num = sc.next();
			System.out.print("��й�ȣ:");
			String pwd = sc.next();
			if (serviceM.login(stu_num, pwd)) {
//				System.out.println("�α��� ����");
				loginType = serviceM.getMember(stu_num).getType();
				System.out.println("["+loginNum+"]" + "�� �α���");
				break;
			} else {
				System.out.println("�α��� ����");
			}
		}	
	}

	public void editInfo(Scanner sc) {
		if (loginNum.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		}
		Member m = serviceM.getMember(loginNum);
		System.out.println("���� ����");
		System.out.println(m);
		System.out.print("new pwd:");
		m.setPwd(sc.next());
		serviceM.editMember(m);
		System.out.println("������ ����");
		System.out.println(serviceM.getMember(loginNum));
	}

	public void logout() {
		if (loginNum.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		}
		loginNum = "";
	}

	public void out(Scanner sc) {
		if (loginNum.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("���� Ż���Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
		int result = sc.nextInt();
		if (result == 1) {
			serviceM.delMember(loginNum);
			loginNum = "";
			System.out.println("����ó���Ǿ����ϴ�.");
		}else {
			System.out.println("��ҵǾ����ϴ�.");
		}
	}
	public Member getstu_num() {
		return serviceM.getMember(loginNum);
	}
}









