package day4;

public class Main {

	// ����Լ�: �Լ��ȿ��� �ڱ��ڽ��� ȣ��
	// ���丮��
	public static int f(int x) {
		if (x > 1) {
			return x * f(x - 1);
		} else {
			return 1;
		}

	}

	// �Ǻ���ġ
	public static long fibo(int x) {
		if (x <= 2) {
			return 1;
		} else {
			return fibo(x - 2) + fibo(x - 1);
		}
	}

	public static long fibo2(long[] arr, int idx) {
		if (idx <= 2) {//�� �տ� �� ���� 1�� ��ȯ
			return 1;
		} else {
			return arr[idx - 2] + arr[idx - 1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(f(4));
//		for (int i = 1; i <= 6; i++) {
//			System.out.println(fibo(i) + "\t");
//		}
		
		long[] arr = new long[50];
		int i;
		for(i=0; i<arr.length; i++) {
			arr[i] = fibo2(arr,i);
		}
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
