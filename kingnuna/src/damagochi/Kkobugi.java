package damagochi;

public class Kkobugi extends PocketMon {
	
	public Kkobugi() {
		hp = 30;
		exp = 0;
		level = 1;
		x = 30;
		System.out.println("���α� ������");
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
		return hp <= 0; //hp�� 0���� ������ true�� �����Ѱ� ��
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
	
	public void ������() {
		System.out.println("������ ����");
	}


}
