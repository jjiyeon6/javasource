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
		if(datas.contains(p)) {//parameter p�� ��ü�� arrayList datas�� ���� ��ü�� �ִ°� Ȯ��
			return datas.indexOf(p);//��ü�� ��ġ�� ��ȯ
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
		Product x = datas.get(idx);//x�� �������̹Ƿ� ������ ���� �ٽ� arrayList�� �־� �� �ʿ䰡 ����.
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
	
	public ArrayList<Product> getAll() {//�迭 ��ü�� ��ȯ
		return datas;
	}
	
}
