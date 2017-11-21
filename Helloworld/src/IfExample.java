
public class IfExample {

	public static void main(String[] args) {

		int score = 89;
		
		char grade = 'A';
		
		//조건문
		if (score != 90) {
			System.out.println("제 점수는 90점이 아닙니다");
		
		} else if (score > 80) {
			System.out.println("제 점수는  80점 보다 크다");
		
		} else {
			System.out.println("제 점수는 " + score);
		}
		
		
		//switch문
		switch (score) {
			case 90 :
				System.out.println("90점이다");
				break;	//다음 case를 실행하지 말고 switch문을 빠져나간다.
			case 89 :
				System.out.println("89점이다");
//				break;
			case 88 :
				System.out.println("88점이다");
				break;
			default :
				System.out.println("점수가 없다");
				break;
		}
		
		switch (grade) {
			case 'A' :
				System.out.println("A학점이다");
				break;
			case 'B' :
				System.out.println("B학점이다");
				break;
			case 'C' :
				System.out.println("C학점이다");
				break;
			default :
				System.out.println("점수가 없다");
				break;
		}
	
	}

}
