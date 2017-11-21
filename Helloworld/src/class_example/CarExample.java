package class_example;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car(5000,"람보르기니",300);
		Car yourCar = new Car(4000);
		
		myCar.run();
		
		System.out.println(myCar.company);
		System.out.println(yourCar.company);
		
//		Car.company = "VV";
//		
//		System.out.println(myCar.company);
//		System.out.println(yourCar.company);
//		
//		myCar.company = "벤츠";
//		
//		System.out.println(myCar.company);
//		System.out.println(yourCar.company);
	}

}
