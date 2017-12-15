package board;

import java.util.ArrayList;

public interface Service {
	void addArticle(Board b);

	Board getArticle(int num);

	ArrayList<Board> getArticleByWriter(String stu_num);

	ArrayList<Board> getArticleByTitle(String title);

	ArrayList<Board> getAll();

	void editArticle(Board b);

	void delArticle(int num);
}
