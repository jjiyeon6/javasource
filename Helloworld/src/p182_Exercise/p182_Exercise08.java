package p182_Exercise;
//주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩for문 이용)
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
