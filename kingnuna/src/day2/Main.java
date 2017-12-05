package day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Top{
//	int x=3;
//	int y=5;
	
	int x,y;
	
	public Top(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] arr = new String[3];//타입, 크기 지정
//		Vector v = new Vector();//Vector- object형 배열.	타입x, 크기x
//		v.add("aaa");
//		v.add(1);//auto boxing  기본타입이므로 원래는 wrapper 클래스로 
//		v.add(new Top());
//		v.add(3.14f);
//		
//		v.get(0);
//		System.out.println(v.get(0));
//		
//		for(int i=0; i<v.size(); i++) {//size() :vector안의 데이터 개수
//			if(i==2) {
//				System.out.println(((Top)v.get(i)).x+", "+((Top)v.get(i)).y);//down casting (x,y는 object 타입이니까)
//				continue;
//			}
//			System.out.println(v.get(i));
//		}
		
		Vector<Top> v2 = new Vector<Top>();
		v2.add(new Top(1,2));
		v2.add(new Top(3,4));
		v2.add(new Top(5,6));
		v2.add(new Top(7,8));
		
		for(int i=0; i<v2.size(); i++) {
			Top t = v2.get(i);
			System.out.println("x:"+ t.x + " y:" + t.y);
		}
		
		Iterator<Top> it = v2.iterator();
		while(it.hasNext()) {//다음에 읽어들일 데이터가 있으면 true, 없으면 false
			Top t = it.next();
			System.out.println("x:"+ t.x + " y:" + t.y);
		}
		
		//list:많은 데이터를, map은 빠른 검색을 위해
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		
		for(int i=1; i<4; i++) {
			System.out.println(map.get(i));
		}
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "aaa");
		map2.put("tel", "111");
		map2.put("address", "대한민국");
		
		System.out.println(map2.get("name"));
		System.out.println(map2.get("tel"));
		System.out.println(map2.get("address"));
		
		//key는 hashcode를 생성하기 위한
		//set은 중복을 허용하지 않음
		Iterator<String> it2 = map2.keySet().iterator();
		while(it2.hasNext()) {
			String key = it2.next();
			String value = map2.get(key);
			System.out.println(key +":"+ value);
		}
		
		Iterator<String> it3 = map2.values().iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
	}

}
