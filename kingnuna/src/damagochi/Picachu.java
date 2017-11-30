package damagochi;

public class Picachu extends PocketMon {
	
	public Picachu() {
		hp = 30;
		exp = 0;
		level = 1;
		x = 30;
		System.out.println("피카추 생성됨");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		hp += 10;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		hp += 15;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		super.play();
		hp -= 20;
		exp += 15;
		levelUp();
		return hp <= 0; //hp가 0보다 작으면 true를 리턴한고 끝
	}

	@Override
	public boolean exc() {
		// TODO Auto-generated method stub
		super.exc();
		hp -= 30;
		exp += 25;
		levelUp();
		return hp <= 0;
	}

	public void 전기공격() {
		System.out.println("100만볼트 공격");
	}

}
