package class_example;

public class Car {
//feild
	static final String company = "BMW";
	String model;
	int speed;
	int maxSpeed;
	int cc;
	
//constructor 
//생성자 오버로딩
	Car(int cc) {
		this(cc, "람보르기니");
	}

	Car(String model) {
		this(5000, model);
	}
	
	Car(int cc, String model) {
		this.cc = cc;
		this.model = model;
		System.out.println("Car(int cc, String model) 호출 ");
	}
	
	Car(int cc, String model, int maxSpeed) {
		this(cc, model);
		/*this.cc = cc;
		this.model = model;*/
		this.maxSpeed = maxSpeed;
	}
	
//method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}
}
