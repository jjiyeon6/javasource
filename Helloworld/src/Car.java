
public class Car {
	//feild
	String company = "BMW";
	String model = "M";
	String color;
	int maxSpeed;
	int currSpeed;
	
	//method
	//���ϰ� �޼ҵ�� �Ű�����
	//�޼����� �����ε�
	void start() {
		System.out.println("�õ� �θ��θ�!!");
	}
	
	void start(String word) {
		System.out.println("�õ� �θ��θ�!!"+word);
	}
	
	int add(int a, int b) {
		int result;
		result = a+b;
		return result;
	}
	
	int add(int a, int b, int c) {
		int result;
		result = add(a,b)+c;
		return result;
	}
	
	int add(double a, double b) {
		double result;
		result = a+b;
		return (int)result;
	}
	
	//Car(){}	������
	//�ʵ尪�� �����ڿ��� �ʱ�ȭ��ų �� �ִ�
	//�������� �����ε�
	Car(String _color){
		color = _color;
		maxSpeed = 300;
		currSpeed = 0;
	}
	
	Car(String _color, int _maxSpeed){
		color = _color;
		maxSpeed = _maxSpeed;
		currSpeed = 0;
	}
	
}
