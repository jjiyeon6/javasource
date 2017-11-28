package queue;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {

/*
	boolean add(E e)	
	�ش� ť�� �� �ڿ� ���޵� ��Ҹ� ������.
	���� ���Կ� �����ϸ� true�� ��ȯ�ϰ�, ť�� ���� ������ ���� ���Կ� �����ϸ� IllegalStateException�� �߻���Ŵ.
	
	boolean offer(E e)	�ش� ť�� �� �ڿ� ���޵� ��Ҹ� ������.
	
	E element()	�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ��.
	
	E peek()	
	�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ��.
	���� ť�� ��������� null�� ��ȯ��.
	
	E poll()	
	�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ�ϰ�, �ش� ��Ҹ� ť���� ������.
	���� ť�� ��������� null�� ��ȯ��.
	
	E remove()	�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ������. 
*/
		Queue<String> myQueue = new LinkedList<String>();
		
		// add() �޼ҵ带 �̿��� ����� ����
		myQueue.add("1��");
		myQueue.add("2��");
		myQueue.add("3��");
		myQueue.offer("4��");
		myQueue.offer("5��");
		
		// element() �޼ҵ带 �̿��� ����� ��ȯ
		String month = myQueue.element();
		System.out.println(month);
				
		// peek() �޼ҵ带 �̿��� ����� ��ȯ
		month = myQueue.peek();
		System.out.println(month);
		 
		// poll() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		month = myQueue.poll();
		System.out.println(month);
		 
		// remove() �޼ҵ带 �̿��� ����� ����
		month = myQueue.poll();
		System.out.println(month);
		
		myQueue.remove("4��");
		System.out.println(myQueue);
		
	}

}
