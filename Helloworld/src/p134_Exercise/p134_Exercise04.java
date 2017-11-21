package p134_Exercise;
//while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고,
//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코듣를 작성
//눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)

public class p134_Exercise04 {

	public static void main(String[] args) {
		
		while (true) {
			int nun1 = (int)(Math.random()*6) +1;	//주사위 번호 하나 뽑기
			int nun2 = (int)(Math.random()*6) +1;	//주사위 번호 하나 뽑기

			if (nun1 + nun2 !=5) {
				System.out.println(nun1+", "+nun2+" 합: "+(nun1+nun2));				
			} else {
				break;
			}
		}
	}
	
}
