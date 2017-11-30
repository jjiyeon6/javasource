package queue;

import java.util.List;
import java.util.Vector;

public class MyQueue_ {
	
	List<Integer> vec;
	 
	MyQueue_(){
	    vec = new Vector<Integer>();
	}
     
        
    public void offer(int num) {
    	vec.add(num);
    }
    
    public int poll() {
    	int temp = 0;
    	temp = vec.get(0);
    	vec.remove(0);
    	return temp;
    }
    
    public void remove(int num) {
    	vec.remove(num);
    }
    
    public void clear() {//Removes all
    	vec.clear();
    }


	public static void main(String[] args) {

		MyQueue_ queue = new MyQueue_();
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
			
		System.out.println(queue.poll());


	}

}
