package order;

import java.sql.Date;

public class Order {
	
	private int order_num;
	private int sno;
	private int num;
	private int total_price;
	private Date o_date;
	private String result;
	
	public Order() {}
	public Order(int order_num, int sno, int num) {
		this.order_num = order_num;
		this.sno = sno;
		this.num = num;
	}
	public Order(int order_num, int sno, int num, int total_price, Date o_date, String result) {
		this.order_num = order_num;
		this.sno = sno;
		this.num = num;
		this.total_price = total_price;
		this.o_date = o_date;
		this.result = result;
	}
	
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Order [order_num=" + order_num + ", sno=" + sno + ", num=" + num + ", total_price=" + total_price
				+ ", o_date=" + o_date + ", result=" + result + "]";
	}
}
