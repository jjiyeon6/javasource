package battle;

public class BattleExample {

	public static void main(String[] args) {
		
		//��ü ���� Ÿ�� 3����
		
		//#1 ��ü
		Marine marine = new Marine();
		marine.stop();
		Tank tank = new Tank();
		tank.stop();
		Dropship dropship = new Dropship();
		dropship.stop();
		
		System.out.println("--------------");
		
		//#2 �ڵ�����ȯ
		Unit unit = new Marine();
		unit.stop();
		
		unit = new Tank();
		unit.stop();
		
		unit = new Dropship();
		unit.stop();
		
		System.out.println("--------------");
		
		//���� Ÿ�� ��ȯ
//		if(unit instanceof Marine) {	//��ü Ÿ�� Ȯ��
//			System.out.println("ok");
//			Marine marine = (Marine) unit; 
//			marine.stop();
//			marine.stimPack();
//		}
		
		//#3
		unitMove(new Marine());
		unitMove(new Tank());
		unitMove(new Dropship());
		
	}
	
	public static void unitMove(Unit unit) {
		unit.move(1, 2);
		unit.stop();
	}

}
