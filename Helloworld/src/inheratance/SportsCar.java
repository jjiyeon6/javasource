package inheratance;

public class SportsCar extends Car {
	int airbag = 8;
	
	SportsCar(){
//		super();	//�θ��� �⺻ �����ڸ� ȣ���ϴµ� �⺻������ ����
		super("super");
		System.out.println("SportsCar() : �ڽ� ������");
		this.maxSpeed = 300;
	}
	
	void run() {
		System.out.println("������ī�� �޸��ϴ�.");
	}
}
