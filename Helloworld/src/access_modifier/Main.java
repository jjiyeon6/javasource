package access_modifier;

public class Main {

	public static void main(String[] args) {
		SCV scv1 = new SCV();
		
		scv1.attack();
		scv1.defence();
		
//		scv1.hp = 200;
		scv1.setHp(200);
//		System.out.println(hp);
		System.out.println(scv1.getHp());
		
//		System.out.println("SCV1:"+ scv1.hp);
//		System.out.println("SCV1:"+ scv1.attack);
//		System.out.println("SCV1:"+ scv1.defence);
	}

}
