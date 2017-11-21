
public class ReferenceValue {

	public static void main(String[] args) {
//		char a = 'a';
//		boolean tf = false;
//		
//		String name = "육지연";
//		String name2 = "육지연";
//		String name3 = new String("육지연");
//		
//		tf = (name.equals(name3));
//		
//		System.out.println(name);
//		System.out.println(tf);
		
		
//		String strVar1 = "육지연";
//		String strVar2 = "육지연";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		} else {
//			System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("strVar1과 strVar2는 문자열이 같음");
//		}
//		
//		String strVar3 = new String("육지연");
//		String strVar4 = new String("육지연");
//		
//		if(strVar3 == strVar4) {
//			System.out.println("strVar3과 strVar4는 참조가 같음");
//		} else {
//			System.out.println("strVar3과 strVar4는 참조가 다름");
//		}
//		
//		if(strVar3.equals(strVar4)) {
//			System.out.println("strVar3과 strVar4는 문자열이 같음");
//		}
		
		
//		int[] scores = {83,90,87};
//		int[] scores = new int[5];
//		scores[0]=100;
//		scores[1]=90;
//		scores[2]=80;
//		
//		System.out.println("scores[0]: " +scores[0]);
//		System.out.println("scores[1]: " +scores[1]);
//		System.out.println("scores[2]: " +scores[2]);
//		System.out.println("scores.length: " +scores.length);
//		
//		int sum = 0;
//		for(int i=0; i<3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합: " + sum);
//		
//		double avg = (double)sum/3;
//		System.out.println("평균: " + avg);
		
		
		
//		int [][] num1 = new int[2][3]; //2x3행렬
//		num1[0][0] = 100;
//		num1[1][0] = 90;
//		num1[0][1] = 80;
//		num1[1][1] = 70;
//		num1[0][2] = 60;
//		num1[1][2] = 50;
//		
//		for (int i=0; i<2; i++) {
//			for (int j=0; j<3; j++) {
//				System.out.println(num1[i][j]);
//			}
//		}
		
		int [][] gudan0 = {{9,1,9},
						   {9,2,18},
						   {9,3,27},
						   {9,4,36},
						   {9,5,45},
						   {9,6,54},
						   {9,7,63},
						   {9,8,72},
						   {9,9,81},};
		int [][] gudan = new int[9][3];
		for(int i=0; i<9; i++) {
			gudan[i][0] = 9;
			gudan[i][1] = i+1;
			gudan[i][2] = gudan[i][0] * gudan[i][1];		
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(gudan[i][j]+ "");
			}	
			System.out.println(" ");
		}		
		
	}

}
