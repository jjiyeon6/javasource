package reference_pro;

import java.util.Arrays;

public class ProductMatrix {

	public int[][] productMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][B[0].length];
		
//		answer[0][0] = (A[0][0]*B[0][0])+(A[0][1]*B[1][0]); 
//		answer[0][1] = (A[0][0]*B[0][1])+(A[0][1]*B[1][1]); 
//		answer[1][0] = (A[1][0]*B[0][0])+(A[1][1]*B[1][0]); 
//		answer[1][1] = (A[1][0]*B[0][1])+(A[1][1]*B[1][1]); 
		
//		answer[i][j] = (A[i][0]*B[0][j])+(A[i][1]*B[1][j]); 		
		
/*
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[0].length; j++) {
					answer[i][j] += (A[i][0]*B[0][j])+(A[i][1]*B[1][j]); 
//					System.out.println(answer[i][j]+"");
			}
		}
*/		
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[0].length; j++) {
				for(int k=0; k<A[0].length; k++) {
					answer[i][j] += A[i][k]*B[k][j];
//					System.out.println(answer[i][j]+"");

				}	
			}
			
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {

		ProductMatrix c = new ProductMatrix();
		int[][] a = {{1,2},{2,3}};
		int[][] b = {{3,4},{5,6}};
		
		System.out.println("행렬의 곱셈: "+ Arrays.deepToString( c.productMatrix(a, b)));
		
		//Arrays.deepToString() 는 이차원 이상의 배열의 원소를 출력하는 메소드
		//일차원 배열의 출력은 Arrays.toString()
	}

}
