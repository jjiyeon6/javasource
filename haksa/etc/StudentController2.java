package student;

import java.util.ArrayList;
import java.util.Scanner;

import member.Controller;
import member.Member;
import subject.Subject_Dto;

public class StudentController2 {

	private Service serviceS;
	private member.ServiceImpl ms;
	private subject.ServiceImpl ss;
	
	public StudentController2() {
		serviceS = new ServiceImpl();
		ms = new member.ServiceImpl();
		ss = new subject.ServiceImpl();
	}

//	public void getSub_num(Scanner sc) {
//	System.out.println("�й� �ߺ��˻�");
//	int stu_num = sc.nextInt();
//	Student s = serviceS.getSub_num(stu_num);
//	if (s == null) {
//		System.out.println("���� ��ȣ");
//	} else {
//		System.out.println(s);
//	}
//}

	public void addStudent(Scanner sc) {
		System.out.println("������û");
		Student s = new Student();
		// p.setStu_num(StuController.loginId);

		Member m = ms.getMember(Controller.loginNum);
//		System.out.println(m);
		s.setStu_num(m.getStu_num());//�й�
		s.setName(m.getName());//�̸�
		
//		System.out.print("�й�:");
//		s.setStu_num(sc.nextInt());
//
//		System.out.print("�̸�:");
//		s.setName(sc.next());

//		System.out.print("�а���ȣ:");
//		s.setSub_num(sc.nextInt());

//		System.out.print("�г�:");
//		s.setSub_name(sc.next());
		
		ArrayList<Subject_Dto> dList = ss.searchallsubject();
		for (int i = 0; i < dList.size(); i++) {
			System.out.println(dList.get(i));
		}
		System.out.print("��û�� �����ȣ:");
		int subNum = sc.nextInt();
		s.setSub_num(subNum);
		Subject_Dto sd = ss.searchnumsubject(subNum);
		s.setSub_name(sd.getSub_name());//�����
		
		serviceS.addStudent(s);
		System.out.println("������û�� �Ϸ�Ǿ����ϴ�");
	}

	public void delsub(Scanner sc) {
		System.out.println("�������");
		int sub_num = sc.nextInt();
		serviceS.delSub(sub_num);

	}

	public void printAll(ArrayList<Student> list) {
		System.out.println("���� ������ ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void printsub(ArrayList<Student> list) {
		System.out.println("���� ������ ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Student [stu_num=" + list.get(i).getStu_num() + ", name=" + list.get(i).getName()
					+ ", sub_num=" + list.get(i).getSub_num() + ", sub_name=" + list.get(i).getSub_name() + "");
		}
	}
	

	public void myList(Scanner sc) {
		System.out.println("�� �������");
		System.out.println("�й��� �Է��ϼ���");
		int num = sc.nextInt();
		ArrayList<Student> list = serviceS.checksub(num);
		printsub(list);
	}

	public void checkscore(Scanner sc) {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("�� ����Ȯ��");
		System.out.print("�й��� �Է��ϼ���:");
		int stu_num = sc.nextInt();
		list = serviceS.checkscore(stu_num);
		if (list == null) {
			System.out.println("���� �ٽ� �Է�");
		}
		printAll(list);
	}
	// �ð�ǥ
	// public ArrayList<Student> getAllsub()
	// �α� üũ

	
}
