package reference_pro;

import java.util.Scanner;

public class GetMean {

	public int getMean(int[] array) {
		int[] list = new int[array.length];
		int sum = 0;
		
        return 0;
    }
	
	public int getMax(int[] array) {
//		int[] list = new int[array.length];
		int[] list = {1,5,3,8,2};
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(list[i]>max) {
				max = list[i];
			}
		}
		System.out.println("max:" + max);
		return max;
	}
	
	public int getMin(int[] array) {
	       /* 구현하기 */
		return 0;
	}
	
	public int getSosuNum(int[] array) {
	       /* 구현하기 */
		return 0;
	}

//	public int[] getNumber() {
//        /* 구현하기 */
//		return ;
//    }

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt;
//        int x[] = new int[num];
        GetMean getMean = new GetMean();
        // 아래는 배열에 값을 집어넣는 매서드입니다.
//        x = getNumber();

        // 아래는 테스트로 출력해 보기 위한 코드입니다.
//        System.out.println("평균값 : " + getMean.getMean(x));
        
        
        
//		System.out.println("최대값: " +getMean.getMax(array));

	}

}
