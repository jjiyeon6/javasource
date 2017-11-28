package battle;

public class BattleExample {

	public static void main(String[] args) {
		
		//객체 생성 타입 3가지
		
		//#1 객체
		Marine marine = new Marine();
		marine.stop();
		Tank tank = new Tank();
		tank.stop();
		Dropship dropship = new Dropship();
		dropship.stop();
		
		System.out.println("--------------");
		
		//#2 자동형변환
		Unit unit = new Marine();
		unit.stop();
		
		unit = new Tank();
		unit.stop();
		
		unit = new Dropship();
		unit.stop();
		
		System.out.println("--------------");
		
		//강제 타입 변환
//		if(unit instanceof Marine) {	//객체 타입 확인
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
