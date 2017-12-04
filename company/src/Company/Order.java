package Company;

public class Order extends Product {
	private int ono;
	private boolean payCom = false;
	private static int cnt1;

	public Order() {
		
	}
	public Order(int sno, int num) {
		this.ono = ++cnt1;
		this.sno = sno;
		this.num = num;
	}
	public int getOno() {
		return ono;
	}
	public void setOno(int ono) {
		this.ono = ono;
	}
	public boolean isPayCom() {
		return payCom;
	}
	public void setPayCom(boolean payCom) {
		this.payCom = payCom;
	}

}
