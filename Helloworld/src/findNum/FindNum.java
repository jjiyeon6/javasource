package findNum;

import java.util.Scanner;

public class FindNum {

	//field
	int comNum;
	int usrNum;
	
	//constructor
	FindNum() {};
	
	//method
	void makeComNum() {
		comNum = (int)((Math.random()*9)+1);
		System.out.println(comNum);
	}

	void getUsrNum() {
		Scanner scanner = new Scanner(System.in);
		usrNum = scanner.nextInt();
		System.out.println(usrNum);
		
	}
	
	void compareNum() {
		makeComNum();
		getUsrNum();
		
		while(true) {
			if(comNum == usrNum) {
				System.out.println("�����Դϴ�.");
				break;
			} else {
				System.out.println("������ �ƴմϴ�.");
				getUsrNum();
			}
		}
		System.out.println("����");
		
	}
	
}
