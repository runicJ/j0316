package t5_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class T2_HashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("성명", "홍길동");
		map.put("나이", "25");  // 제너릭을 맞춰야 함.
		map.put("성별", "남자");
		map.put("주소", "서울");
		System.out.println("1.크기 : " + map.size());
		System.out.println("1.toString : " + map);
		System.out.println();
		
		// 검색?
		System.out.println("성명 : " + map.get("성명"));   // 변수개념으로 성명이라고 쓰면x
		String age = "나이";
		System.out.println("나이 : " + map.get(age));
		System.out.println("성별 : " + map.get("성별"));
		System.out.println("주소 : " + map.get("주소"));
		System.out.println();
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(11, "홍길동");
		map2.put(13, "김말숙");
		map2.put(21, "고인돌");
		map2.put(15, "이기자");
		map2.put(19, "강감찬");
		map2.put(17, "오사랑");
		
		// entrySet() 키와 값 형식으로 꺼내줌
		System.out.println("번호\t성명");
		System.out.println("----------------------");
		for(Entry<Integer, String> en : map2.entrySet()) {  // 타입 Entry
			System.out.print(en.getKey() + "\t" + en.getValue() + "\n");
		}
		System.out.println("----------------------");
		System.out.println();
		
		// key만 출력 : keySet()
		Set<Integer> key = map2.keySet(); // key가 배열 같이
		for(Integer k : key) {
			System.out.println("key : " + k + " , value : " + map2.get(k));
		}
		System.out.println();
		
		// '값'만 출력하기 : values()
		Collection<String> val = map.values();  // Collection으로 받음
		System.out.println("값 : " + val);
		System.out.println();
		
		System.out.println("key : " + map.keySet());
		System.out.println("value : " + map.values());
		System.out.println();
		
		// Iterator
		Iterator<Entry<Integer, String>> it = map2.entrySet().iterator();  // set은 키로 받음 Entry
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
