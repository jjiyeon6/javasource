package list;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> vec = new Vector<Board>();
		
		//Board객체를 저장
		vec.add(new Board("제목1","내용1","글쓴이1"));
		vec.add(new Board("제목2","내용2","글쓴이2"));
		vec.add(new Board("제목3","내용3","글쓴이3"));
		vec.add(new Board("제목4","내용4","글쓴이4"));
		vec.add(new Board("제목5","내용5","글쓴이5"));
		
		vec.remove(0);

		Board board = vec.get(2);
		System.out.println(board.subject + ", " + board.content + ", " +  board.writer);
		
	}

}


class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}