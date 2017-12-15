package student;

import java.util.ArrayList;
import java.util.Scanner;

import member.Member;
import subject.Sub_Controller;
import subject.Subject_Dto;

public class StudentController {
	private Dao dao;
	private Service serviceS;
	private Sub_Controller scon;
	private member.Controller c;
	
	public StudentController() {
		serviceS = new ServiceImpl();
		c = new member.Controller();
		scon = new Sub_Controller();
	}

	public void addStudent(Scanner sc) {
		Member memberM = new Member();
		Student s = new Student();
		memberM = c.getstu_num();
	
	    s.setName(memberM.getName());
	    System.out.println(memberM.getName());
	    s.setStu_num(memberM.getStu_num());
 		
		System.out.println("������û");
		
		System.out.print("�����ȣ:");
		int sub_num = sc.nextInt();
		Subject_Dto sd = scon.selectnum_sub(sub_num);
		if(sd != null) {
			s.setSub_num(sd.getSub_num());
		}
		
		System.out.print("�г�:");
		s.setSub_name(sc.next());

		System.out.println("������û�� �Ϸ�Ǿ����ϴ�");
		System.out.println(s);
		serviceS.addStudent(s);
	}

	public void delsub(Scanner sc) {
		System.out.println("�������");
		System.out.print("�����ȣ �Է�:");
		int sub_num = sc.nextInt();
		serviceS.delSub(sub_num);
        System.out.println("��� �Ϸ�Ǿ����ϴ�");
		
	}

	public void printAll(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void printsub(ArrayList<Student> list) {  	
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Student [stu_num=" + list.get(i).getStu_num() + ", name=" + list.get(i).getName()
					+ ", sub_num=" + list.get(i).getSub_num() + ", sub_name=" + list.get(i).getSub_name() + "");
		}
	}
	

	public void myList(Scanner sc) {
		System.out.println("�� �������");
		Member memberM = new Member();
		Student s = new Student();
		memberM = c.getstu_num();	
		s.setStu_num(memberM.getStu_num());
		System.out.println(s);
		ArrayList<Student> list = serviceS.checksub(s.getStu_num());
		printsub(list);
	}

	public void checkscore(Scanner sc) {
		ArrayList<Student> list = new ArrayList<Student>();
		Member memberM = new Member();
		Student s = new Student();
		memberM = c.getstu_num();
	    s.setName(memberM.getName());
	    System.out.println(memberM.getName());
	    s.setStu_num(memberM.getStu_num());
		System.out.println("�� ����Ȯ��");
		s.setStu_num(memberM.getStu_num());
		list = serviceS.checkscore(s.getStu_num());
		if (list == null) {
			System.out.println("���� �ٽ� �Է�");
		}
		printAll(list);
	}
	// �ð�ǥ
	// public ArrayList<Student> getAllsub()
	// �α� üũ

	
}
