package battle;

public class Dropship implements Unit {	//수송선
	
	int x, y;	//현재위치
	
	@Override
	public void move(int x, int y) {}
	
	@Override
	public void stop() {
		System.out.println("dropship stop");
	}
	
	void load() {
		System.out.println("dropship load");
	}
	void unload() {}

}
