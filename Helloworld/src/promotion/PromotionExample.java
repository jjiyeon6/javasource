package promotion;
//한 자바파일내 여러개의 클래스를 사용할 수 있지만 자바파일명과 같은 이름의 public class는 하나 뿐이다.

class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}

public class PromotionExample {	//대표 class

	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a = new A();
	
	A ab = new B();
	A ac = new C();
	A ad = new D();
	A ae = new E();
	//상속한 자식 객체만 자동 형변환이 가능하다.

	B bd = new D();
	C ce = new E();

	//상속받지 않은 자식 객체는 생성할 수 없다.
//	C cd = new D();
//	B be = new E();
//	
//	D da = new A();
}
