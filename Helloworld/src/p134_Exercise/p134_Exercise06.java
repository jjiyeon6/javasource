package p134_Exercise;
//for문을 이용하여 실행 결과와 같은 삼각형을 출력하는 코드를 작성
//*
//**
//***
//****
//*****
public class p134_Exercise06 {

	public static void main(String[] args) {
		
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++) {
//				
//				System.out.print( "*" );
//			}
//			System.out.println( "\t" );
//		}
		
		
//		for (int i=1; i<=3; i++) {
//			for (int j=1; j<=i; j++) {
//				
//				System.out.print( "*" );
//			}
//			System.out.println();
//		}
//		
//		
//		for (int i=2; i>0; i--) {
//			for (int j=1; j<=i; j++) {
//				System.out.print( "*" );
//			}
//				
//			System.out.println();
//		}

//		int cnt = 1;
//	    int a = 1;
//	      
//		for(int i = 1; i <= 5; i++)	//줄개수
//	      {
//	         for(int j = 1; j <= cnt; j++)	//별갯수
//	         {
//	            System.out.print("*");         
//	         }
//	         cnt += a;	//+1
//	         if(cnt == 3)
//	         {
//	            a *= -1;	//-1
//	         }
//	         System.out.println("");   
//	      }
		
		
		
		for(int i = 1; i <= 5; i++)
	      {
	         if(i <= 3)
	         {
	            for(int j = 0; j < i; j++)
	            {
	               System.out.print('*');
	            }
	            System.out.println();
	         }
	         else
	         {
	            for(int j = 5; j >= i; j--)
	            {
	               System.out.print('*');
	            }
	            System.out.println();
	         }
	      }
	}
	
}
