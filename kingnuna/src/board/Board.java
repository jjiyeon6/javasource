package board;

import java.sql.Date;

public class Board {
	private int num;
	private Date w_date;
	private String id;
	private String pwd;
	private String title;
	private String content;
	
	public Board() {}
	public Board(int num, Date w_date, String id, String pwd, String title, String content) {
		this.num = num;
		this.w_date = w_date;
		this.id = id;
		this.pwd = pwd;
		this.title = title;
		this.content = content;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	
	@Override
	public String toString() {
		return "Board [num=" + num + ", w_date=" + w_date + ", id=" + id + ", pwd=" + pwd + ", title=" + title
				+ ", content=" + content + "]";
	}
}
