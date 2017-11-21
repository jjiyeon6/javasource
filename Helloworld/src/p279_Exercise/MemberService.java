package p279_Exercise;

public class MemberService {
	
	String id = "hong";
	String password = "12345";
	
	//method
	boolean login(String id, String password) {
//		System.out.println("MemberService this.id1:" +this.id+ " password:"+this.password);
//		System.out.println("MemberService id1:" +id+ " password:"+password);
		
//		this.id = id;
//		this.password = password;
//		System.out.println("login!");
		
		if(this.id != id || this.password != password) {
			return false;
		}
		return true;
	}
	
	void logout(String id) {
		this.id = id;
//		System.out.println("MemberService id2:"+id);
		System.out.println("로그아웃 되었습니다.");
	}
}
