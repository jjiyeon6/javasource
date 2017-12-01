package buy;

public class Product {

	public int price;
	public int point;
}

class Tv extends Product{
	public Tv() {
		price = 100;
		point = 10;
	}
}

class Audio extends Product{
	public Audio() {
		price = 200;
		point = 20;
	}
}

class Computer extends Product{
	public Computer() {
		price = 300;
		point = 30;
	}
}

class Buyer{
	public int money;
	public int point;
	
	public Buyer() {
		money = 1000;
		point = 0;
	}
	
//	public void buy(Tv tv) {
//		if(money < tv.price) {
//			System.out.println("ÀÜ¾×ºÎÁ·");
//			return;
//		}
//		money -= tv.price;
//		point += tv.point;
//		System.out.println("money: "+money+", point: "+point);
//	}
//	
//	public void buy(Audio audio) {
//		if(money < audio.price) {
//			System.out.println("ÀÜ¾×ºÎÁ·");
//			return;
//		}
//		money -= audio.price;
//		point += audio.point;
//		System.out.println("money: "+money+", point: "+point);
//	}
//	
//	public void buy(Computer computer) {
//		if(money < computer.price) {
//			System.out.println("ÀÜ¾×ºÎÁ·");
//			return;
//		}
//		money -= computer.price;
//		point += computer.point;
//		System.out.println("money: "+money+", point: "+point);
//	}
	
	public void buy(Product p) {
		if(money < p.price) {
			System.out.println("ÀÜ¾×ºÎÁ·");
			return;
		}
		money -= p.price;
		point += p.point;
		System.out.println("money: "+money+", point: "+point);
	}
	
}