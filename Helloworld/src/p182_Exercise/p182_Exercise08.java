package p182_Exercise;
//�־��� �迭�� ��ü �׸��� �հ� ��հ��� ���غ�����(��øfor�� �̿�)
public class p182_Exercise08 {

	public static void main(String[] args) {

		int[][] array = {{95,86},
						 {83,92,96},
						 {78,83,93,87,88}};
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
//				System.out.print(array[i][j]+" ");
				sum = sum + array[i][j];
//				System.out.println(sum);
				
			}
		}
//		System.out.println();
		
		cnt = array[0].length+array[1].length+array[2].length;
		avg = (double)sum/cnt ;

		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
	}
	
}
