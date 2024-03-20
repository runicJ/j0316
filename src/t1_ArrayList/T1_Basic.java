package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1_Basic {
	public static void main(String[] args) {
		// ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<String> arrayList = new ArrayList<>();
		// List<String> arrayList = new ArrayList<>(20);  // 용량 capacity() - 기본은 10 // 용량 설정 가능 // ctrl +shift + o // 부모 객체 사용가능
		List<String> arrayList = new ArrayList<>();
		
		System.out.println("1.arrayList크기 : " + arrayList.size());  // 변수명.메소드() length가 없음.  // 배열처럼 길이로 말하지 않음
		System.out.println("1.toString : " + arrayList.toString());
		System.out.println("1.toString : " + arrayList);  // toString은 많이 사용하기에 생락 가능.(이미 오버라이드가 되어있음)
		System.out.println();
		
		// 자료추가(add)
		arrayList.add("100");  // 제너릭 써서 하위 타입을 정의 했기 때문에 String이 아니면 에러 발생. 하위 타입 신경써서 사용.
		arrayList.add("홍길동");
		arrayList.add("Hong Gil Dong");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		
		arrayList.add("홍길동");  // index로 관리하기에 중복허용, 순서가 중요함.
		System.out.println("2.arrayList크기 : " + arrayList.size());
		System.out.println("2.toString : " + arrayList);  // 자료가 순차적으로 들어감.
		System.out.println();
		
		// 특정위치(인덱스)에 자료 추가? .add(인덱스,자료)
		arrayList.add(2, "소나무");
		System.out.println("3.arrayList크기 : " + arrayList.size());
		System.out.println("3.toString : " + arrayList);
		System.out.println();
		
		// 검색: .get(인덱스)
		String name = arrayList.get(2);  // 리턴타입이 제너릭 객체
		System.out.println("4.name : " + name);
		System.out.println();
		
		// 변경: set(인덱스, 자료) 해당위치의 자료 변경
		arrayList.set(2, "감나무");  // 삽입x 용량 그대로
		System.out.println("5.arrayList크기 : " + arrayList.size());
		System.out.println("5.toString : " + arrayList);
		System.out.println();
		
		// 삭제: remove(인덱스) or remove("값") 
		arrayList.remove(2);
		arrayList.remove("홍길동");  // 순차구조, 앞에서부터 검색해서 지우면 끝  // String은 객체
		System.out.println("6.arrayList크기 : " + arrayList.size());
		System.out.println("6.toString : " + arrayList);
		System.out.println();
		
		List<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(0);
		for(int i=1; i<=5; i++) arrayList2.add(i,(i*100));
		System.out.println("7.arrayList크기 : " + arrayList2.size());
		System.out.println("7.toString : " + arrayList2);
		System.out.println();
		
		//arrayList2.remove(200);  // 오류 인덱스 200번으로 봄.  // 객체 개념으로 써야함
		arrayList2.remove(new Integer(200));  // 실제 값을 삭제하려면 객체형식으로 삭제처리한다.
		System.out.println("8.arrayList크기 : " + arrayList2.size());
		System.out.println("8.toString : " + arrayList2);
		System.out.println();
		
		// 향상된 for문을 이용한 ArrayList객체의 활용
		String str = "";
		for(String s : arrayList) {  // : 객체(배열아니더라도 array)
			str += s + "/";
		}
		str = str.substring(0, str.length()-1);
		System.out.println("9.str : " + str);
		System.out.println();
		
		// 일반 for문
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(i + "번지 : " + arrayList.get(i));  // 읽어오는건 get
		}
		System.out.println();
		
		// 모든 자료 삭제(clear)
		arrayList.clear();
		System.out.println("10.arrayList크기 : " + arrayList.size());
		System.out.println("10.toString : " + arrayList);
		System.out.println();
		
		ArrayList<String> arrayList3 = new ArrayList<>();
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11.arrayList크기 : " + arrayList3.size());
		System.out.println("11.toString : " + arrayList3);
		System.out.println();
		
		// ArrayList 객체의 내용을 모두 추가(합치기) : addAll()
		arrayList.addAll(arrayList3);
		System.out.println("12.arrayList크기 : " + arrayList.size());
		System.out.println("12.toString : " + arrayList);
		System.out.println();

		arrayList.addAll(1,arrayList3);  // 인덱스 1번 밀어내고 전부 추가
		System.out.println("13.arrayList크기 : " + arrayList.size());
		System.out.println("13.toString : " + arrayList);
		System.out.println();

		arrayList.addAll(arrayList);  // 자기 것에 자기 객체도 넣을 수 있음 뒤로 들어감(제너릭으로 타입을 정했기에 타입을 맞춰야함)
		System.out.println("14.arrayList크기 : " + arrayList.size());
		System.out.println("14.toString : " + arrayList);
		System.out.println();
	}
}
