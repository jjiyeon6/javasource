package product;

public class Dao {

	private Product[] datas;
	private int cnt;	//�迭�� �ִ� data�� ��
	
	public Dao(Product[] datas) {
		this.datas = datas;
	}
	
	public void add(Product p) {
		datas[cnt] = p;
		cnt++;
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
	
	public boolean edit(Product p) {
		return false;
	}

	public boolean delete(int sno) {
		for(int i=0; i<cnt; i++) {
			if(sno == datas[i].getSno()) {
				datas[i] = null;
				datas[i] = datas[i+1];
				cnt--;
			}
		}
		return false;
	}
	
	public Product[] getAll() {//�迭 ��ü�� ��ȯ
		return datas;
	}
	
	public int getCnt() {
		return cnt;
	}
}
