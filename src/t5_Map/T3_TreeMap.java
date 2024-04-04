package t5_Map;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class T3_TreeMap {  // 무조건 오름차순
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		System.out.println("1.크기 : " + treeMap.size());
		System.out.println("1.toString : " + treeMap.toString());  // toString 생략가능  // toString 오버라이드 api에서 설명
		System.out.println("1.toString : " + treeMap);
		
		treeMap.put(11, "홍길동");
		treeMap.put(13, "김말숙");
		treeMap.put(21, "고인돌");
		treeMap.put(15, "이기자");
		treeMap.put(19, "강감찬");
		treeMap.put(17, "오사랑");
		
		System.out.println("2.크기 : " + treeMap.size());
		System.out.println("2.toString : " + treeMap.toString());
		System.out.println("2.toString : " + treeMap);  // 입력순서x 키값순으로 정렬되어서 나옴(이때 TreeMap 사용 정렬)
		System.out.println();
		
		// 역순으로 TreeMap에 값을 입력한 후 출력시키면 키값으로 오름차순 정렬되어 출력된다.
		for(int i=20; i>0; i-=2) {
			//System.out.println("i : " + i);
			treeMap.put(i, i+ "번째");			
		}
		System.out.println();
		
		System.out.println("3.크기 : " + treeMap.size());
		System.out.println("3.toString : " + treeMap.toString());
		System.out.println("3.toString : " + treeMap);  // 입력순서x 키값순으로 정렬되어서 나옴(이때 TreeMap 사용 정렬)
		System.out.println();
		
		// 첫번째 키값 보여주기 : firstKey(), 마지막 키/값 : lastKey()
		System.out.println("4.첫번째 키 : " + treeMap.firstKey());
		System.out.println("4.첫번째 키와 값 : " + treeMap.firstEntry());
		System.out.println("4.마지막 키 : " + treeMap.lastKey());
		System.out.println("4.마지막 키와 값 : " + treeMap.lastEntry());
		System.out.println();
		
		// 검색키보다 작은 자료 중에서 최고값?, 최저값? : higherKey(), lowerKey()
		System.out.println("5.검색키보다 작은 자료 중의 최고값 : " + treeMap.lowerKey(11));
		System.out.println("5.검색키보다 작은 자료 중의 최고값 : " + treeMap.lowerKey(10));
		System.out.println("5.검색키보다 큰 자료 중의 최저값 : " + treeMap.higherKey(11));
		System.out.println("5.검색키보다 큰 자료 중의 최저값 : " + treeMap.higherKey(10));
		System.out.println();
		System.out.println("5.크기 : " + treeMap.size());
		System.out.println("5.toString : " + treeMap.toString());
		System.out.println("5.toString : " + treeMap);  // 입력순서x 키값순으로 정렬되어서 나옴(이때 TreeMap 사용 정렬)
		System.out.println();
		
		// 자료제거(꺼내기) : 첫번째 자료 제거 - pollFirstEntry(), 마지막 자료 제거 - pollLastEntry()
		System.out.println("6.첫번째 자료 꺼내기 : " + treeMap.pollFirstEntry());
		System.out.println("6.마지막 자료 꺼내기 : " + treeMap.pollLastEntry());
		
		System.out.println("6.크기 : " + treeMap.size());
		System.out.println("6.toString : " + treeMap.toString());
		System.out.println("6.toString : " + treeMap);  // 입력순서x 키값순으로 정렬되어서 나옴(이때 TreeMap 사용 정렬)
		System.out.println();
		
		// SortedMap 객체 : 부분집합자료 표현
		SortedMap<Integer, String> sortedMap = treeMap.headMap(10);
		System.out.println("7.10번보다 작은 자료들의 집합 : " + sortedMap);
		
		// NavigableMap 객체 : 부분집합자료 표현
		NavigableMap<Integer, String> navigableMap = treeMap.headMap(10, true);  // 두번째 인자값(값을 꺼내주세요)
		System.out.println("7.10번을 포함한 작은 자료들의 집합 : " + navigableMap);
		System.out.println();
		
		// 
		// SortedMap 객체 : 부분집합자료 표현
		sortedMap = treeMap.tailMap(10);
		System.out.println("7.10번을 포함한 큰 자료들의 집합 : " + sortedMap);
		
		// SortedMap 객체 : 부분집합자료 표현
		navigableMap = treeMap.tailMap(10, false);
		System.out.println("7.10번보다 큰 자료들의 집합 : " + navigableMap);
		System.out.println();
		
		// 정렬
		System.out.println("8.원본자료 : " + treeMap);
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
		System.out.println("8.정렬자료(키값 내림차순) : " + navigableSet);
		System.out.println("8.앞의 자료를 다시 거꾸로 정렬해서 출력하기 : " + navigableSet.descendingSet());
		System.out.println();
		
		navigableMap = treeMap.descendingMap();
		System.out.println("9.모든 자료를 키값 오름차순 : " + navigableMap);
		System.out.println("9.앞의 자료를 다시 거꾸로 정렬해서 출력하기 : " + navigableMap.descendingMap());
	}
}
