package p134_Exercise;
//for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ�
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
