package member;

import java.util.ArrayList;

public interface Service {
	void addMember(Member m);

	boolean checkDupId(String stu_num);

	boolean login(String stu_num, String pwd);

	Member getMember(String stu_num);
	
	ArrayList<Member> getAll();

	void editMember(Member m);

	void delMember(String stu_num);
}
