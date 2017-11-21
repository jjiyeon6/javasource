package pdf_Exercise;
//다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. 
//예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다.
public class pdf_Exercise8 {

	public static void main(String[] args) {

		int number = 12321;
		int tmp = number;
		int result = 0;
		int value = 0;
		
		while(tmp !=0) {
			value = tmp%10;
//			System.out.println("value:"+value);
			tmp /= 10;
			
			result = (result*10)+value;
//			System.out.println("result:"+result);
		}
		
		if(number == result)
			System.out.println(number +"는 회문수입니다.");
		else
			System.out.println(number +"는 회문수가 아닙니다.");
	}

}
