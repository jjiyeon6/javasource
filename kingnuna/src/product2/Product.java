package product2;

public class Product {

	private int sno;	//��ǰ��ȣ
	private String name;//��ǰ��
	private int price;	//��ǰ����
	private int num;	//��ǰ����
	private static int cnt;	//��ǰ��ȣ �ڵ� count
	//static���: ��ü���� ������ ������� static�޸𸮿� �ְ� ProductŬ���� �ȿ���
	//�� ó���� �ʱ�ȭ�ǰ�
	
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
	
	//��ü�� ���ϴ� equals �� ����ϱ� ���� ��ӹ޾� Ŭ�������� ������(override)
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Product p = null;
		if(obj != null && obj instanceof Product) {
			p = (Product)obj;//obj�� down casting
			if(p.getSno() == this.sno) {
				return true;
			}
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
	
	@Override
	public String toString() {
		return "Product [sno=" + sno + ", name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
}
