package promotion;

//�߻�Ŭ����
//������ public
public abstract class Animal {
	
	//field
	public String kind;
	
	//constructor
	Animal() {
		System.out.println("Animal()");
	}
	
	//method
	void breathe() {
		System.out.println("Wild Breathe");
	}
	
	//�߻�޼ҵ�
	//input, output, method name
	//public �Ǵ� protected
	public abstract void sound();
}
