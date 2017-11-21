package pdf_Exercise;
//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라
public class pdf_Exercise6 {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		
		for(int i=1; num>0; i++) {
			sum = sum +(num%10);	//12345	->5
			num = num/10;	//12345->1234->123

		}
		System.out.println("sum="+sum);
		
		while(num>0) {
			sum = sum +(num%10);	//12345	->5
			num = num/10;	//12345->1234->123
		}
		
		System.out.println("sum="+sum);
		
		//num2의 2,4,6,8의 합은?
		int num2 = 12345678;
		int sum2 = 0;
		while(num2>0) {
			sum2 = sum2+(num2%10);
			System.out.println("num2:"+num2%10);
			num2 = num2/100;
		}
		System.out.println(sum2);//20
	}
	

}
