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
	public boolean checkDupId(String id) {// id �ߺ�üũ
		// TODO Auto-generated method stub
		if (dao.select(id) == null) {
			return true;	// ��밡��
		} else {
			return false;	// ���Ұ���
		}
	}

	@Override
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		Member m = dao.select(id);
		if(m!=null) {
			if(m.getPwd().equals(pwd)) {
				Controller.loginId = id;
				System.out.println("�α��εǾ����ϴ�.");
				return true;
			} else {
				System.out.println("�н����� ����ġ");
			}
			
		} else {
			System.out.println("���� ���̵��Դϴ�.");
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
