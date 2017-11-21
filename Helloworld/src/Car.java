
public class Car {
	//feild
	String company = "BMW";
	String model = "M";
	String color;
	int maxSpeed;
	int currSpeed;
	
	//method
	//리턴값 메소드명 매개변수
	//메서드의 오버로딩
	void start() {
		System.out.println("시동 부릉부릉!!");
	}
	
	void start(String word) {
		System.out.println("시동 부릉부릉!!"+word);
	}
	
	int add(int a, int b) {
		int result;
		result = a+b;
		return result;
	}
	
	int add(int a, int b, int c) {
		int result;
		result = add(a,b)+c;
		return result;
	}
	
	int add(double a, double b) {
		double result;
		result = a+b;
		return (int)result;
	}
	
	//Car(){}	생성자
	//필드값을 생성자에서 초기화시킬 수 있다
	//생성자의 오버로딩
	Car(String _color){
		color = _color;
		maxSpeed = 300;
		currSpeed = 0;
	}
	
	Car(String _color, int _maxSpeed){
		color = _color;
		maxSpeed = _maxSpeed;
		currSpeed = 0;
	}
	
}
