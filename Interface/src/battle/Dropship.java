package battle;

public class Dropship implements Unit {	//���ۼ�
	
	int x, y;	//������ġ
	
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
