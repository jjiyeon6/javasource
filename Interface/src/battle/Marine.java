package battle;

public class Marine implements Unit {	//����
	int x, y;	//������ġ
	
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
