package student;

import java.util.ArrayList;

public interface Service {

	void addStudent(Student s);

	void delSub(int sub_num);



	// 성적표 미정
	void enrol(Student s);

	void cancel(int sub_num);

	ArrayList<Student> myenrol(String stu_num);

	ArrayList<Student> checkscore(String stu_num);

	ArrayList<Student> checksub(String stu_num);

}
