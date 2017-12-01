package product;

public class Dao {

	private Product[] datas;
	private int cnt;	//�迭�� �ִ� data�� ��
	
	public Dao(Product[] datas) {
		this.datas = datas;
	}
	
	public void add(Product p) {
		if(cnt<datas.length) {
			datas[cnt] = p;
			cnt++;
		} else {
			System.out.println("�迭�� ���� ��");
		}
	}
	
	public int search(int sno) {
		for(int i=0; i<cnt; i++) {
			if(sno == datas[i].getSno()) {
				return i;
			}	
		}
		System.out.println("���� ��ȣ");
		return -1;
	}
	
	public Product get(int sno) {//�迭���� �ִ� ��ġ�� Ȯ��
		int idx = search(sno);
		if(idx == -1) {
			return null;
		}
		return datas[idx];
	}
	
//	public boolean edit(int sno, Product p) {
	public boolean edit(Product p) {	
		int idx = search(p.getSno());
		if(idx <= -1) {
			System.out.println("���� ���");
			return false;
		} else {
			datas[idx].setPrice(p.getPrice());
			datas[idx].setNum(p.getNum());
			return true;
		}
		
//		System.out.println("edit()");
//		for(int i=0; i<cnt; i++) {
//			if(sno == datas[i].getSno()) {
//				System.out.println(p);
//				p.setSno(datas[i].getSno());
//				datas[i] = p;
//				System.out.println(p);
//			}
//		}	
//		return false;
	}

	public boolean delete(int sno) {
		int idx = search(sno);
		if(idx == -1) {
			return false;
		} else {
			for(int i=idx; i<cnt-1; i++) {
				//todo
				System.out.println(idx+", "+cnt);
				System.out.println(datas[i]);
//				datas[i] = null;
				datas[i] = datas[i+1];
			}
			cnt--;
			return true;
		}
	}
	
	public Product[] getAll() {//�迭 ��ü�� ��ȯ
		return datas;
	}
	
	public int getCnt() {
		return cnt;
	}
}
