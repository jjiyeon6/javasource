package inheratance;

public class DmbCellPhone extends CellPhone {	//CellPhone���κ��� ���
	//feild
	int channel;
	
	//constructor
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("ä�� "+ channel +"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+ channel +"������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
