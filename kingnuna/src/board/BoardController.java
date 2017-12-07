package board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import member.Controller;

public class BoardController {
	private Service serviceB;
	
	public BoardController() {
		serviceB = new ServiceImpl();
	}
	
	//���ۼ� - id���Է¹��� �ʰ� member.Controller.loginId �α��εȻ��¿����� �ۼ�. pwd title content �Է¹޾� �ۼ�
	public void write(Scanner sc) {
		if(Controller.loginId.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		} else {
			System.out.println("���� �ۼ�");
			Board b = new Board();
			System.out.println("����:");
			b.setTitle(sc.next());
			System.out.println("����:");
			b.setContent(sc.next());

			b.setId(Controller.loginId);
			System.out.println("����Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
			int result = sc.nextInt();
			if (result == 1) {
				System.out.println("��й�ȣ:");
				b.setPwd(sc.next());
				serviceB.addArticle(b);
				System.out.println("������ ��ϵǾ����ϴ�");
			} else {
				System.out.println("��ҵǾ����ϴ�");
			}
		}
	}
	//�۰˻� - num �Է�.
	public void search(Scanner sc) {
		if(Controller.loginId.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		} else {
			System.out.println("�۰˻�");
			System.out.println("�۹�ȣ:");
			Board b = serviceB.getArticle(sc.nextInt());
			if(b==null) {
				System.out.println("���� �����ϴ�.");
			} else {
				System.out.println(b);
			}
		}
	}
	
	//�ۼ��� - num �Է�.pwd �Է¹޾� �´��� Ȯ��. ��title, ��content�Է¹޾Ƽ� ����
	public void modify(Scanner sc) {
		if(Controller.loginId.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		} else {
			System.out.println("������ �۹�ȣ:");
			Board b = serviceB.getArticle(sc.nextInt());
			if(b==null) {
				System.out.println("���� �����ϴ�.");
			} else {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String pwd = sc.next();
				System.out.println(b.getPwd() +"  "+pwd);
				if(!b.getPwd().equals(pwd)) {
					System.out.println("��й�ȣ�� Ʋ���ϴ�");
				} else {
					System.out.println(b);
					System.out.println("������ ����:");
					b.setTitle(sc.next());
					System.out.println("������ ����:");
					b.setContent(sc.next());
					serviceB.editArticle(b);
					System.out.println(b);
					System.out.println("�����Ǿ����ϴ�");
				}
			}
		}
	}
	
	//�ۻ��� - num �Է�.pwd �Է¹޾� �´��� Ȯ��. (�����Ұž�?)����
	public void delete(Scanner sc) {
		if(Controller.loginId.equals("")) {
			System.out.println("�α����ϼ���");
			return;
		} else {
			System.out.println("������ �۹�ȣ");
			Board b = serviceB.getArticle(sc.nextInt());
			if(b==null) {
				System.out.println("���� �����ϴ�.");
			} else {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String pwd = sc.next();
				System.out.println(b.getPwd() +"  "+pwd);
				if(!b.getPwd().equals(pwd)) {
					System.out.println("��й�ȣ�� Ʋ���ϴ�");
				} else {
					System.out.println("���� �����Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
					int result = sc.nextInt();
					if (result == 1) {
						serviceB.delArticle(sc.nextInt());
						System.out.println("�����Ǿ����ϴ�");
					} else {
						System.out.println("��ҵǾ����ϴ�");
					}
				}
			}	
		}	
	}
	
	//����ü���
	public void printAll() {
		System.out.println("����ü���");
		serviceB.getAll();
		
//		ArrayList<Board> list = serviceB.getAll();
//		Iterator<Board> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
	
	public void menuB(Scanner sc) {
		if(Controller.loginId.equals("")) {	
			System.out.println("�α����ϼ���");
			return;
		} else {
			boolean flag = true;
			int menu = 0;
			while (flag) {
				System.out.println("1.���ۼ� 2.�۰˻� 3.�ۼ��� 4.�ۻ��� 5.��ü��� 6.����");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					write(sc);
					break;
				case 2:
					search(sc);
					break;
				case 3:
					modify(sc);
					break;
				case 4:
					delete(sc);
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
	}	
					
			
}
