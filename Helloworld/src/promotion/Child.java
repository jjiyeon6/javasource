package promotion;

public class Child extends Parent {
	
	@Override
	public void method2(Parent parent) {
		System.out.println("Override-Child-method2()");
	}

}
