package transportation;

public class VehicleExample {

	public static void main(String[] args) {

//		Vehicle vehicle = new Vehicle(); //인터페이스틑 객체화시키지 못한다
		Vehicle vehicle = new Bus();	//자동 형변환
		vehicle.run();	//Vehicle.java 인터페이스에서 선언 -> Bus.java bus class에서 구현
//		vehicle.checkFare();	//
		
		if (vehicle instanceof Bus) {	//변수vehicle instanceof 타입Bus
			System.out.println("변경가능합니다.");
			Bus bus = (Bus) vehicle;	//강제 타입 변환
			bus.run();
			bus.checkFare();
		}
	}

}
