
public class Condition {

	public static void main(String[] args) {

//		for (int b=1; b<10; b++) {
//			
//			for (int a=2; a<10; a++) {
////				System.out.print(a);
//				System.out.print(a + "*" + b + "=" + a*b +" ");
//				
//			}
//			System.out.println();
//			
//		}
		
/*		
		int i = 1;
//		while��
		
		while (i<100) {	//���� -> ���� ����
			System.out.println(i);
			i++;
		}
		
		// do while �� 
		do {	// ���� ���� -> ����
			System.out.println(i);
			i++;
		} while (i<100);
*/

		//1~100 ������ 3�� ����� ��
		int i=1;
		int sum=0;
		
		while (i<=100) {
			if (i%3==0) {
				
//				System.out.println(i);
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
		
		
		
		return;
	}
}
