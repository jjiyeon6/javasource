package p339_Exercise;

public class Parent {
/*	
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
*/	
	
	
	public String nation;
	
	public Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

}
