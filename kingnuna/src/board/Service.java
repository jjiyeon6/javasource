package board;

import java.util.ArrayList;

public interface Service {
	void addArticle(Board b);

	Board getArticle(int num);

	ArrayList<Board> getAll();

	void editArticle(Board b);

	void delArticle(int num);
}
