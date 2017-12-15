package subject;

import java.util.ArrayList;


public class ServiceImpl implements Service {

	private Dao dao;
	public ServiceImpl() {		
		dao = new DaoImpl();
	}
	
	
	@Override
	public void addSubject(Subject_Dto sd) {
	dao.insert(sd);
	}
	
	
	@Override
	public void editSubject(Subject_Dto sd) {
		dao.editsubject(sd);
	}

	@Override
	public void delSubject(int sub_num) {
		dao.delete(sub_num);
			}

	
	@Override
	public ArrayList<Subject_Dto> searchallsubject() {
		return dao.selectAll();
	

	}

	@Override
	public Subject_Dto searchnumsubject(int sub_num) {		
		return dao.select(sub_num);
	}


	@Override
	public Subject_Dto searchsyllabus(int sub_num) {
	
		return dao.select(sub_num);
	}

	

}
