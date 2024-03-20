package t4_Set;

import java.util.ArrayList;
import java.util.TreeSet;

/*
 	TreeSet : Set계열 자료구조, 집합 자료구조, HashSet과의 차이점을 순서가 없이 들어가있는 자료를 꺼낼때는 정렬(오름차순)되어 꺼내준다.
*/
public class T2_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
//		for(int i=0; i<10; i++) {
//			treeSet.add((int)(Math.random()*100)+1);
//		}
		
//		treeSet.add(5);
//		treeSet.add(5);  // 집합자료구조 중복이 배제됨
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println("1.크기 : " + treeSet.size());
		System.out.println("1.treeSet : " + treeSet);
		System.out.println();
		
		System.out.println("2.first() : " + treeSet.first());
		System.out.println("3.last() : " + treeSet.last());
		System.out.println("4.lower() - 검색자료보다 작은 것들 중 가장 큰값 : " + treeSet.lower(26));  // 내가 입력한 데이터 보다 작은 데이터에서 가장 큰 수
		System.out.println("5.higher() - 검색자료보다 큰 것들 중 가장 작은값 : " + treeSet.higher(26));
		System.out.println("6.floor() - 같거나 작은것 : " + treeSet.floor(25));  // 입력한 데이터 보다 같거나 작은 것
		System.out.println("7.ceiling() - 같거나 큰것 : " + treeSet.ceiling(25));
		System.out.println();
		
		// pollFirst() : 원소들 중에서 작은 원소값 순으로 꺼내어준다.
		System.out.println("8.size() : " + treeSet.size());
		System.out.print("8.pollFirst : ");
		for(int i=0; i<25; i++) {			
			System.out.print(treeSet.pollFirst() + " ");
		}
		System.out.println("\n");
		
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		// pollLast() : 원소들 중에서 큰 원소값 순으로 꺼내어준다.
		System.out.println("9.size() : " + treeSet.size());
		System.out.print("9.pollLast : ");
		for(int i=0; i<25; i++) {			
			System.out.print(treeSet.pollLast() + " ");
		}
		System.out.println("\n");
	}
}
