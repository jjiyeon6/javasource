package seller;

public class Seller {
	private int num;
	private String id;
	private String title;
	private String explain;
	private int price;
	private int qty;
	
	public Seller() {}
	public Seller(int num, String title, int price) {
		this.num = num;
		this.title = title;
		this.price = price;
	}
	public Seller(int num, String id, String title, String explain, int price, int qty) {
		this.num = num;
		this.id = id;
		this.title = title;
		this.explain = explain;
		this.price = price;
		this.qty = qty;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Seller [num=" + num + ", id=" + id + ", title=" + title + ", explain=" + explain + ", price=" + price
				+ ", qty=" + qty + "]";
	}
	
}
