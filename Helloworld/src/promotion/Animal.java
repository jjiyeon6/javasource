package promotion;

//추상클래서
//무조건 public
public abstract class Animal {
	
	//field
	public String kind;
	
	//constructor
	Animal() {
		System.out.println("Animal()");
	}
	
	//method
	void breathe() {
		System.out.println("Wild Breathe");
	}
	
	//추상메소드
	//input, output, method name
	//public 또는 protected
	public abstract void sound();
}
