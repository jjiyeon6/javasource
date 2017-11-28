package set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Spring Framework");
		set.add("Java");//�ߺ� ���� �ȵ�
		
		int size = set.size();//����
		System.out.println("����: "+size);
		
		set.add("Java");//�ߺ� ���� �ȵ�
		
		size = set.size();//����
		System.out.println("����: "+size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println("\t"+element);
		}
		
		set.remove("Java");
		size = set.size();//����
		System.out.println("����: "+size);

		Iterator<String> it2 = set.iterator();
		while(it.hasNext()) {
			String element = it2.next();
			System.out.println("\t"+element);
		}
		System.out.println(set.isEmpty());
		set.clear();//��� ����
		
		System.out.println(set.isEmpty());
	}

}
