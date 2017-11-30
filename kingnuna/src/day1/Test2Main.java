package day1;

class Parent{
	protected String name;
	protected int age;
	
	public void test() {
		System.out.println("parent method");
	}
}

class Child extends Parent {

	@Override
	public void test() {
		System.out.println("child method");
	}
	
	public void test2() {
		System.out.println("child method2");
	}
	
}
public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.test();
		c.test2();
		
		Parent p = new Child();//up casting
		p.test();
		((Child)p).test2();//down casting
	}

}
