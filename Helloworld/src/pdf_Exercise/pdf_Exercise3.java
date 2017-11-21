package pdf_Exercise;
//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오 
public class pdf_Exercise3 {

	public static void main(String[] args) {

		int sum =0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum = sum+j;
				System.out.println(j);
			}	
		}
		System.out.println(sum);
		
		
//		int sum = 0;
//		int totalSum = 0;
//		
//		for(int i=0; i<=10; i++){
//			sum = sum + i;
//			totalSum = totalSum + sum;
//			System.out.println(i +" "+ sum);
//		}
//		System.out.println(sum);
//		System.out.println(totalSum);
		
	}
}
/*
i	sum				j
1   1	1			
2	3	1+2			2
3   6	(1+2)+3		3
4	10	(1+2+3)+4	4
5	15	(1+2+3+4)+5	5
6	21				6
.
.
 */


//1+(1+3)+(1+3+9)+(1+3+9+27) 의 합은?
//	for(int i=1; i<=28; i*=3) {
//		sum = sum + i;
//		totalSum = totalSum + sum;
//		
//		System.out.println(sum);
//	}
//	System.out.println(totalSum);
//	
//	}
