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
	       /* �����ϱ� */
		return 0;
	}
	
	public int getSosuNum(int[] array) {
	       /* �����ϱ� */
		return 0;
	}

//	public int[] getNumber() {
//        /* �����ϱ� */
//		return ;
//    }

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt;
//        int x[] = new int[num];
        GetMean getMean = new GetMean();
        // �Ʒ��� �迭�� ���� ����ִ� �ż����Դϴ�.
//        x = getNumber();

        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//        System.out.println("��հ� : " + getMean.getMean(x));
        
        
        
//		System.out.println("�ִ밪: " +getMean.getMax(array));

	}

}
