package battle;

public class Tank implements Unit {		//탱크
	int x, y;	//현재위치
	
	@Override
	public void move(int x, int y) {}
	
	@Override
	public void stop() {
		System.out.println("tank stop");
	}
	
	void changeMode() {
		System.out.println("tank changeMode");
	}
}
