package student;

public class Student {
	private String stu_num;
	private String name;
	private int sub_num;
	private String sub_name;
	private int score;
	
	public Student() {}
	
	public Student(String stu_num, String name, int sub_num, String sub_name) {
		this.stu_num = stu_num;
		this.name = name;
		this.sub_num = sub_num;
		this.sub_name = sub_name;
	}
	
	public Student(String stu_num, String name, int sub_num, String sub_name, int score) {
		this.stu_num = stu_num;
		this.name = name;
		this.sub_num = sub_num;
		this.sub_name = sub_name;
		this.score = score;
	}
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub_num() {
		return sub_num;
	}
	public void setSub_num(int sub_num) {
		this.sub_num = sub_num;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [stu_num=" + stu_num + ", name=" + name + ", sub_num=" + sub_num + ", sub_name=" + sub_name
				+ ", score=" + score + "]";
	}
	


}
