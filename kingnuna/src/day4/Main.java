package day4;

public class Main {

	// 재귀함수: 함수안에서 자기자신을 호출
	// 팩토리얼
	public static int f(int x) {
		if (x > 1) {
			return x * f(x - 1);
		} else {
			return 1;
		}

	}

	// 피보나치
	public static long fibo(int x) {
		if (x <= 2) {
			return 1;
		} else {
			return fibo(x - 2) + fibo(x - 1);
		}
	}

	public static long fibo2(long[] arr, int idx) {
		if (idx <= 2) {//맨 앞에 두 개는 1을 반환
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
