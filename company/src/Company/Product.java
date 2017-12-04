package Company;

public class Product {
	int sno; //번호 30까지
	String name; //이름
	int price; //가격
	int num; //수량
	private static int cnt;
	
	public Product() {
	}
	
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
	
	@Override
	public boolean equals(Object obj) {
		Product p = null;
		if(obj != null && obj instanceof Product) {
			p = (Product)obj;
			if(p.getNum() == this.sno)
				return true;
		}
		return false;
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
}
