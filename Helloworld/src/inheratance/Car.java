package inheratance;

public class Car extends Macha {
	String company = "BMW";
	int maxSpeed = 200;
	int tire = 4;
	int horse = 0;
	
	Car() {
		System.out.println("Car() : �θ� ������");
	}
	
	Car(String name) {
		System.out.println("Car() : �θ� ������2" +name);
	}
	
	void run() {
		System.out.println("ī�� �޸��ϴ�.");
	}
}
