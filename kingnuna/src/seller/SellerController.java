package seller;

import java.util.ArrayList;
import java.util.Scanner;

import member.Controller;

public class SellerController {
	private Service serviceS;
	
	public SellerController() {
		serviceS = new ServiceImpl();
	}

	public boolean loginCheck() {
		return Controller.loginId.equals("");
	}
	
	//1.�Ǹŵ��
	public void regist(Scanner sc) {
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("�Ǹ� ���");
		Seller s = new Seller();
		s.setId(member.Controller.loginId);
		System.out.println("�Ǹ�����:");
		s.setTitle(sc.next());
		System.out.println("����:");
		s.setExplain(sc.next());
		System.out.println("����:");
		s.setPrice(sc.nextInt());
		System.out.println("����:");
		s.setQty(sc.nextInt());
		System.out.println(s);
		serviceS.addGoods(s);
		System.out.println("��ϵǾ����ϴ�");
	}
	
	public void printAll(ArrayList<Seller> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	//2.����ǰ���
	public void getMyGoods() {
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		printAll(serviceS.getMyAll(member.Controller.loginId));
	}
	//3.��ü��ǰ���
	public void getAll() {
		printAll(serviceS.getAll());
	}
	
	//4.����
	public void editGoods(Scanner sc) {
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("�Ǹ� ����");
		System.out.println("������ ��ǰ��ȣ:");
		Seller s = serviceS.getGoodsByNum(sc.nextInt());
		if(s==null) {
			System.out.println("������ ��ǰ�� �����ϴ�");
		} else {
			System.out.println("������ �Ǹ���ǰ");
			System.out.println(s);
		}
		if(s.getId().equals(member.Controller.loginId)) {
			System.out.println("����:");
			s.setExplain(sc.next());
			System.out.println("����:");
			s.setPrice(sc.nextInt());
			System.out.println("����:");
			s.setQty(sc.nextInt());
			System.out.println(s);
			serviceS.editGoods(s);
			System.out.println("�����Ǿ����ϴ�");
		} else {
			System.out.println("������ ����� ��ǰ�� ������ �� �ֽ��ϴ�");
		}
	}
	
	//5.����
	public void delGoods(Scanner sc) {
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("�Ǹ� ����");
		System.out.println("������ ��ǰ��ȣ:");
		int num = sc.nextInt();
		Seller s = serviceS.getGoodsByNum(num);
		if(s==null) {
			System.out.println("������ ��ǰ�� �����ϴ�");
		}
		if(s.getId().equals(member.Controller.loginId)) {
			serviceS.delGoods(num);
			System.out.println("�����Ǿ����ϴ�");
		} else {
			System.out.println("������ ����� ��ǰ�� ������ �� �ֽ��ϴ�");
		}
	}
	
	//6.��ǰ�����ΰ˻�
	public void getGoodsByTitle(Scanner sc) {
		System.out.println("�ǸŸ����� �˻�");
		System.out.println("title:");
		ArrayList<Seller> list = serviceS.getGoodsByTitle(sc.next());
		if(list.size()==0) {
			System.out.println("�˻��� ����� �����ϴ�");
		} else {
			printAll(list);
		}
	}
	
	//7.��ȣ�ΰ˻�
	public void getGoodsByNum(Scanner sc) {
		System.out.println("�ǸŹ�ȣ�� �˻�");
		System.out.println("num:");
		Seller s = serviceS.getGoodsByNum(sc.nextInt());
		if (s == null) {
			System.out.println("�˻��� ����� �����ϴ�");
		} else {
			System.out.println(s);
		}
	}
}
