package queue;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {

/*
	boolean add(E e)	
	해당 큐의 맨 뒤에 전달된 요소를 삽입함.
	만약 삽입에 성공하면 true를 반환하고, 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생시킴.
	
	boolean offer(E e)	해당 큐의 맨 뒤에 전달된 요소를 삽입함.
	
	E element()	해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.
	
	E peek()	
	해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.
	만약 큐가 비어있으면 null을 반환함.
	
	E poll()	
	해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거함.
	만약 큐가 비어있으면 null을 반환함.
	
	E remove()	해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 제거함. 
*/
		Queue<String> myQueue = new LinkedList<String>();
		
		// add() 메소드를 이용한 요소의 저장
		myQueue.add("1월");
		myQueue.add("2월");
		myQueue.add("3월");
		myQueue.offer("4월");
		myQueue.offer("5월");
		
		// element() 메소드를 이용한 요소의 반환
		String month = myQueue.element();
		System.out.println(month);
				
		// peek() 메소드를 이용한 요소의 반환
		month = myQueue.peek();
		System.out.println(month);
		 
		// poll() 메소드를 이용한 요소의 반환 및 제거
		month = myQueue.poll();
		System.out.println(month);
		 
		// remove() 메소드를 이용한 요소의 제거
		month = myQueue.poll();
		System.out.println(month);
		
		myQueue.remove("4월");
		System.out.println(myQueue);
		
	}

}
