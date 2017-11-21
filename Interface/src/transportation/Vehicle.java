package transportation;

public interface Vehicle {

	//상수  [static final] 생략가능 
	
	
	//추상 메소드  [abstract] 생략가능
	public abstract void run();
	
	//default method
	default void electCharge() {
		System.out.println("충전중입니다.");
	}
		
}
