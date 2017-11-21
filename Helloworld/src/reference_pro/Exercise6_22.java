package reference_pro;

public class Exercise6_22 {
	
	static boolean isNumber(String str) {
		if(str==null||str=="") {
			return false;
		}
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("ch"+ch);
			if(ch<48||ch>57) {	//아스키코드 '0':48,'9':57
				System.out.println(ch);
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "12o34";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
