package product;

public class Product {

	private int sno;	//제품번호
	private String name;//제품명
	private int price;	//제품가격
	private int num;	//제품갯수
	private static int cnt;	//제품번호 자동 count
	//static멤버: 객체생성 유무와 상관없이 static메모리에 있고 Product클래스 안에서
	//맨 처음만 초기화되고
	
	public Product() {}
	public Product(String name, int price, int num) {
		this.sno = ++cnt;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public Product(int sno, String name, int price, int num) {
		this.sno = sno;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Product [sno=" + sno + ", name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
}
