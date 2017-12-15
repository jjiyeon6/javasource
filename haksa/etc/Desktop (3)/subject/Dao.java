package subject;

import java.util.ArrayList;

public interface Dao {
		void insert(Subject_Dto sd);				
		Subject_Dto select(int sub_num);
		ArrayList<Subject_Dto> selectAll();
		void editsubject(Subject_Dto sd);
		void delete(int sub_num);
		
	}


