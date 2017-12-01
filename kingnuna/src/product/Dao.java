package product;

public class Dao {

	private Product[] datas;
	private int cnt;	//배열에 있는 data의 수
	
	public Dao(Product[] datas) {
		this.datas = datas;
	}
	
	public void add(Product p) {
		if(cnt<datas.length) {
			datas[cnt] = p;
			cnt++;
		} else {
			System.out.println("배열이 가득 참");
		}
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
	
//	public boolean edit(int sno, Product p) {
	public boolean edit(Product p) {	
		int idx = search(p.getSno());
		if(idx <= -1) {
			System.out.println("수정 취소");
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
	
	public Product[] getAll() {//배열 전체를 반환
		return datas;
	}
	
	public int getCnt() {
		return cnt;
	}
}
