package pdf_Exercise;
//È­¾¾¸¦ ¼·¾¾·Î º¯È¯ÇÏ´Â ÄÚµå
//c=5/9*(f-32)
public class pdf_Exercise1 {

	public static void main(String[] args) {
/*		
		int fahrenheit = 100;
		float celcius = (float)5/9*(fahrenheit-32);	//37.777778
		
		double result = celcius*100+0.3;
		int result2 = (int)result;
		double result3 = (double)result2/100.0;
		
		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println(result);		//3778.07783203125
//		System.out.println(result2);	//3778
		System.out.println("Celcius:"+result3);	//37.78
*/
		
		int fahrenheit = 100;
		float celcius = (float)((int)((5.0/9.0*(fahrenheit-32)*100+0.5))/100.0);
		
		System.out.println(celcius);
		
		return;
	}

}
