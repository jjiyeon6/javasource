package inheratance;

public class Main {

	public static void main(String[] args) {
		
//		//Car���� ȣ��
//		System.out.println(mSeris.tire);
//		System.out.println(mSeris.maxSpeed);
//
//		//sportsCar���� ȣ��
//		System.out.println(mSeris.airbag);
//		
//		//macha���� ȣ��
//		System.out.println("horse: "+mSeris.horse);
		
		Macha macha = new Macha();
		macha.run();
		
		Car car = new Car();
		car.run();

		//override
		//macha.run() >> car.run() >> run()
		SportsCar mSeris = new SportsCar();
		mSeris.run();
	}

}
