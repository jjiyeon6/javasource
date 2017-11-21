package p134_Exercise;
//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성
public class p134_Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<100; i++) {
			if (i%3==0) {
//			System.out.println(i%3);
			sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
}
