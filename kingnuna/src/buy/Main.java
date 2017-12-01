package buy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Product[] p = new Product[] {new Tv(), new Audio(), new Computer(),
									new Computer(), new Tv(), new Audio()};
		for(int i=0; i<p.length; i++) {
			b.buy(p[i]);
		}
		
//		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Tv());
//		b.buy(new Audio());
		
	
	}

}
