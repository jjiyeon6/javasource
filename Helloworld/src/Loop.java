//로또 구하기
public class Loop {

	public static void main(String[] args) {
		
//		int num1, num2, num3, num4, num5, num6, numB;
//		num1 = (int)(Math.random()*45) +1;
//		num2 = (int)(Math.random()*45) +1;
//		num3 = (int)(Math.random()*45) +1;
//		num4 = (int)(Math.random()*45) +1;
//		num5 = (int)(Math.random()*45) +1;
//		num6 = (int)(Math.random()*45) +1;
//		numB = (int)(Math.random()*45) +1;
/*
		while(true) {
			if((num1!=num2)&&(num1!=num3)&&(num1!=num4)&&(num1!=num5)&&(num1!=num6)
				&&(num2!=num3)&&(num2!=num4)&&(num2!=num5)&&(num2!=num6)
				&&(num3!=num4)&&(num3!=num5)&&(num3!=num6)
				&&(num4!=num5)&&(num4!=num6)
				&&(num5!=num6)) {
				break;				
			}
			num1 = (int)(Math.random()*45) +1;
			num2 = (int)(Math.random()*45) +1;
			num3 = (int)(Math.random()*45) +1;
			num4 = (int)(Math.random()*45) +1;
			num5 = (int)(Math.random()*45) +1;
			num6 = (int)(Math.random()*45) +1;
		}
		System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4 +" "+ num5 +" "+ num6);
*/		

/*
		for(;;) {//중복중첩
			if((num1!=num2)&&(num1!=num3)&&(num1!=num4)&&(num1!=num5)&&(num1!=num6)&&(num1!=numB) 
				&&(num2!=num3)&&(num2!=num4)&&(num2!=num5)&&(num2!=num6)&&(num2!=numB)
				&&(num3!=num4)&&(num3!=num5)&&(num3!=num6)&&(num3!=numB)
				&&(num4!=num5)&&(num4!=num6)&&(num4!=numB)
				&&(num5!=num6)&&(num5!=numB)
				&&(num6!=numB)) {
				break;
			}
			num1 = (int)(Math.random()*45) +1;
			num2 = (int)(Math.random()*45) +1;
			num3 = (int)(Math.random()*45) +1;
			num4 = (int)(Math.random()*45) +1;
			num5 = (int)(Math.random()*45) +1;
			num6 = (int)(Math.random()*45) +1;
			numB = (int)(Math.random()*45) +1;

		}
		System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4 +" "+ num5 +" "+ num6);
		System.out.println("보너스번호: "+numB);
*/

		
		//15의 약수구하기
		//소수구하기
		//최소공배수, 최대공약수
		
//		int x=15;
//		int cnt =0;
		
//		for (int i=1; i<=x; i++) {
//			if(x%i==0) {
//				cnt++;
//				System.out.println(i);
//			}
//		}
//		if(cnt ==2)
//			System.out.println("소수입니다.");
//		else
//			System.out.println("소수가 아닙니다.");
		
		int num1 =15;
		int num2 =20;
		int gcd = 0;	
		int i;
		int l =0;	
		
		for (i=1; i<=num1; i++) {

			if(((num1%i)==0) && ((num2%i)==0)) {
				gcd = i;

//				System.out.println(gcd);
//				if(i!=1) {
//					System.out.println("최대공약수는 "+i);
//
//					int c = num1/i;
//					int d = num2/i;
//					int e = i*c*d;
//					System.out.println("최소공배수는 "+e);
//				}
			}	
		}
		System.out.println(gcd);  //최대공약수
		
		for (i=1; i<100000; i++) {
			if(i%15==0 && i%20==0) {
				l = i;
				break;				
			}
		}
		System.out.println(l);  //최소공배수
			
		System.out.println((15*20)/gcd);//최소공배수
	}	
}
