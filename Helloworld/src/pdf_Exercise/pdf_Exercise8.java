package pdf_Exercise;
//������ ȸ������ ���ϴ� ���α׷��̴�. ȸ����(palindrome)��, ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ���� ���Ѵ�. 
//���� ��� ��12321���̳� ��13531������ ���� ���Ѵ�.
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
			System.out.println(number +"�� ȸ�����Դϴ�.");
		else
			System.out.println(number +"�� ȸ������ �ƴմϴ�.");
	}

}
