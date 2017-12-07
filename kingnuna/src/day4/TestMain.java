package day4;

import java.util.ArrayList;

class Test{
	private int x;
	private int y;
	private ArrayList<String> str;
	
	//파라미터없는 디폴트 생성자는 자동생성되지만
	//파라미터 있는 생성자를 하나라도 구현했으면 디폴트 생성자도 직접 선언해줘야 한다.
	public Test() {
		str = new ArrayList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
	}
	
	public Test(Test t) {//파라미터를 객체로 받는 생성자
		this();//다른 생성자를 호출 cf.)super();상위클래스의 생성자호출
				//첫째줄에 써야됨
		x = t.x;
		y = t.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	//파라메터로 크기가 2인 배열을 받아 배열안의 값으로 x,y를 초기화하는 메소드
	public void method1(int[] arr) {
		x = arr[0];
		y = arr[1];
	}
	
	public int getStr(String s) {
		return str.indexOf(s);
//		if(str.contains(s)) {
//			return str.indexOf(s);
//		}
//		return -1;
	}
	
	// 두 개의 객체가 동일할 조건 equals() 재정의해서 사용

	public String allStr() {
//		return str.toString();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.size(); i++) {
//			if(i!=0) {
//				sb.append(",");
//			}
			sb.append(str.get(i));
		}
		return sb.toString();
	}
	
	public ArrayList<String> getStr() {
		return str;
	}

	public void setStr(ArrayList<String> str) {
		this.str = str;
	}
	
	//현재 객체를 반환하는 함수
	public Test getTest() {
		return this;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
}

public class TestMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20};
		Test t = new Test();
		t.method1(a);
		System.out.println("t:"+t);
		
//		얕은 복사란 단순히 필드값을 복사해서 객체를 복사. 필드가 참조타입일 경우 객체의 번지가 복사됨
//		원본 객체의 필드와 복사된 객체의 필드는 같은 객체를 참조함
//		그래서 복사된 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지게 됨		
//		Test t2 = t;	//얕은 복사(같은 메모리 사용. t메모리)
		
//		System.out.println("t2:"+t2);
//		t2.setX(100);
//		t2.setY(200);
//		System.out.println("t:"+t);
		
		Test t2 = new Test(t);//
		t2.setX(100);
		t2.setY(200);
		System.out.println("t:"+t);
		System.out.println("t2:"+t2);
		
//		System.out.println(t.getStr("ccc"));
//		System.out.println(t.allStr());
		
		Test t3 = t.getTest();
		System.out.println("t3:"+t3);
		
	}

}
