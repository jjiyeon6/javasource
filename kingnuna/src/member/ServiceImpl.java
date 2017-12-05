package member;

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
	public boolean checkDupId(String id) {// id 중복체크
		// TODO Auto-generated method stub
		if (dao.select(id) == null) {
			return true;	// 사용가능
		} else {
			return false;	// 사용불가능
		}
	}

	@Override
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		Member m = dao.select(id);
		if(m!=null) {
			if(m.getPwd().equals(pwd)) {
				Controller.loginId = id;
				System.out.println("로그인되었습니다.");
				return true;
			} else {
				System.out.println("패스워드 불일치");
			}
			
		} else {
			System.out.println("없는 아이디입니다.");
		}
		return false;
	}

	@Override
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return dao.select(id);
	}

	@Override
	public void editMember(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	@Override
	public void delMember(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
