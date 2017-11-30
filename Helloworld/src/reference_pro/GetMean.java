package reference_pro;

import java.util.Arrays;
import java.util.Scanner;

public class GetMean {

	public int getMean(int[] array) {
		int sum = 0;
		int avg = 0;
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		avg = sum/array.length;
		
        return avg;
    }
	
	public int getMax(int[] array) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public int getMin(int[] array) {
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public int[] getSosuNum(int[] array) {
		
		for(int i=2; i<array.length; i++){
			int count = 0;
			for(int j=2; j<=i; j++){
				if(i%j==0){
					count++;
//					System.out.println(i);
				}
			}
			if(count==2){
				System.out.println(array[i]);
			}
//			count = 0 ; 
		}

		return array;
	}

//	public int[] getNumber() {
//        /* 구현하기 */
//		return ;
//    }

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int x[] = new int[num];
        int x[] = {5,4,3,7};
        GetMean getMean = new GetMean();
        // 아래는 배열에 값을 집어넣는 매서드입니다.
//        x = getNumber();

        System.out.println("평균값 : " + getMean.getMean(x));
        
		System.out.println("최대값: " +getMean.getMax(x));
		
		System.out.println("최소값: " +getMean.getMin(x));
		
		System.out.println("소수: " + Arrays.toString(getMean.getSosuNum(x)));

	}

}
