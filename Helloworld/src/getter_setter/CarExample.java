package getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("����ӵ�: "+myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("����ӵ�2: "+myCar.getSpeed());
		
		//����
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("����ӵ�3: "+myCar.getSpeed());
	}

}