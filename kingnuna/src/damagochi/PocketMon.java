package damagochi;

public class PocketMon {
	
	protected int hp;
	protected int exp;
	protected int level;
	protected int x;
	
	public void eat() {
		System.out.println("¹ä ¸Ô´Â´Ù");
	}
	
	public void sleep() {
		System.out.println("ÀáÀÜ´Ù");
	}

	public boolean play() {
		System.out.println("³í´Ù");
		return false;
	}
	
	public boolean exc() {
		System.out.println("¿îµ¿ÇÑ´Ù");
		return false;
	}
	
	public void levelUp() {
		if (exp >= x) {
			level++;
			exp -= x;
			System.out.println("·¹º§¾÷");
		}
	}
	
	public void printInfo() {
		System.out.println("hp: " + hp);
		System.out.println("exp: " + exp);
		System.out.println("level: " + level);
	}
}


