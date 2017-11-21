package baseball;

import java.util.Scanner;

public class BBgame {

	//field
	int[] comNum = new int[3];
	int[] usrNum = new int[3];
	
	//constructor
	BBgame() {};
		
	//method
	void makeComNum() {
		while(true) {
			if((comNum[0]!=comNum[1]) && (comNum[0]!=comNum[2]) && (comNum[1]!=comNum[2])) {
				break;
			}
			for(int i=0; i<comNum.length; i++) {
//				comNum[i] = (int)(Math.random()*10);	//0~9
				comNum[i] = (int)((Math.random()*9)+1);
				System.out.println(comNum[i]);
			}
		}	

/*
 		comNum[0] = (int)((Math.random() * 9) + 1);
		 
		comNum[1] = (int)((Math.random() * 9) + 1);
        while(comNum[0] == comNum[1]) {
        	comNum[1] = (int)((Math.random() * 9) + 1);
        }
        comNum[2] = (int)((Math.random() * 9) + 1);
        while(comNum[0]==comNum[2] || comNum[1]==comNum[2]) {
        	comNum[2] = (int)((Math.random() * 9) + 1);
        }            
        System.out.println(comNum[0] + "," + comNum[1] + "," + comNum[2]);
 */
	}
	
	void getUsrNum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<usrNum.length; i++) {
			System.out.print((i+1) + "번째 수:");
			usrNum[i] = scanner.nextInt();
//			System.out.println(usrNum[i]);
			
			if(usrNum[i]>=10 || usrNum[i] < 1) {
				System.out.println("1~9의 숫자만 입력하세요 ");
				System.out.print((i+1) + "번째 수:");
				usrNum[i] = scanner.nextInt();
			} 
		}
		
	}
	
	void compareNum() {
		makeComNum();
		
		while(true) {

			int strike=0;
			int ball=0;
			getUsrNum();
			
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(comNum[i]==usrNum[j] && i==j) {	//숫자도 같고 자리도 같다
		//					System.out.println(comNum[i]+" "+usrNum[j]);
							strike = strike + 1;
						} else if(comNum[i]==usrNum[j] && i!=j) {	//숫자는 같고 자리는 다르다
		//					System.out.println(comNum[i]+" "+usrNum[j]);
							ball = ball + 1;
						}
					}
				}
				
				if(strike==3) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println(strike+"strike, "+ball+"ball \n"  );
				}
		}	
	}
	
}
