package map;

import java.util.*;

public class HasttableExample {

	public static void main(String[] args) {

		Map<String,String>map = new Hashtable<String,String>();
		
		map.put("spring", "12345");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("id: ");
		String id = sc.nextLine();//Ű����� �Է��� id�� �д´�.
		System.out.println("password: ");
		String password = sc.nextLine();
		
		if(map.containsKey(id)) {//id�� key���� �����ϴ��� Ȯ��
			if(map.containsValue(password)) {//��й�ȣ�� value���� �����ϴ��� Ȯ��
				System.out.println("�α��� �Ǿ����ϴ�.");
			} else {
				System.out.println("�α����� �ٽ� �Ͻʽÿ�");
			}
		} else {
			System.out.println("�α����� �ٽ� �Ͻʽÿ�");
		}
	}

}
