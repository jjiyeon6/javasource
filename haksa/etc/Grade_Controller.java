package grade;

import java.util.Scanner;

public class Grade_Controller {
private Service serviceG;
	
	public Grade_Controller() {
		serviceG= new ServiceImpl();
		
	}
	
	
	public void Insert_score(Scanner sc) {
		System.out.println("성적을 입력합니다");
		System.out.print("학생번호:");
		Grade_Dto gd = new Grade_Dto();
		gd.setStu_num(sc.nextInt());;
		System.out.println("점수를 입력할 과목을 입력해주세요");
		gd.setSub_name(sc.next());
		System.out.println("score를 입력해주세요");
		gd.setScore(sc.nextInt());
		serviceG.insertgreade(gd);
	}
	
	
	public void delete_score(Scanner sc) {
		System.out.println("성적을 삭제합니다");
		System.out.println("학생번호:");
		Grade_Dto gd = new Grade_Dto();
		gd.setStu_num(sc.nextInt());
		System.out.println("점수를 삭제할 과목을 입력해주세요");
		gd.setSub_name(sc.next());
		serviceG.deletegreade(gd);
	}
	
}
