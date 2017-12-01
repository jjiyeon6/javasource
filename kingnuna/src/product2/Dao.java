package product2;

import java.util.ArrayList;

public class Dao {

	private ArrayList<Product> datas;
	
	public Dao() {
		datas = new ArrayList<Product>();
	}
	
	public void add(Product p) {
		datas.add(p);
	}
	
	public int search(Product p) {
		if(datas.contains(p)) {//parameter p의 객체가 arrayList datas에 같은 객체가 있는가 확인
			return datas.indexOf(p);//객체의 위치값 반환
		}
		return -1;
	}
	
	public Product get(Product p) {
		int idx = search(p);
		if(idx <= -1) {
			return null;
		}
		return datas.get(idx);
	}
	
	public boolean edit(Product p) {
		int idx = search(p);
		if(idx <= -1) {
			return false;
		}
		Product x = datas.get(idx);//x가 참조값이므로 수정한 값응 다시 arrayList에 넣어 줄 필요가 없다.
		x.setPrice(p.getPrice());
		x.setNum(p.getNum());
		return true;
	}

	public boolean delete(Product p) {
		int idx = search(p);
		if(idx <= -1) {
			return false;
		}
		datas.remove(idx);
		return true;
	}
	
	public ArrayList<Product> getAll() {//배열 전체를 반환
		return datas;
	}
	
}
