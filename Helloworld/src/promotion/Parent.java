package promotion;

public class Parent {
	
	public void method1(Parent parent) {//method에 Parent클래스를 매개변수로 받음 
		if(parent instanceof Child) {//parent에 Child가 들어갈 수 있는지 확인
			System.out.println("Parent가 Child로 강제 형변환 가능");
		} else {
			System.out.println("Parent가 Child로 변환 불가 x");
		}
	}
	
	public void method2(Parent parent) {
		if(parent instanceof Parent) {
			System.out.println("Parent가 Parent로 강제 형변환 가능");
		} else {
			System.out.println("Parent가 Parent로 강제 형변환 불가능");
		}
	}
}
