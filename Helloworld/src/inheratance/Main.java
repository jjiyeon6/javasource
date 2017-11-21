package inheratance;

public class Main {

	public static void main(String[] args) {
		
//		//Car에서 호출
//		System.out.println(mSeris.tire);
//		System.out.println(mSeris.maxSpeed);
//
//		//sportsCar에서 호출
//		System.out.println(mSeris.airbag);
//		
//		//macha에서 호출
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
