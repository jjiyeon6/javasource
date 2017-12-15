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
//	System.out.println("학번 중복검색");
//	int stu_num = sc.nextInt();
//	Student s = serviceS.getSub_num(stu_num);
//	if (s == null) {
//		System.out.println("없는 번호");
//	} else {
//		System.out.println(s);
//	}
//}

	public void addStudent(Scanner sc) {
		System.out.println("수강신청");
		Student s = new Student();
		// p.setStu_num(StuController.loginId);

		Member m = ms.getMember(Controller.loginNum);
//		System.out.println(m);
		s.setStu_num(m.getStu_num());//학번
		s.setName(m.getName());//이름
		
//		System.out.print("학번:");
//		s.setStu_num(sc.nextInt());
//
//		System.out.print("이름:");
//		s.setName(sc.next());

//		System.out.print("학과번호:");
//		s.setSub_num(sc.nextInt());

//		System.out.print("학년:");
//		s.setSub_name(sc.next());
		
		ArrayList<Subject_Dto> dList = ss.searchallsubject();
		for (int i = 0; i < dList.size(); i++) {
			System.out.println(dList.get(i));
		}
		System.out.print("신청할 과목번호:");
		int subNum = sc.nextInt();
		s.setSub_num(subNum);
		Subject_Dto sd = ss.searchnumsubject(subNum);
		s.setSub_name(sd.getSub_name());//과목명
		
		serviceS.addStudent(s);
		System.out.println("수강신청이 완료되었습니다");
	}

	public void delsub(Scanner sc) {
		System.out.println("수강취소");
		int sub_num = sc.nextInt();
		serviceS.delSub(sub_num);

	}

	public void printAll(ArrayList<Student> list) {
		System.out.println("내가 수강한 목록");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void printsub(ArrayList<Student> list) {
		System.out.println("내가 수강한 목록");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Student [stu_num=" + list.get(i).getStu_num() + ", name=" + list.get(i).getName()
					+ ", sub_num=" + list.get(i).getSub_num() + ", sub_name=" + list.get(i).getSub_name() + "");
		}
	}
	

	public void myList(Scanner sc) {
		System.out.println("내 수강목록");
		System.out.println("학번을 입력하세요");
		int num = sc.nextInt();
		ArrayList<Student> list = serviceS.checksub(num);
		printsub(list);
	}

	public void checkscore(Scanner sc) {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("내 성적확인");
		System.out.print("학번을 입력하세요:");
		int stu_num = sc.nextInt();
		list = serviceS.checkscore(stu_num);
		if (list == null) {
			System.out.println("성적 다시 입력");
		}
		printAll(list);
	}
	// 시간표
	// public ArrayList<Student> getAllsub()
	// 로긴 체크

	
}
