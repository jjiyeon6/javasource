package access_modifier;

public class SCV {
	private int hp = 100;
	int attack = 10;
	int defence = 5;
	
	public void attack() {
		System.out.println("공격중입니다.");
	}
	
	void defence() {
		System.out.println("방어중입니다.");
	}
	
	int getHp() {
		return this.hp;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
	
}
