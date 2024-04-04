package t6_Stack_Queue;

import java.util.Stack;

public class T1_Stack {  // 책에 내용 있음
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 : " + stack.size());
		System.out.println("1.내용(toString()) : " + stack);
		System.out.println();
		
		// 자료 삽입(push)
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.push(6);
		
		System.out.println("2.크기 : " + stack.size());
		System.out.println("2.내용 : " + stack);
		System.out.println();
		
		// 바로 아래 자료 쳐다보기 : peek()
		System.out.println("3.바로 아래 자료 : " + stack.peek());  // LIFO stack은 쌓는거 그 통안에 쌓는거
		System.out.println("3.크기 : " + stack.size());
		System.out.println("3.내용 : " + stack);
		
		// 자료 검색하기 : search()
		System.out.println("4: " + stack.search(7));  // 인덱스 아니고 위에서 부터 봤을때 순서를 말함 쌓는 통 안에 7의 순서 위치
		System.out.println("4: " + stack.search(3) + "번쨰 위치점");
		System.out.println("4: " + stack.search(6) + "번쨰 위치점");
		System.out.println("4: " + stack.search(10) + "번쨰 위치점");	  // 없는 것
		System.out.println();
		
		// 자료 꺼내기(pop)
		// for(int i=0;
		System.out.println("5: " + stack.pop());
		System.out.println("5: " + stack.pop());
		System.out.println("5: " + stack.pop());
		System.out.println("5: " + stack.pop());
		System.out.println("5: " + stack.pop());
		
		System.out.println("5.크기 : " + stack.size());
		System.out.println("5.내용 : " + stack);
		System.out.println();
		
		// 스텍 내용의 공백체크 : empty() --> true/false 반환
		System.out.println("5: " + stack.empty());
	}
}
