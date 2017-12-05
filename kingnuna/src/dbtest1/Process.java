package dbtest1;

import java.util.Scanner;

import order.Order;

public class Process {
	private Service serviceP; // ���弭��
	private order.Service serviceO; // ����������

	public Process() {
		serviceP = new ServiceImpl();
		serviceO = new order.ServiceImpl();
	}

	public String checkResult(Scanner sc) {
		System.out.println("����");
		System.out.println("������ �ֹ���ȣ");
		int order_num = sc.nextInt();
		Order o = serviceO.getOrder(order_num);
		if (o != null && o.getResult().equals("N")) {
			if(serviceP.editNum(o.getSno(), o.getNum())) {//�ֹ������� ��� ��
				serviceO.makeResult(order_num);
			} else {
				System.out.println("������������ �ֹ����");
			}
		} else {
			System.out.println("���ų� �̹� ������ �ֹ���");
		}
		return "false";
	}
	
	public void delOrder(Scanner sc) {
		System.out.println("����");
		System.out.println("������ �ֹ���ȣ");
		int order_num = sc.nextInt();
		Order o = serviceO.getOrder(order_num);
		if( o!=null && o.getResult().equals("N")) {
			serviceO.delOrder(order_num);
		} else {
			System.out.println("���ų� �̹� �����Ͽ� ��� �Ұ�");
		}
	}

	public void menuO(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		int order_num = 0;
		while (flag) {
			System.out.println("1.�ֹ� 2.�ֹ��˻� 3.���� 4.���� 5.�ֹ���� 6.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				serviceO.addOrder(sc);
				break;
			case 2:
				System.out.println("�ֹ���ȸ");
				System.out.println("�ֹ���ȣ");
				order_num = sc.nextInt();
				System.out.println(serviceO.getOrder(order_num));
				break;
			case 3:
				checkResult(sc);
//				serviceO.makeResult(sc);
				break;
			case 4:
				delOrder(sc);
//				serviceO.delOrder(sc);
				break;
			case 5:
				serviceO.getOrders();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}

	public void menuP(Scanner sc) {
		boolean flag = true;
		int menu = 0, sno = 0;
		while (flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				serviceP.addProduct(sc);
				break;
			case 2:
				System.out.println("sno:");
				sno = sc.nextInt();
				System.out.println(serviceP.getProduct(sno));
				break;
			case 3:
				serviceP.editProduct(sc);
				break;
			case 4:
				serviceP.delProduct(sc);
				break;
			case 5:
				serviceP.getAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
}
