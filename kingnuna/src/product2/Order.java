package product2;

public class Order {
	private int orderNo;	//�ֹ���ȣ
	private int sno;		//��ǰ��ȣ
	private int orderNum;	//��ǰ�ֹ�����
	private static int cnt;	//��ǰ��ȣ �ڵ� count
	
	public Order() {}
	
	public Order(int sno, int orderNum) {
		this.orderNo = ++cnt;
		this.sno = sno;
		this.orderNum = orderNum;
	}
	
	public Order(int orderNo, int sno, int orderNum) {
		this.orderNo = orderNo;
		this.sno = sno;
		this.orderNum = orderNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Order o = null;
		if(obj != null && obj instanceof Order) {
			o = (Order)obj;//obj�� down casting
			if(o.getSno() == this.sno) {
				return true;
			}
		}
		return false;
		
	}

	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", sno=" + sno + ", orderNum=" + orderNum + "]";
	}
}
