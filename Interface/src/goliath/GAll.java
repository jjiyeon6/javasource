package goliath;

public class GAll {

	public static void main(String[] args) {

		//인터페이스는 객체화할 수 없지만
		//인터페이스에 선언된 추상 메소드를 {}안에 선언해서 구현한다.
		//따로 클래스를 만들지 않고 한번만 사용하기 위한 경우
		GtoA ga = new GtoA() {
			public void attackAir() {
				System.out.println("익명 구현 객체!");
			}
		};
		
		ga.attackAir();
	}

}
