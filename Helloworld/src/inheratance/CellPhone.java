package inheratance;

public class CellPhone {
	//field
	String model;
	String color;
	
	//constructor
	
	//method
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	void sendVoice(String message) {
		System.out.println("�ڱ�: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("����: " + message);
	}
	
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
