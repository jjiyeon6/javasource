package damagochi;

public class Esanghaessi extends PocketMon {
	
	public Esanghaessi() {
		hp = 30;
		exp = 0;
		level = 1;
		x = 30;
		System.out.println("�̻��ؾ� ������");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		hp += 13;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		hp += 16;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		super.play();
		hp -= 21;
		exp += 18;
		levelUp();
		return hp <= 0; //hp�� 0���� ������ true�� �����Ѱ� ��
	}

	@Override
	public boolean exc() {
		// TODO Auto-generated method stub
		super.exc();
		hp -= 20;
		exp += 28;
		levelUp();
		return hp <= 0;
	}

	public void ����() {
		System.out.println("���� ����");
	}
	
}
