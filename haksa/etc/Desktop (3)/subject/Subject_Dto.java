package subject;



public class Subject_Dto {

	private int sub_num;
	private String sub_name;
	private String pro_name;
	private String spe_name;
	private String time;
	private String day;
	private String www;
	
	public Subject_Dto() {}
	public Subject_Dto(int sub_num, String sub_name, String pro_name, String spe_name,
			String time, String day,String www) {
		
		this.sub_num = sub_num;
		this.sub_name = sub_name;
		this.pro_name = pro_name;
		this.spe_name = spe_name;
		this.time = time;
		this.day = day;
		this.www = www;
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

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getSpe_name() {
		return spe_name;
	}

	public void setSpe_name(String spe_name) {
		this.spe_name = spe_name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	@Override
	public String toString() {
		return "Subject_Dto [sub_num=" + sub_num + ", sub_name=" + sub_name + ", pro_name=" + pro_name + ", spe_name="
				+ spe_name + ", time=" + time + ", day=" + day + ", www=" + www + "]";
	}

	
	
	
	}
	
	
	

