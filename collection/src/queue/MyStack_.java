package queue;

import java.util.List;
import java.util.Vector;


/**
 * 배열, map, set, list
 *
 */


public class MyStack_ {
	
	List<Integer> vec;
		 
    MyStack_(){
	    vec = new Vector<Integer>();
	}


	// 스택이 비어있는지 체크
//    public boolean empty(){
//        return (top == -1);
//    }
// 
//    // 스택이 꽉찼는지 체크
//    public boolean full(){
//        return (top == maxSize-1);
//    }
//	 
    // 삽입연산
    public void push(int num){
    	vec.add(num);
    }
	 
    // 스택의 가장 위의 데이터 반환
//    public Object peek(){
//    }
	 
    // 삭제연산
    public Integer pop(){
    	Integer popValue = vec.get(vec.size()-1);
    	return popValue;
    }

	    
    public int getSize() {
    	int size;
    	size = vec.size();
        return size;
    }
    
    public void clear() {//Removes all
    	vec.clear();
    }

	    
	public static void main(String[] args) {
		MyStack_ myStack = new MyStack_();
		
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		
		System.out.println(myStack.getSize());
		System.out.println(myStack.pop());
		
//		myStack.clear();
		
//		System.out.println(myStack.pop());
		
//		Object ob = myStack.pop();
//		System.out.println(ob);
//		
//		ob = myStack.peek();
//		System.out.println(ob);
		
	}



	
}
