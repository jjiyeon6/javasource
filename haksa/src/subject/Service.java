package subject;

import java.util.ArrayList;


public interface Service {

	void addSubject(Subject_Dto sd);

	void editSubject(Subject_Dto sd);

	void delSubject(int sub_num);
	
	Subject_Dto searchnumsubject(int sub_num);
	
	Subject_Dto searchsyllabus(int sub_num);
	
	ArrayList<Subject_Dto>searchallsubject();
	
	
}
