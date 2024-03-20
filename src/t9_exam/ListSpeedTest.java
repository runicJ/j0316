package t9_exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// List계열의 자료구조 수행속도 비교
public class ListSpeedTest {
	public static void main(String[] args) {
//		Vector<String> vos1 = new Vector<String>();
//		ArrayList<String> vos2 = new ArrayList<String>();
//		LinkedList<String> vos3 = new LinkedList<String>();

		List<String> vos1 = new Vector<String>();
		List<String> vos2 = new ArrayList<String>();
		List<String> vos3 = new LinkedList<String>();
		
		int su = 100000;
		long startTime, endTime;
		
		// 자료의 삽입/삭제 수행속도 비교
		// 0번 위치에 자료를 추가해본다.
		
		System.out.println("0번 인덱스에 자료 추가하기");
		// Vector
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos1.add(0, "홍길동" + i);
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간?\t\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		// ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos2.add(0, "홍길동" + i);
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간?\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();

		// LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos3.add(0, "홍길동" + i);
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간?\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		System.out.println("============================================");
		
		// 1번 인덱스 내용 검색처리
		System.out.println("1번 인덱스에 자료 검색하기");
		// Vector
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos1.get(i);
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간?\t\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		// ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos2.get(i);
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간?\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		// LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos3.get(i);
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간?\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		System.out.println("============================================");

		// 0번 인덱스 내용 삭제처리
		System.out.println("i번 인덱스에 자료 삭제하기");
		// Vector
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos1.remove(0);
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간?\t\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		// ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos2.remove(0);
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간?\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();

		// LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos3.remove(0);
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간?\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		System.out.println("============================================");		
	}
}
