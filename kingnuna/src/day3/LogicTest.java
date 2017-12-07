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
		
		int[] m = {arr[0], arr[0]};//�ʱ�ȭ
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
	//�迭�� �ִ� Ȧ���� ���հ� ¦���� ����
	public void sum2(int[] a) {
		int odd_total = 0;//Ȧ��
		int even_total = 0;//¦��
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even_total += a[i];
			} else {
				odd_total += a[i];
			}
		}
		System.out.println("Ȧ���� ����:"+odd_total + " ¦���� ����:"+even_total);
		
	}
	
	//��������
	public void bubbleSort(int[] a) {
		int temp;
		for(int i=0; i<a.length-1; i++) {//�迭����n-1
			for(int j=0; j<a.length-1-i; j++) {//�ΰ��� ���� �� for�� �ѹ� �������� �������� ������ �����ϱ� -i
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
		//���� ���� ���� ã�� ���Ͽ� ��ġ���� ���ϰ� �������� �ѹ��� �����Ѵ�
		//i:������ġ, j:���� ���� ���� ã�� ���� �̵��� ��ġ
		//min:������ġ(i)�� �� ���� ���� ���� ��ġ
		int i, j, min, temp;
		for(i=0; i<a.length-1; i++) {
			j = i+1;
			min = i;
			while(j < a.length) {
				if(a[min] > a[j]) {
					min = j; //���� ���� ���� ��ġ�� min�� �ִ´�
				}
				j++;
			}
			if(min != i) {//min==i min�� �̵��� ���ߴٴ� �ǹ�. i�� ���� ���� ��
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
	
	public void inserSort(int[] a) {
		int i, j, temp;
		for(i=1; i<a.length; i++) {//[0]��°�� �տ� ���� ����� �����ϱ� 1���� �迭 ���̱���. 
			temp = a[i];	//���� ���� temp�� ���
			j = i-1; //i��° ���� ���� ���� ��ġ(�տ�ĭ) 
			while(j>=0 && (a[j] > temp)) {
				a[j+1] = a[j];//����ĭ����
				j--;//j�� ��ĭ ������
			}
			j++;
			a[j] = temp;
		}
	}
	
	//����Ž��
	public void search1(int[] a, int num) {
		for (int i=0; i<a.length; i++) {
			if(a[i] == num) {
				System.out.println(i+"��° �濡 �ִ�");
				return;
			}
		}
		System.out.println("����");
	}
	
	//����Ž��
	//Ž�� �� ������ ���� �ؾ� �Ѵ�.
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
		System.out.println("����");
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
////		System.out.println("����j�� ���");
//		System.out.println("num:");
//		j = sc.nextInt();
//		for (i = 1; i <= j; i++) {
//			if (j % i == 0) {
//				if(i!=1) {
//					sb.append(",");
//				}
//				sb.append(i+"");//������ i�� 
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
