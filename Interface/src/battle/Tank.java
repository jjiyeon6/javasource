package battle;

public class Tank implements Unit {		//��ũ
	int x, y;	//������ġ
	
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
