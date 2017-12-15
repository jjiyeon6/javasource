package member;

public class Member {
	private String stu_num;
	private String pwd;
	private String name;
	private String dept;
	private int grade;
	private int type;
	
	public Member() {}
	public Member(String stu_num, String pwd, String name, String dept, int grade, int type) {
		this.stu_num = stu_num;
		this.pwd = pwd;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
		this.type = type;
	}
	
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Member [stu_num=" + stu_num + ", pwd=" + pwd + ", name=" + name + ", dept=" + dept + ", grade=" + grade
				+ ", type=" + type + "]";
	}
	
}
