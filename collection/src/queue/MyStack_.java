package queue;

import java.util.List;
import java.util.Vector;


/**
 * �迭, map, set, list
 *
 */


public class MyStack_ {
	
	List<Integer> vec;
		 
    MyStack_(){
	    vec = new Vector<Integer>();
	}


	// ������ ����ִ��� üũ
//    public boolean empty(){
//        return (top == -1);
//    }
// 
//    // ������ ��á���� üũ
//    public boolean full(){
//        return (top == maxSize-1);
//    }
//	 
    // ���Կ���
    public void push(int num){
    	vec.add(num);
    }
	 
    // ������ ���� ���� ������ ��ȯ
//    public Object peek(){
//    }
	 
    // ��������
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
