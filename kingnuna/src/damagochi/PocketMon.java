package damagochi;

public class PocketMon {
	
	protected int hp;
	protected int exp;
	protected int level;
	protected int x;
	
	public void eat() {
		System.out.println("�� �Դ´�");
	}
	
	public void sleep() {
		System.out.println("���ܴ�");
	}

	public boolean play() {
		System.out.println("���");
		return false;
	}
	
	public boolean exc() {
		System.out.println("��Ѵ�");
		return false;
	}
	
	public void levelUp() {
		if (exp >= x) {
			level++;
			exp -= x;
			System.out.println("������");
		}
	}
	
	public void printInfo() {
		System.out.println("hp: " + hp);
		System.out.println("exp: " + exp);
		System.out.println("level: " + level);
	}
}


