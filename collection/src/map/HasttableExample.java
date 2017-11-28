package map;

import java.util.*;

public class HasttableExample {

	public static void main(String[] args) {

		Map<String,String>map = new Hashtable<String,String>();
		
		map.put("spring", "12345");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("id: ");
		String id = sc.nextLine();//키보드로 입력한 id를 읽는다.
		System.out.println("password: ");
		String password = sc.nextLine();
		
		if(map.containsKey(id)) {//id인 key값이 존재하는지 확인
			if(map.containsValue(password)) {//비밀번호가 value값이 존재하는지 확인
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("로그인을 다시 하십시오");
			}
		} else {
			System.out.println("로그인을 다시 하십시오");
		}
	}

}
