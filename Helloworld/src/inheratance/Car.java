package inheratance;

public class Car extends Macha {
	String company = "BMW";
	int maxSpeed = 200;
	int tire = 4;
	int horse = 0;
	
	Car() {
		System.out.println("Car() : 부모 생성자");
	}
	
	Car(String name) {
		System.out.println("Car() : 부모 생성자2" +name);
	}
	
	void run() {
		System.out.println("카가 달립니다.");
	}
}
