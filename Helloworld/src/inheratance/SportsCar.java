package inheratance;

public class SportsCar extends Car {
	int airbag = 8;
	
	SportsCar(){
//		super();	//부모의 기본 생성자를 호출하는데 기본적으로 생략
		super("super");
		System.out.println("SportsCar() : 자식 생성자");
		this.maxSpeed = 300;
	}
	
	void run() {
		System.out.println("스포츠카가 달립니다.");
	}
}
