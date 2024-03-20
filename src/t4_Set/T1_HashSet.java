package t4_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

/*
	Set계열 : 집합자료구조(Set<E>인터페이스를 구현한 구현클래스) HashSet() / TreeSet()
	인덱스 정보가 없다. 중복을 허용하지 않는다. 비순서구조(순서에 관계 없이 출력)
*/
public class T1_HashSet {
	public static void main(String[] args) {
		// HashSet<String> hash = new HashSet<String>();
		// Set<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
		System.out.println("1.크기 : " + hash.size());
		System.out.println("1.toString : " + hash);
		System.out.println();
		
		// 자료의 추가(add)
		hash.add("홍길동");
		hash.add("김말숙");
		hash.add("이기자");
		hash.add("소나무");
		hash.add("mbc");
		System.out.println("2.크기 : " + hash.size());
		System.out.println("2.toString : " + hash);
		System.out.println();
		
		hash.add("홍길동");  // 같은 자료를 보면 덮어 씌움
		System.out.println("3.크기 : " + hash.size());
		System.out.println("3.toString : " + hash);
		System.out.println();

		hash.add(new String("홍길동"));  // new로 생성해도 같은 자료는 덮어 씌움(집합자료구조)
		System.out.println("4.크기 : " + hash.size());
		System.out.println("4.toString : " + hash);
		System.out.println();
		
		// 제거(remove)
		hash.remove("홍길동");  // 인덱스가 없어서 숫자를 써도 지워지지 않음
		System.out.println("5.크기 : " + hash.size());
		System.out.println("5.toString : " + hash);
		System.out.println();
		
		// 전체 삭제(clear)
		hash.clear();
		System.out.println("6.크기 : " + hash.size());
		System.out.println("6.toString : " + hash);
		System.out.println();

		// 비어있는지의 유무? isEmpty()
		System.out.println("7.비어있는가? : " + hash.isEmpty());
		System.out.println();
		
		Set<String> hash2 = new HashSet<String>();
		hash2.add("가");
		hash2.add("나");
		hash2.add("다");
		System.out.println("8.크기 : " + hash2.size());
		System.out.println("8.toString : " + hash2);
		System.out.println();
		
		// 포함유무 : contains()
		System.out.println("9.'나'의 포함유무 ? " + hash2.contains("나"));
		System.out.println("9.'라'의 포함유무 ? " + hash2.contains("라"));
		System.out.println();
		
		// 향상된 for문
		for(String s : hash2) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		hash2.forEach(name -> {
//			int cnt = 0;  // 불가
//			cnt++;
			System.out.println("값 : " + name);
		});
		System.out.println();
		
		// Iterator()
		Iterator<String> it = hash2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");
		
		// Stream
		Stream<String> st = hash2.stream();
		st.forEach(name -> System.out.print(name + " "));
		System.out.println("\n");
		System.out.println("==========================================");
		
		// toArray()
		Object[] objects = hash2.toArray();
		System.out.println("10." + objects);
		System.out.println("10.objects[0] : " + objects[0]);
		System.out.println();
		
		String[] strArray = hash2.toArray(new String[0]);
		String str = "";
		for(String s : strArray) {
			str =  s + "/";
		}
		str = str.substring(0, str.length()-1);
		System.out.println("11.str : " + str);
	}
}
