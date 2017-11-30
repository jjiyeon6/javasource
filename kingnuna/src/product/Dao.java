package product;

public class Dao {

	private Product[] datas;
	private int cnt;	//배열에 있는 data의 수
	
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
		System.out.println("없는 번호");
		return -1;
	}
	
	public Product get(int sno) {//배열에서 있는 위치값 확인
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
	
	public Product[] getAll() {//배열 전체를 반환
		return datas;
	}
	
	public int getCnt() {
		return cnt;
	}
}
