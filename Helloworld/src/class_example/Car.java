package class_example;

public class Car {
//feild
	static final String company = "BMW";
	String model;
	int speed;
	int maxSpeed;
	int cc;
	
//constructor 
//������ �����ε�
	Car(int cc) {
		this(cc, "���������");
	}

	Car(String model) {
		this(5000, model);
	}
	
	Car(int cc, String model) {
		this.cc = cc;
		this.model = model;
		System.out.println("Car(int cc, String model) ȣ�� ");
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
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed+"km/h)");
		}
	}
}
