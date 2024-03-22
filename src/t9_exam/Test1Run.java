package t9_exam;

import java.util.ArrayList;
// 데이터베이스 설계 -> 큰 그릇 -> VO(객체) 설정(그릇의 타입 = vo타입) -> 그릇에 꺼내 사용
public class Test1Run {
	public static void main(String[] args) {
		ArrayList<Test1VO> vos = new ArrayList<>();  // 하나만 자료만 제너릭(String, integer 등) 하고 collection.sort으로도 가능.  // 담으려고 큰그릇(ArrayList)을 만듬 => VO에 담아서 이 그릇에 넣음
		
		Test1VO vo = null;  // 선언만 하고
		//Test1VO vo = new Test1VO();   // 얕은복사(하나의 객체에, 같은 곳을 계속 가르킴)
		vo = new Test1VO();  // 객체를 따로 주어야 함.
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setGender("남자");
		vo.setAddress("서울");
		vos.add(vo);

		vo = new Test1VO();
		vo.setAge(29);
		vo.setGender("여자");
		vo.setAddress("청주");
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("이기자");
		vo.setAge(33);
		vo.setGender("남자");
		vo.setAddress("제주");
		vos.add(vo);
		
		for(Test1VO v : vos) {
			System.out.println(v);
		}
	}
}
