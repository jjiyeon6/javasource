package damagochi;

public class Kkobugi extends PocketMon {
	
	public Kkobugi() {
		hp = 30;
		exp = 0;
		level = 1;
		x = 30;
		System.out.println("꼬부기 생성됨");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		hp += 8;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		hp += 13;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		super.play();
		hp -= 15;
		exp += 17;
		levelUp();
		return hp <= 0; //hp가 0보다 작으면 true를 리턴한고 끝
	}

	@Override
	public boolean exc() {
		// TODO Auto-generated method stub
		super.exc();
		hp -= 20;
		exp += 20;
		levelUp();
		return hp <= 0;
	}
	
	public void 물대포() {
		System.out.println("물대포 공격");
	}


}
