package t3_LinkedList;

import java.util.LinkedList;
// 어떤 업무에서 사용할지 생각 하고 거기에 맞는 List계열을 사용
/*
	LinkedList : List게열, List속성을 모두 적용...
	인덱스가 없다. 따라서 많은 자료의 검색 시는 많은 시간이 소요된다.
	자료를 기준으로 '이중 링크드 리스트(앞주소-현재데이터-뒷주소)'구조로 되어있기에, 자료의 '삽입/삭제'가 빈번한 자료구조에 적합하다.
*/
public class Test {
	public static void main(String[] args) {
		// LinkedList<String> linkedList = new LinkedList<String>();
		LinkedList<String> linkedList = new LinkedList<>();
		// LinkedList<String> linkedList = new LinkedList<>();
		
		System.out.println("1.linkedList크기 : " + linkedList.size());  // 용량을 볼 수 없음
		System.out.println("1.toString : " + linkedList);		
		System.out.println();
		
		linkedList.add("홍길동");
		linkedList.add("김말숙");
		linkedList.add("이기자");
		linkedList.add("오하늘");
		linkedList.add("소나무");
		linkedList.add("김연아");
		linkedList.add("손흥민");
		linkedList.add("이길자");
		linkedList.add("고인돌");
		System.out.println("2.linkedList크기 : " + linkedList.size());
		System.out.println("2.toString : " + linkedList);		
		System.out.println();
	
		linkedList.add("홍길동");
		linkedList.add("김말숙");
		System.out.println("3.linkedList크기 : " + linkedList.size());
		System.out.println("3.toString : " + linkedList);		
		System.out.println();
		
		linkedList.add(1, "대나무");
		System.out.println("4.linkedList크기 : " + linkedList.size());
		System.out.println("4.toString : " + linkedList);		
		System.out.println();
		
		linkedList.remove(1);
		linkedList.remove(2);
		linkedList.remove("홍길동");
		System.out.println("5.linkedList크기 : " + linkedList.size());
		System.out.println("5.toString : " + linkedList);		
		System.out.println();
		
		linkedList.set(1,"안녕");
		System.out.println("6.linkedList크기 : " + linkedList.size());
		System.out.println("6.toString : " + linkedList);		
		System.out.println();
		
		linkedList.clear();
		System.out.println("7.linkedList크기 : " + linkedList.size());
		System.out.println("7.toString : " + linkedList);		
		System.out.println("isEmpty() : " + linkedList.isEmpty());
		System.out.println();
	}
}
