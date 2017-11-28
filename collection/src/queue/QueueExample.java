package queue;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(500);//old
		q.offer(200);
		q.offer(100);//new
		
		Integer in = q.poll();
		System.out.println(in);//500
		
		in = q.poll();
		System.out.println(in);//200
		
		in = q.poll();
		System.out.println(in);//100
	}

}
