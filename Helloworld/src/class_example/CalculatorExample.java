package class_example;

public class CalculatorExample {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		//static 멤버는 인스턴스 생성하지 않고 클래스를 호출해서 사용 가능하다.
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
	}

}
