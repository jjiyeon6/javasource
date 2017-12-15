package student;

import java.util.ArrayList;

import javax.security.auth.Subject;

public interface Dao {

	void insert(Student s);
	Student selectNum(String stu_num);
	ArrayList<Student> selectStu(String stu_num);
	ArrayList<Student> selectScore(String stu_num);
	ArrayList<Student> selectSub(String stu_num);

	void delete(int sub_num);
	
}
