package Company;

import java.util.*;

public class Dao {
	private ArrayList<Product> datas;
		
	public Dao() {
		datas = new ArrayList<Product>();
	}
	
	public void add(Product p) {
		datas.add(p);
	}
	
	public int search(int sno) {
		for(int i = 0; i<datas.size(); i++) {
			if(datas.get(i).sno == sno) {
				return i;
			}
		}
		return -1;
	}
	
	public int search(Product p) {
		if(datas.contains(p)) {
			return datas.indexOf(p);
		}
		return -1;
	}
	
	public Product get(int sno) {
		int result = search(sno);
		if(result == -1)
			return null;
		Product x = datas.get(result);
		return x;
	}
	
	public Product get(Product p) {
		int result = search(p.getSno());
		if(result == -1)
			return null;
		Product x = datas.get(result);
		return x;
	}
	
	public boolean edit(Product p) {
		int no = search(p.getSno());
		if(no == -1)
			return false;
		Product x = datas.get(no);
		x.setPrice(p.getPrice());
		x.setNum(p.getNum());
		return true;
	}
	
	public boolean edit(int sno, int num) {
		Product x = get(sno);
		if(x == null)
			return false;
		x.setNum(num);
		return true;
	}
	
	public boolean delete(int sno) {
		int no = search(sno);
		if(no == -1)
			return false;
		datas.remove(no);
		return true;
	} 
	
	public boolean delete(Product p) {
		int no = search(p.getSno());
		if(no == -1)
			return false;
		datas.remove(no);
		return true;
	}
	
	public ArrayList<Product> getAll() {
		return datas;
	}
}
