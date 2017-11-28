package set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Spring Framework");
		set.add("Java");//Áßº¹ ÀúÀå ¾ÈµÊ
		
		int size = set.size();//°¹¼ö
		System.out.println("°¹¼ö: "+size);
		
		set.add("Java");//Áßº¹ ÀúÀå ¾ÈµÊ
		
		size = set.size();//°¹¼ö
		System.out.println("°¹¼ö: "+size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println("\t"+element);
		}
		
		set.remove("Java");
		size = set.size();//°¹¼ö
		System.out.println("°¹¼ö: "+size);

		Iterator<String> it2 = set.iterator();
		while(it.hasNext()) {
			String element = it2.next();
			System.out.println("\t"+element);
		}
		System.out.println(set.isEmpty());
		set.clear();//¸ðµÎ »èÁ¦
		
		System.out.println(set.isEmpty());
	}

}
