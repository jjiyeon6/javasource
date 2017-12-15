package grade;



public class ServiceImpl implements Service {

	private Dao dao;
	public ServiceImpl() {		
		dao = new DaoImpl();
	}
		
		
	@Override
	public void insertgreade(Grade_Dto gd) {
		dao.grade_Update(gd);
	}

	@Override
	public void deletegreade(Grade_Dto gd) {
		dao.grade_delete(gd);

	}

}
