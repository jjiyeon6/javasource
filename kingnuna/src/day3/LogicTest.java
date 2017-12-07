package day3;

import java.util.Scanner;

class Math{
	
	public int sum(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
//			total = total + arr[i];
			total += arr[i];
		}
		return total;
	}
	
	public int[] max_min(int[] arr) {
//		int max = 0;
//		int min = 0;
//		int[] m = new int[2];
//		for(int i=1; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//				m[0] = max;
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//				m[1] = min;
//			}
//		}
		
		int[] m = {arr[0], arr[0]};//초기화
		for(int i=1; i<arr.length; i++) {
			if(m[0] < arr[i]) {
				m[0] = arr[i];
			}
			if(m[1] > arr[i]) {
				m[1] = arr[i];
			}
		}
		return m;
	}
	//배열에 있는 홀수의 총합과 짝수의 총합
	public void sum2(int[] a) {
		int odd_total = 0;//홀수
		int even_total = 0;//짝수
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even_total += a[i];
			} else {
				odd_total += a[i];
			}
		}
		System.out.println("홀수의 총합:"+odd_total + " 짝수의 총합:"+even_total);
		
	}
	
	//버블정렬
	public void bubbleSort(int[] a) {
		int temp;
		for(int i=0; i<a.length-1; i++) {//배열개수n-1
			for(int j=0; j<a.length-1-i; j++) {//두개씩 비교할 때 for문 한번 돌때마다 마지막은 정렬이 끝나니까 -i
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	//Exercise6_23
	public void selectSort(int[] a) {
		//가장 작은 값을 찾아 비교하여 위치값을 정하고 마지막에 한번만 스왑한다
		//i:선택위치, j:가장 작은 값을 찾기 위해 이동할 위치
		//min:선택위치(i)에 들어갈 가장 가장 값의 위치
		int i, j, min, temp;
		for(i=0; i<a.length-1; i++) {
			j = i+1;
			min = i;
			while(j < a.length) {
				if(a[min] > a[j]) {
					min = j; //가장 작은 값의 위치를 min에 넣는다
				}
				j++;
			}
			if(min != i) {//min==i min이 이동을 안했다는 의미. i가 가장 작은 값
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
	
	public void inserSort(int[] a) {
		int i, j, temp;
		for(i=1; i<a.length; i++) {//[0]번째는 앞에 비교할 대상이 없으니까 1부터 배열 길이까지. 
			temp = a[i];	//비교할 값을 temp에 담고
			j = i-1; //i번째 방의 값과 비교할 위치(앞에칸) 
			while(j>=0 && (a[j] > temp)) {
				a[j+1] = a[j];//다음칸으로
				j--;//j가 한칸 앞으로
			}
			j++;
			a[j] = temp;
		}
	}
	
	//순차탐색
	public void search1(int[] a, int num) {
		for (int i=0; i<a.length; i++) {
			if(a[i] == num) {
				System.out.println(i+"번째 방에 있다");
				return;
			}
		}
		System.out.println("없다");
	}
	
	//이진탐색
	//탐색 전 정렬을 먼저 해야 한다.
	public void search2(int[] a, int num) {
		int f=0;
		int m=0;
		int l=a.length-1;
		while(f<=l) {
			m = (f+l)/2;
			if(num > a[m]) {
				f = m+1;
			} else if(num < a[m]) {
				l = m-1;
			} else {
				System.out.println("found at "+m);
				return;
			}
		}
		System.out.println("없다");
	}
	
	public void fibonnaci() {
		int a1 =1;
		int a2 =1;
		int a3 =0;
		
		System.out.println(a1);
		System.out.println(a2);
		for(int i=0; i<50; i++) {
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}
	}

	
	public void printArr(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		System.out.println();
	}
}

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {5,7,3,1,8,10,2,4,9,6};
		int[] arr = { 12, 34, 98, 3, 7, 52, 8, 1, 44, 28 };
		Math m = new Math();
//		System.out.println("sum:"+m.sum(arr));
		
		int[] mm = m.max_min(arr);
//		System.out.println("max:"+mm[0] + " min:"+mm[1]);
		
//		m.sum2(arr);
//		m.bubbleSort(arr);
//		m.selectSort(arr);
//		m.inserSort(arr);
//		m.printArr(arr);
//		m.search1(arr, 3);
//		m.search2(arr, 52);
		m.fibonnaci();
		
		
		
		
		
		
		
		
//		int i,j;
//		StringBuilder sb = new StringBuilder();
//		Scanner sc = new Scanner(System.in);
////		System.out.println("정수j의 약수");
//		System.out.println("num:");
//		j = sc.nextInt();
//		for (i = 1; i <= j; i++) {
//			if (j % i == 0) {
//				if(i!=1) {
//					sb.append(",");
//				}
//				sb.append(i+"");//숫자형 i를 
//			}
//		}
//		String str = sb.toString();
//		System.out.println(str);
//		
//		String[]arr = str.split(",");
//		for(i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
