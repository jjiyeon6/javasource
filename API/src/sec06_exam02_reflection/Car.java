package sec06_exam02_reflection;

public class Car{
	
	//feild
	private int speed;
	private boolean stop;
	
	//constructor
	Car() {
//		System.out.println("Car() : 何葛 积己磊");
	}
	
	Car(String name) {
//		System.out.println("Car() : 何葛 积己磊2" +name);
	}
	
	//method
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
