package p134_Exercise;
//중첨for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y)의 형태로 출력
//단,x와 y는 10이하의 자연수

public class p134_Exercise05 {

	public static void main(String[] args) {
		
		int result = 0;
		
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				
				result = (4*x) + (5*y);
				
				if (result==60) {
					System.out.println("("+ x + "," + y +")");
				}
			}
		}
	}
	
}
