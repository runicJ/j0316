package t5_Map;

import java.util.HashMap;
import java.util.Map;

/*
	Map계열 자료구조 : 사전식 자료구조, Web에서의 JSON형식과 같다.
	순서와 관계없다. 즉, '키'와 '값'으로 구성된 자료구조로, '키'가 중요한 역할을 한다.
	중복 => '키'는 중복불가, '값'은 중복허용
 */
public class T1_Basic {
	public static void main(String[] args) {
		//HashMap<Integer, String> map = new HashMap<Integer, String>();  // <타입> 제너릭
		//Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new HashMap<>();
		
		System.out.println("1.크기 : " + map.size());
		System.out.println("1.toString : " + map);  // []가 아님
		System.out.println();
		
		// 자료의 삽입(추가) : put(키, 값)
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(21, "고인돌");
		map.put(15, "이기자");
		map.put(19, "강감찬");
		map.put(17, "오사랑");
		System.out.println("2.크기 : " + map.size());
		System.out.println("2.toString : " + map);  // 순서x
		System.out.println();
		
		map.put(12, "소나무");
		System.out.println("3.크기 : " + map.size());
		System.out.println("3.toString : " + map);
		System.out.println();
		
		map.put(12, "대나무");  // 키는 중복x
		System.out.println("4.크기 : " + map.size());
		System.out.println("4.toString : " + map);
		System.out.println();

		map.put(16, "대나무");  // 값은 중복o
		System.out.println("5.크기 : " + map.size());
		System.out.println("5.toString : " + map);
		System.out.println();
		
		// 검색 : get(키)
		String name = map.get(11);  // 값은 문자 String으로 가져옴.
		System.out.println("6.map.get(11); : " + name);
		name = map.get(100);
		System.out.println("6.map.get(100); : " + name);  // 에러x null로 표시
		System.out.println();
		
		// 수정 : put(키, 값)  삽입추가수정
		map.put(11, "홍길순");
		System.out.println("8.크기 : " + map.size());
		System.out.println("8.toString : " + map);
		System.out.println();
		
		// 삭제 : remove(키)
		map.remove(11);
		System.out.println("9.크기 : " + map.size());
		System.out.println("9.toString : " + map);
		System.out.println();
		
		// 모든 자료 삭제 : clear
		map.clear();
		System.out.println("10.크기 : " + map.size());
		System.out.println("10.toString : " + map);
	}
}
