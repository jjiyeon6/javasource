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
	
	public boolean loginCheck() {
		return Controller.loginId.equals("");
	}
	
	//���ۼ� - id���Է¹��� �ʰ� member.Controller.loginId �α��εȻ��¿����� �ۼ�. pwd title content �Է¹޾� �ۼ�
	public void write(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("�α����ϼ���");
//			return;
//		} else {
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}	
			System.out.println("<���� �ۼ�>");
			Board b = new Board();
			b.setId(Controller.loginId);
			System.out.println("����:");
			sc.nextLine();
			b.setTitle(sc.nextLine());
			System.out.println("����:");
			b.setContent(sc.nextLine());
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
//		}
	}
	//�۰˻� - num �Է�.
	public void getByNum(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("�α����ϼ���");
//			return;
//		} else {
			System.out.println("<�� �˻�>");
			System.out.println("�۹�ȣ:");
			Board b = serviceB.getArticle(sc.nextInt());
			if(b==null) {
				System.out.println("���� �����ϴ�.");
			} else {
				System.out.println(b);
			}
//		}
	}
	
	//�ۼ��� - num �Է�.pwd �Է¹޾� �´��� Ȯ��. ��title, ��content�Է¹޾Ƽ� ����
	public void modify(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("�α����ϼ���");
//			return;
//		} else {
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
			System.out.println("<�� ����>");
			System.out.println("������ �۹�ȣ:");
//			Board b = serviceB.getArticle(sc.nextInt());
//			if(b==null) {
//				System.out.println("���� �����ϴ�.");
//			} else {
//				System.out.println("��й�ȣ�� �Է��ϼ���");
//				String pwd = sc.next();
//				System.out.println(b.getPwd() +"  "+pwd);
//				if(!b.getPwd().equals(pwd)) {
//					System.out.println("��й�ȣ�� Ʋ���ϴ�");
//				} else {
//					System.out.println(b);
//					System.out.println("������ ����:");
//					b.setTitle(sc.next());
//					System.out.println("������ ����:");
//					b.setContent(sc.next());
//					serviceB.editArticle(b);
//					System.out.println(b);
//					System.out.println("�����Ǿ����ϴ�");
//				}
//			}
			
			int num = sc.nextInt();
			String pwd = "";
			Board b = serviceB.getArticle(num);
			if(b==null) {
				System.out.println("���� �����ϴ�");
				return;
			} else {
				System.out.println("������ ����");
				System.out.println(b);
			}
			if(b.getId().equals(Controller.loginId)) {
				System.out.println("�� ��й�ȣ");
				pwd = sc.next();
				if(pwd.equals(b.getPwd())) {
					System.out.println("new title");
					b.setTitle(sc.next());
					System.out.println("new content");
					b.setContent(sc.next());
					serviceB.editArticle(b);
				} else {
					System.out.println("�� ��й�ȣ�� ���� �ʽ��ϴ�");
				}
			} else {
				System.out.println("�ٸ� ����� ���� ������ �� �����ϴ�");
			}
//		}
	}
	
	//�ۻ��� - num �Է�.pwd �Է¹޾� �´��� Ȯ��. (�����Ұž�?)����
	public void delete(Scanner sc) {
//		if(Controller.loginId.equals("")) {
//			System.out.println("�α����ϼ���");
//			return;
//		} else {
//			System.out.println("<�� ����>");
//			System.out.println("������ �۹�ȣ");
//			Board b = serviceB.getArticle(sc.nextInt());
//			if(b==null) {
//				System.out.println("���� �����ϴ�.");
//			} else {
//				System.out.println("��й�ȣ�� �Է��ϼ���");
//				String pwd = sc.next();
//				System.out.println(b.getPwd() +"  "+pwd);
//				if(!b.getPwd().equals(pwd)) {
//					System.out.println("��й�ȣ�� Ʋ���ϴ�");
//				} else {
//					System.out.println("���� �����Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
//					int result = sc.nextInt();
//					if (result == 1) {
//						serviceB.delArticle(sc.nextInt());
//						System.out.println("�����Ǿ����ϴ�");
//					} else {
//						System.out.println("��ҵǾ����ϴ�");
//					}
//				}
//			}	
//		}
		if(loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("<�� ����>");
		System.out.println("������ �۹�ȣ");
		int num = sc.nextInt();
		String pwd = "";
		Board b = serviceB.getArticle(num);
		if(b==null) {
			System.out.println("���� �����ϴ�");
			return;
		}
		if(b.getId().equals(Controller.loginId)) {
			System.out.println("�� ��й�ȣ");
			pwd = sc.next();
			if(pwd.equals(b.getPwd())) {
				serviceB.delArticle(num);
			} else {
				System.out.println("�� ��й�ȣ�� ���� �ʽ��ϴ�");
			}
		} else {
			System.out.println("�ٸ� ����� ���� ������ �� �����ϴ�");
		}
	}
	
	//����ü���
	public void getAll() {
		System.out.println("����ü���");
//		ArrayList<Board> list = serviceB.getAll();
//		Iterator<Board> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		printAll(serviceB.getAll());
	}
	
	public void printAll(ArrayList<Board> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void getByWriter(Scanner sc) {
		System.out.println("�� �ۼ��ڷ� �˻�");
		System.out.println("�ۼ��� ���̵�:");
		String id = sc.next();
		ArrayList<Board> list = serviceB.getArticleByWriter(id);
		if(list.size()==0) {
			System.out.println(id+"�� �ۼ��� ���� �����ϴ�.");
		} else {
			printAll(list);
		}
	}
	
	public void getByTitle(Scanner sc) {
		System.out.println("�� �������� �˻�");
		System.out.println("�� ����:");
		String title = sc.next();
		ArrayList<Board> list = serviceB.getArticleByTitle(title);
		if(list.size()==0) {
			System.out.println("�˻��� ���� �����ϴ�11.");
		} else {
			printAll(list);
		}
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
					getByNum(sc);
					break;
				case 3:
					modify(sc);
					break;
				case 4:
					delete(sc);
					break;
				case 5:
					getAll();
					break;
				case 6:
					flag = false;
					break;
				}
			}
		}
	}	
					
			
}
