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
			System.out.println("1.��ǰ ����Ʈ 2.�ֹ� �߰� 3.���� 4.�ֹ� ��� 5.�ֹ� ����Ʈ 6.����");
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
			System.out.println("��ǰ����: ");
			int num = sc.nextInt();
			if(num <= p.getNum()) {
				dao.add(new Order(p.sno, num));
				System.out.println("�ֹ� �߰���");
				return;
			}
		}
		
		System.out.println("��ǰ ����");
	}
	
	public void payOrder(Dao fDao) {
		System.out.println("��ٱ��Ϲ�ȣ: ");
		int ono = sc.nextInt();
		Order ord =  (Order)dao.get(ono);
		if(ord.isPayCom() == false) {
			Product p = fDao.get(ord.getSno());
			fDao.edit(ord.getSno(), p.getNum() - ord.num);
			//p.setNum(p.getNum() - ord.num);
			ord.setPayCom(true);
			System.out.println("�����Ϸ�");
		}
		else {
			System.out.println("�̹� ���� �Ϸ�");
		}
	}
	
	public void cancelOrder() {
		System.out.println("��ٱ��Ϲ�ȣ: ");
		int ono = sc.nextInt();
		Order ord = (Order)dao.get(ono);
		if(ord.isPayCom() == true) { 		//((Order)dao.get(ono)).isPayCom();
			System.out.println("�̹� ���� �Ϸ�");
		}
		else {
			dao.delete(ono);
			System.out.println("�ֹ� ��� �Ϸ�");
		}
	}
	
	
	
	public void printAll() {
		System.out.println("��ü ���");
		ArrayList<Product> orderList = dao.getAll();
		Iterator<Product> it = orderList.iterator();   // Iterator�� �ݺ������� ���� �������� �ݺ����̴�
		Order o = null;
	      while(it.hasNext()) {               // ���̻� ���� ���� �ִ��� ������ üũ
	    	 o = (Order)it.next();
	         System.out.print("��ٱ��� ��ȣ: " + o.getOno() + " ��ǰ��ȣ: " + o.getSno() + 
	        		 " ����: " + o.getNum());         
	         if(o.isPayCom() == true)
	        	 System.out.println(" ���� Ȯ��: �Ϸ�");
	         else
	        	 System.out.println(" ���� Ȯ��: �̿Ϸ�");
	      }
	}
//	private int ono;
//	private int sno;
//	private int num;
//	private boolean payCom = false;
}
