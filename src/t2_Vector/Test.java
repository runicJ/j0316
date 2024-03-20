package t2_Vector;

import java.util.List;
import java.util.Vector;

/*
	Vector : List계열, List자료구조의 특징을 모두 갖는다.
	인덱스로 관리, 순차처리, 앞에서부터 기억, 자료의 삽입/삭제시 많은 시간이 소요, 중복 허용
	'멀티스레드'의 동기화(synchronized) 메소드 작업에 유리... ArrayList에 비해서 안전(안정)적인
*/
public class Test {
	public static void main(String[] args) {
		// Vector<String> vector = new Vector<String>();
		Vector<String> vector = new Vector<>();
		// List<String> vector = new Vector<>();
		
		System.out.println("1.vector용량 : " + vector.capacity());
		System.out.println("1.vector크기 : " + vector.size());
		System.out.println("1.toString : " + vector);		
		System.out.println();
		
		vector.add("홍길동");
		vector.add("김말숙");
		vector.add("이기자");
		vector.add("오하늘");
		vector.add("소나무");
		vector.add("김연아");
		vector.add("손흥민");
		vector.add("이길자");
		vector.add("고인돌");
		System.out.println("2.vector용량 : " + vector.capacity());
		System.out.println("2.vector크기 : " + vector.size());
		System.out.println("2.toString : " + vector);		
		System.out.println();
	
		vector.add("홍길동");
		vector.add("김말숙");
		System.out.println("3.vector용량 : " + vector.capacity());  // 용량 신경ㄴㄴ
		System.out.println("3.vector크기 : " + vector.size());
		System.out.println("3.toString : " + vector);		
		System.out.println();
		
		vector.add(1, "대나무");
		System.out.println("4.vector용량 : " + vector.capacity());
		System.out.println("4.vector크기 : " + vector.size());
		System.out.println("4.toString : " + vector);		
		System.out.println();
		
		vector.remove(1);
		vector.remove(2);
		vector.remove("홍길동");
		System.out.println("5.vector용량 : " + vector.capacity());  // 용량은 줄지 않음
		System.out.println("5.vector크기 : " + vector.size());
		System.out.println("5.toString : " + vector);		
		System.out.println();
		
		vector.set(1,"안녕");
		System.out.println("6.vector용량 : " + vector.capacity());
		System.out.println("6.vector크기 : " + vector.size());
		System.out.println("6.toString : " + vector);		
		System.out.println();
		
		vector.clear();
		System.out.println("7.vector용량 : " + vector.capacity());
		System.out.println("7.vector크기 : " + vector.size());
		System.out.println("7.toString : " + vector);		
		System.out.println("isEmpty() : " + vector.isEmpty());
		System.out.println();
	}
}
