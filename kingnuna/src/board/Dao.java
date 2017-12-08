package board;

import java.util.ArrayList;

public interface Dao {
	void insert(Board b);

	Board select(int num);

	ArrayList<Board> selectByWriter(String id);// 작성자로 검색

	ArrayList<Board> selectByTitle(String title);// 제목으로 검색

	ArrayList<Board> selectAll();// 전체검색

	void update(Board b);// 날짜,제목,내용(num)

	void delete(int num);
}
