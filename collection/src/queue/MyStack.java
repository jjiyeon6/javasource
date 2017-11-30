package queue;

/**
 * 배열, map, set, list
 *
 */


public class MyStack {
		 
    private int top;
    private int maxSize;
    private Object[] stackArray;
 
    // 최대 크기로 배열 생성
    public MyStack(int maxSize){
	    this.maxSize = 0;//maxSize;
	    this.stackArray = new Object[maxSize];
	    this.top = -1;
	}


	// 스택이 비어있는지 체크
    public boolean empty(){
        return (top == -1);
    }
 
    // 스택이 꽉찼는지 체크
    public boolean full(){
        return (top == maxSize-1);
    }
	 
    // 삽입연산
    public void push(Object element){
//	        if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);
//	        stackArray[++top] = item;
    	if(top>stackArray.length) {
    		throw new StackOverflowError();
    	}
    	maxSize++;
    	stackArray[++top] = element;
    }
	 
    // 스택의 가장 위의 데이터 반환
    public Object peek(){
        if(empty()) {
        	throw new ArrayIndexOutOfBoundsException(top);
        }
        return stackArray[top];
    }
	 
    // 삭제연산
    public Object pop(){
        Object item = peek();
        top--;
 
        return item;
    }

	    
    public int getStackSize() {
        return maxSize;
    }

	    
	public static void main(String[] args) {
		MyStack myStack = new MyStack(3);
		
		myStack.push(100);//old
		myStack.push(200);
		myStack.push(500);//new
		System.out.println(myStack.getStackSize());
		
		Object ob = myStack.peek();
		System.out.println(ob);//500
		
		Object in = myStack.pop();
		System.out.println(in);//500
		
		ob = myStack.peek();
		System.out.println(ob);
		
//		in = myStack.pop();
//		System.out.println(in);//200
	}



	
}
