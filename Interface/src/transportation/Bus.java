package transportation;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("bus is running");
	}
	
	public void checkFare() {
		System.out.println("check fare");
	}
}
