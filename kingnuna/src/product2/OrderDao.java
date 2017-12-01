package product2;

import java.util.ArrayList;

public class OrderDao {
	private ArrayList<Order> datas;

	public OrderDao() {
		datas = new ArrayList<Order>();
	}
	
	public void add(Order o) {
		datas.add(o);
	}
	
	public int search(Order o) {System.out.println("search()"+o);
		if(datas.contains(o)) {//parameter p�� ��ü�� arrayList datas�� ���� ��ü�� �ִ°� Ȯ��
			System.out.println(datas.indexOf(o));
			return datas.indexOf(o);//��ü�� ��ġ�� ��ȯ
		}
		return -1;
	}
	
	public Order get(Order o) {
		int idx = search(o);
		if(idx <= -1) {
			return null;
		}
		return datas.get(idx);
	}
	
	public boolean edit(Order o) {
		int idx = search(o);
		if(idx <= -1) {
			return false;
		}
		Order x = datas.get(idx);//x�� �������̹Ƿ� ������ ���� �ٽ� arrayList�� �־� �� �ʿ䰡 ����.
		x.setOrderNum(o.getOrderNum());
		return true;
	}

	public boolean delete(Order o) {
		int idx = search(o);
		if(idx <= -1) {System.out.println("false");
			return false;
		}
		datas.remove(idx);
		return true;
	}
	
	public ArrayList<Order> getAll() {//�迭 ��ü�� ��ȯ
		return datas;
	}
}
