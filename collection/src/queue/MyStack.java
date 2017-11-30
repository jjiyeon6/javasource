package queue;

/**
 * �迭, map, set, list
 *
 */


public class MyStack {
		 
    private int top;
    private int maxSize;
    private Object[] stackArray;
 
    // �ִ� ũ��� �迭 ����
    public MyStack(int maxSize){
	    this.maxSize = 0;//maxSize;
	    this.stackArray = new Object[maxSize];
	    this.top = -1;
	}


	// ������ ����ִ��� üũ
    public boolean empty(){
        return (top == -1);
    }
 
    // ������ ��á���� üũ
    public boolean full(){
        return (top == maxSize-1);
    }
	 
    // ���Կ���
    public void push(Object element){
//	        if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);
//	        stackArray[++top] = item;
    	if(top>stackArray.length) {
    		throw new StackOverflowError();
    	}
    	maxSize++;
    	stackArray[++top] = element;
    }
	 
    // ������ ���� ���� ������ ��ȯ
    public Object peek(){
        if(empty()) {
        	throw new ArrayIndexOutOfBoundsException(top);
        }
        return stackArray[top];
    }
	 
    // ��������
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
