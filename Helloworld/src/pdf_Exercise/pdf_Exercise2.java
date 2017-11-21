package pdf_Exercise;
//1부터 20 까지의 까지의 정수 중에서 2 또는 3의 배수가 배수가 아닌 수의 총합을 구하시오 구하시오 .
public class pdf_Exercise2 {

	public static void main(String[] args) {

		int sum =0;
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {
//				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}

}
