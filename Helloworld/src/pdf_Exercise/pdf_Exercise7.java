package pdf_Exercise;
//�Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�. 
//���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ 1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 
//1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
public class pdf_Exercise7 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;
		int num3 = 0;	//����° ��
		int sum = 0;
//		System.out.print(num1+","+num2);
		
		sum = num1 + num2;
		for(int i=0; i<8; i++) {
			num3 = num1 + num2;
			sum = sum + num3;
			System.out.println(num3+" ");
			num1=num2;
			num2=num3;
//			num3=0;
		}
//		System.out.println(" 10th:"+num3);
		System.out.println(sum);	//143  10��° ���ڱ����� ��
	}

}
