
public class CarMain {

	public static void main(String[] args) {
		//��ü ����
		Car bmw5 = new Car("Blue");	//�ν��Ͻ� bmw5			������ Car()
		Car bmwF = new Car("Red",300);	//������ Car()    �Ű�����"Blue""Red"
		
//		System.out.println(bmw5.company);
//		System.out.println("��������"+bmw5.color);
//		System.out.println(bmw5.model);
//		System.out.println(bmw5.maxSpeed);
//		System.out.println(bmw5.currSpeed);
//		
//		bmw5.currSpeed = 100;
//		System.out.println(bmw5.currSpeed);
//		
//		System.out.println(bmwF.currSpeed);
//		
//		System.out.println("����"+bmw5.color);
//		System.out.println("ģ����"+bmwF.color);
//		System.out.println("����"+bmw5.maxSpeed);
//		System.out.println("ģ����"+bmwF.maxSpeed);
		
		bmw5.start();
		bmw5.start("�޷�");
		
		int re;
		re = bmw5.add(20.2, 30);
		re = bmw5.add(20, 30, 40);
		System.out.println(re);
		
	}

}
