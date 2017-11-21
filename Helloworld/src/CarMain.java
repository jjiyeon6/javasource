
public class CarMain {

	public static void main(String[] args) {
		//객체 생성
		Car bmw5 = new Car("Blue");	//인스턴스 bmw5			생성자 Car()
		Car bmwF = new Car("Red",300);	//생성자 Car()    매개변수"Blue""Red"
		
//		System.out.println(bmw5.company);
//		System.out.println("내차색깔"+bmw5.color);
//		System.out.println(bmw5.model);
//		System.out.println(bmw5.maxSpeed);
//		System.out.println(bmw5.currSpeed);
//		
//		bmw5.currSpeed = 100;
//		System.out.println(bmw5.currSpeed);
//		
//		System.out.println(bmwF.currSpeed);
//		
//		System.out.println("내차"+bmw5.color);
//		System.out.println("친구차"+bmwF.color);
//		System.out.println("내차"+bmw5.maxSpeed);
//		System.out.println("친구차"+bmwF.maxSpeed);
		
		bmw5.start();
		bmw5.start("달려");
		
		int re;
		re = bmw5.add(20.2, 30);
		re = bmw5.add(20, 30, 40);
		System.out.println(re);
		
	}

}
