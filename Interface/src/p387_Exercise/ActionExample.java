package p387_Exercise;

public class ActionExample {

	public static void main(String[] args) {

		Action ac = new Action() {
			public void work() {
				System.out.println("work!!");
			}
		};
		
		ac.work();
	}
	
}
