package member;

import java.util.ArrayList;

public interface Dao {
	void insert(Member m);

	Member select(String stu_num);
	
	ArrayList<Member> selectAll();

	void update(Member m);

	void delete(String stu_num);
}
