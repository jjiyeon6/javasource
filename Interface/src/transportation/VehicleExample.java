package transportation;

public class VehicleExample {

	public static void main(String[] args) {

//		Vehicle vehicle = new Vehicle(); //�������̽��z ��üȭ��Ű�� ���Ѵ�
		Vehicle vehicle = new Bus();	//�ڵ� ����ȯ
		vehicle.run();	//Vehicle.java �������̽����� ���� -> Bus.java bus class���� ����
//		vehicle.checkFare();	//
		vehicle.electCharge();
		
		vehicle = new Taxi();	//�ڵ� ����ȯ
		vehicle.run();
		vehicle.electCharge();
		
		vehicle = new Airplane();	//�ڵ� ����ȯ
		vehicle.run();
		vehicle.electCharge();
		
		
		//��ü Ÿ�� Ȯ��
		if (vehicle instanceof Bus) {	//����vehicle instanceof Ÿ��Bus
			System.out.println("���氡���մϴ�.");
			Bus bus = (Bus) vehicle;	//���� Ÿ�� ��ȯ
			bus.run();
			bus.checkFare();
		}
	}

}
