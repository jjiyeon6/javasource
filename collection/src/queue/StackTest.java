package queue;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();
		
		// push() �޼ҵ带 �̿��� ����� ����
		myStack.push("��");
		myStack.push("ȭ");
		myStack.push("��");
		myStack.push("��");
		
		// empty() �޼ҵ带 �̿��� ��� ���� Ȯ��
		// �ش� ������ ��� ������ true��, ��� ���� ������ false�� ��ȯ��
		boolean isEmpty = myStack.empty();
		System.out.println(isEmpty);
		
		// peek() �޼ҵ带 �̿��� ����� ��ȯ
		String day = myStack.peek();
		System.out.println(day);
		
		// pop() �޼ҵ带 �̿��� ����� ����
		day = myStack.pop();
		System.out.println(day);
		
		day = myStack.peek();
		System.out.println(day);
		
		// search() �޼ҵ带 �̿��� ����� ��ġ �˻�
		System.out.println(myStack.search("ȭ"));
		System.out.println(myStack.search("��"));
		
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
		}
	}

}
