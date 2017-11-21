package p339_Exercise;

public class Child extends Parent {
/*
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}

	//p339 question5.
	//부모클래스에 기본 생성자가 없고, 매개 변수가 있는 생성자만 있다면 
	//자식 생성자에서 반드시 부모 생성자 호출을 위해  super(매개값)를 명시적으로 호출해야 한다.
	//super(매개값)는 반드시 자식 생성자 첫 줄에 위치해야 한다.
	
*/
	
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
