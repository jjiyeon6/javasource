package p279_Exercise;
//public class Member
public class Member {
	
	//field
	String name;
	String id;
	String password;
	int age;
	
	//constructor
	Member(String name, String id) {
		this.name = name;
		this.id = id;
		System.out.println("name:" +name +" id:"+id);
	}
	
	
}
