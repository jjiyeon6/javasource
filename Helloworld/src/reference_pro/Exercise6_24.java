package reference_pro;

import java.util.Scanner;

public class Exercise6_24 {
	
	public static int abs(int value) {
		if (value > 0) {
			value = +value;
		} else {
			value = value * -1;
		}
		return value;
	}
	
	//overload
	public static double abs(double value) {
		if (value > 0) {
			value = +value;
		} else {
			value = value * -1;
		}
		return value;
	}

	public static void main(String[] args) {

//		int value = 5;
//		System.out.println(value+"의 절대값:"+abs(value));
		
//		value = -10;
//		System.out.println(value+"의 절대값:"+abs(value));
		
//		double dValue = -20.5;
//		System.out.println(dValue+"의 절대값:"+abs(dValue));
		
		Scanner sc = new Scanner(System.in);
	    int value = sc.nextInt();
	    System.out.println(value+"의 절대값:"+abs(value));
	    
	    double dValue = sc.nextDouble();
	    System.out.println(dValue+"의 절대값:"+abs(dValue));
	}

}
