package board;

import java.sql.Date;

public class Board {
	private int num;
	private Date w_date;
	private String stu_num;
	private String w_pwd;
	private String title;
	private String content;
	private String w_file;
	
	public Board() {}

	public Board(int num, Date w_date, String stu_num, String w_pwd, String title, String content, String w_file) {
		this.num = num;
		this.w_date = w_date;
		this.stu_num = stu_num;
		this.w_pwd = w_pwd;
		this.title = title;
		this.content = content;
		this.w_file = w_file;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getW_date() {
		return w_date;
	}

	public void setW_date(Date w_date) {
		this.w_date = w_date;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}

	public String getW_pwd() {
		return w_pwd;
	}

	public void setW_pwd(String w_pwd) {
		this.w_pwd = w_pwd;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getW_file() {
		return w_file;
	}

	public void setW_file(String w_file) {
		this.w_file = w_file;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", w_date=" + w_date + ", stu_num=" + stu_num + ", w_pwd=" + w_pwd + ", title="
				+ title + ", content=" + content + ", w_file=" + w_file + "]";
	}
	
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("\r\n");
		sb.append("글번호 : "+num+"\n");
		sb.append("작성일자 : "+w_date+"\n");
		sb.append("작성자 : "+stu_num+"\n");
		sb.append("제목 : "+title+"\n");
		sb.append("내용 : "+content+"\n");
		sb.append("첨부파일 내용:");

		return sb.toString();
	}
}
