package p182_Exercise;
import java.util.Scanner;

public class p183_Exercise09 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

/*		
		while(run) {
			printMenu();
					
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				studentNum = scanner.nextInt();
				System.out.println("학생수>"+studentNum);
			} else if(selectNo == 2) {
				scores = inputScores(studentNum, scores, scanner);
			} else if(selectNo == 3) {
				if (studentNum>0) {
					for(int i=0; i<studentNum; i++) {
						System.out.println("scores["+i+"]:"+scores[i]);
					}
				}
			} else if(selectNo == 4) {
				if (studentNum>0) {
					maxValue(studentNum,scores);
					avgValue(studentNum,scores);
					
				}
			} else if(selectNo == 5) {
				run =false;
			}
		}
		
		System.out.println("프로그램 종료");
*/		

		while(run) {
			printMenu();
			int selectNo = scanner.nextInt();
			
			switch(selectNo){
				case 1:	
					studentNum = scanner.nextInt();
					System.out.println("학생수>"+studentNum);
					break;
				case 2:
					scores = inputScores(studentNum, scores, scanner);
					break;
				case 3:
					printScores(studentNum,scores);
					break;
				case 4:
					if (studentNum>0) {
						maxValue(studentNum,scores);
						avgValue(studentNum,scores);
					}
					break;
				default:	
					run =false;
					break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

	protected static void printMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트  | 4.분석 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.println("선택>");
	}

	protected static int[] inputScores(int studentNum, int[] scores, Scanner scanner) {
		if (studentNum>0) {
			scores = new int[studentNum];
			for(int i=0; i<studentNum; i++) {
				System.out.print("scores["+i+"]>");
				scores[i] = scanner.nextInt();
			}
		} else {
			System.out.println("1.학생수를 입력하세요");
		}
		return scores;
	}

	private static void printScores(int studentNum, int[] scores) {
		if (studentNum>0) {
			for(int i=0; i<studentNum; i++) {
				System.out.println("scores["+i+"]:"+scores[i]);
			}
		}
	}
	
	public static void maxValue(int studentNum, int[] scores) {
		int max = 0;
		for (int i=0; i<studentNum; i++) {
			if (scores[i]>max) {
				max = scores[i];
			}
		}
		System.out.println("최고점수:"+max);
	}
	
	private static void avgValue(int studentNum, int[] scores) {
		int sum = 0;
		for (int i=0; i<studentNum; i++) {
			sum = sum + scores[i];
		}
		double avg = 0.0;
		avg = (double)sum/studentNum ;
		System.out.println("평균점수:"+avg);
	}

}
