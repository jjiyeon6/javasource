package queue;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();
		
		// push() 메소드를 이용한 요소의 저장
		myStack.push("월");
		myStack.push("화");
		myStack.push("수");
		myStack.push("목");
		
		// empty() 메소드를 이용한 요소 유무 확인
		// 해당 스택이 비어 있으면 true를, 비어 있지 않으면 false를 반환함
		boolean isEmpty = myStack.empty();
		System.out.println(isEmpty);
		
		// peek() 메소드를 이용한 요소의 반환
		String day = myStack.peek();
		System.out.println(day);
		
		// pop() 메소드를 이용한 요소의 제거
		day = myStack.pop();
		System.out.println(day);
		
		day = myStack.peek();
		System.out.println(day);
		
		// search() 메소드를 이용한 요소의 위치 검색
		System.out.println(myStack.search("화"));
		System.out.println(myStack.search("월"));
		
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
		}
	}

}
