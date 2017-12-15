package board;

import java.util.ArrayList;

public interface Dao {

	void insert(Board b);

	Board select(int num);

	ArrayList<Board> selectByWriter(String stu_num);

	ArrayList<Board> selectByTitle(String title);

	ArrayList<Board> selectAll();

	void update(Board b);// ��¥,����,����(num)

	void delete(int num);
}
