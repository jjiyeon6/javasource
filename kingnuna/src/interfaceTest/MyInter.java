package interfaceTest;

public interface MyInter {
	//상수
	int MAX = 10;//상수(final static 생략). 선언함과 동시에 초기값 설정
	void test1();//(public abstract 생략)
	//추상메소드
	int test2();//(public abstract 생략)
}

//추상클래스 -상속받은 클래스를 일부만
//abstract class Test1 implements MyInter{

//자바는 단일상속
//인터페이스는 다중상속 가능
//인터페이스는 컴퍼넌트와 컴퍼넌트의 연결고리로 사용
//인터페이스는 추상메소드를 선언만 해놓고
class Test1 implements MyInter{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1:test1");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("Test1:test2");
		return MAX;
	}
	
}

class Test2 implements MyInter{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test2:test1");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2:test2");
		return MAX;
	}
	
}