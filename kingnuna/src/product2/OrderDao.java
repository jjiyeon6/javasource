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
		if(datas.contains(o)) {//parameter p의 객체가 arrayList datas에 같은 객체가 있는가 확인
			System.out.println(datas.indexOf(o));
			return datas.indexOf(o);//객체의 위치값 반환
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
		Order x = datas.get(idx);//x가 참조값이므로 수정한 값응 다시 arrayList에 넣어 줄 필요가 없다.
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
	
	public ArrayList<Order> getAll() {//배열 전체를 반환
		return datas;
	}
}
