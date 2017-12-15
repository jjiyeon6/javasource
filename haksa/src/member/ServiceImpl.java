package member;

import java.util.ArrayList;

public class ServiceImpl implements Service {
	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addMember(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

	@Override
	public boolean checkDupId(String stu_num) {
		// TODO Auto-generated method stub
		if (dao.select(stu_num) == null) {
			return true; //��밡��
		} else {
			return false; //���Ұ���
		}
	}

	@Override
	public boolean login(String stu_num, String pwd) {
		// TODO Auto-generated method stub
		Member m = dao.select(stu_num);
		if(m!=null) {
			if(m.getPwd().equals(pwd)) {
				Controller.loginNum = stu_num;
				return true;
			}else {
				System.out.println("�н����� ����ġ");
			}
		}else {
			System.out.println("���� ���̵�");
		}
		return false;
	}

	@Override
	public Member getMember(String stu_num) {
		// TODO Auto-generated method stub
		return dao.select(stu_num);
	}
	
	@Override
	public ArrayList<Member> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editMember(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	@Override
	public void delMember(String stu_num) {
		// TODO Auto-generated method stub
		dao.delete(stu_num);
	}

}
