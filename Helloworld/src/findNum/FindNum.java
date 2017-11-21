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
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("정답이 아닙니다.");
				getUsrNum();
			}
		}
		System.out.println("종료");
		
	}
	
}
