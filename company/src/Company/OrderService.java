package Company;

import java.util.*;

public class OrderService {
	private Dao dao;
	private Scanner sc;
	
	public OrderService(Scanner sc) {
		dao = new Dao();
		this.sc = sc;
	}
	
	public void run(Service service) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.제품 리스트 2.주문 추가 3.결제 4.주문 취소 5.주문 리스트 6.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				service.printAll();
				break;
			case 2:
				addOrder(service.getProduct());
				break;
			case 3:
				payOrder(service.getDao());
				break;
			case 4:
				cancelOrder();
				break;
			case 5:
				printAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
	
	public void addOrder(Product p) {
		if(p != null) {
			System.out.println("제품갯수: ");
			int num = sc.nextInt();
			if(num <= p.getNum()) {
				dao.add(new Order(p.sno, num));
				System.out.println("주문 추가됨");
				return;
			}
		}
		
		System.out.println("제품 없음");
	}
	
	public void payOrder(Dao fDao) {
		System.out.println("장바구니번호: ");
		int ono = sc.nextInt();
		Order ord =  (Order)dao.get(ono);
		if(ord.isPayCom() == false) {
			Product p = fDao.get(ord.getSno());
			fDao.edit(ord.getSno(), p.getNum() - ord.num);
			//p.setNum(p.getNum() - ord.num);
			ord.setPayCom(true);
			System.out.println("결제완료");
		}
		else {
			System.out.println("이미 결제 완료");
		}
	}
	
	public void cancelOrder() {
		System.out.println("장바구니번호: ");
		int ono = sc.nextInt();
		Order ord = (Order)dao.get(ono);
		if(ord.isPayCom() == true) { 		//((Order)dao.get(ono)).isPayCom();
			System.out.println("이미 결제 완료");
		}
		else {
			dao.delete(ono);
			System.out.println("주문 취소 완료");
		}
	}
	
	
	
	public void printAll() {
		System.out.println("전체 출력");
		ArrayList<Product> orderList = dao.getAll();
		Iterator<Product> it = orderList.iterator();   // Iterator은 반복적으로 값을 꺼내오는 반복자이다
		Order o = null;
	      while(it.hasNext()) {               // 더이상 읽을 값이 있는지 없는지 체크
	    	 o = (Order)it.next();
	         System.out.print("장바구니 번호: " + o.getOno() + " 제품번호: " + o.getSno() + 
	        		 " 갯수: " + o.getNum());         
	         if(o.isPayCom() == true)
	        	 System.out.println(" 결제 확인: 완료");
	         else
	        	 System.out.println(" 결제 확인: 미완료");
	      }
	}
//	private int ono;
//	private int sno;
//	private int num;
//	private boolean payCom = false;
}
