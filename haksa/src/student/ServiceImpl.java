package student;

import java.util.ArrayList;

public class ServiceImpl implements Service {

private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		dao.insert(s);
	}
	@Override
	public void delSub(int sub_num) {	
		 dao.delete(sub_num);
	}
	
	@Override
	public void enrol(Student s) {
		// TODO Auto-generated method stub
		dao.insert(s);

	}

	@Override
	public void cancel(int sub_num) {
		// TODO Auto-generated method stub
		dao.delete(sub_num);

	}

	@Override
	public ArrayList<Student> myenrol(String stu_num) {
		// TODO Auto-generated method stub
		
		return dao.selectSub(stu_num);
	}

	@Override
	public ArrayList<Student> checkscore(String stu_num) {
		// TODO Auto-generated method stub
		return dao.selectScore(stu_num);
	}

	@Override
	public ArrayList<Student> checksub(String stu_num) {
		// TODO Auto-generated method stub
		return dao.selectSub(stu_num);
	}
}
