package grade;

import java.util.Scanner;

public class Grade_Controller {
private Service serviceG;
	
	public Grade_Controller() {
		serviceG= new ServiceImpl();
		
	}
	
	
	public void Insert_score(Scanner sc) {
		System.out.println("������ �Է��մϴ�");
		System.out.print("�л���ȣ:");
		Grade_Dto gd = new Grade_Dto();
		gd.setStu_num(sc.nextInt());;
		System.out.println("������ �Է��� ������ �Է����ּ���");
		gd.setSub_name(sc.next());
		System.out.println("score�� �Է����ּ���");
		gd.setScore(sc.nextInt());
		serviceG.insertgreade(gd);
	}
	
	
	public void delete_score(Scanner sc) {
		System.out.println("������ �����մϴ�");
		System.out.println("�л���ȣ:");
		Grade_Dto gd = new Grade_Dto();
		gd.setStu_num(sc.nextInt());
		System.out.println("������ ������ ������ �Է����ּ���");
		gd.setSub_name(sc.next());
		serviceG.deletegreade(gd);
	}
	
}
