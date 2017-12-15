package timetable;

public class Timetable {
	private String p_no;

	private String mon;
	private String tue;
	private String wed;
	private String thu;
	private String fri;
	
	public Timetable() {}
	public Timetable(String p_no, String mon, String tue, String wed, String thu, String fri) {
		this.p_no = p_no;
		this.mon = mon;
		this.tue = tue;
		this.wed = wed;
		this.thu = thu;
		this.fri = fri;
	}
	
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	
	
//	@Override
//	public String toString() {
//		return "Timetable [p_no=" + p_no + ", mon=" + mon + ", tue=" + tue + ", wed=" + wed + ", thu=" + thu + ", fri="
//				+ fri + "]";
//	}
	
	public String toString() {
		return p_no + " | " + mon + " | " + tue + " | " + wed + " | " + thu + " | " + fri ;
	}
	
}
