package battle;

public class Marine implements Unit {	//보병
	int x, y;	//현재위치
	
	@Override
	public void move(int x, int y) {}
	
	@Override
	public void stop() {
		System.out.println("marine stop");
	}
	
	void stimPack() {
		System.out.println("marine stimPack");
	}
}
