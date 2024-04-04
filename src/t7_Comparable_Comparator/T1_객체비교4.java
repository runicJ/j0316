package t7_Comparable_Comparator;

import java.util.Comparator;

// 익명 이너클래스를 사용하여 객체를 비교
class Student4VO {  // implement 안걸겠다
	int age;  // 나이
	int classNumber; // 학급

	public Student4VO (int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

//	@Override
//	public int compareTo(Student2VO o) {  // 메소드 자동으로 넣어서
//		if(this.age > o.age) {  // 들어오는 것의 나이와 비교(매개변수)   // 규칙을 그냥 만든 것
//			return 1;
//		}
//		else if(this.age == o.age) {
//			return 0;
//		}
//		else {
//			return -1;
//		}
	
		// return this.age - o.age;  // 위의 것과 같지만 위험을 감수해야 함. 음수가 나올 경우 Integer니까
}

/* 객체 비교..
			Comparable() - 인터페이스 : 자기 자신과 매개변수를 비교한다.  // 인터페이스는 익명 이너클래스로 사용가능
			compareTo() : 메소드를 반드시 구현해야 한다.
 */
public class T1_객체비교4 {
	public static void main(String[] args) {
		Student4VO a = new Student4VO(17, 2);
		Student4VO b = new Student4VO(18, 1);
		
		int res = com2.compare(a, b);
		
		if(res > 0) {
			System.out.println("a객체가 b객체보다 큽니다.");
		}
		else if(res == 0) {
			System.out.println("a객체와 b객체는 같습니다.");
		}
		else {
			System.out.println("a객체가 b객체보다 작습니다.");
		}
	}
	
	// 익명 객체 구현방법2
	public static Comparator<Student4VO> com2 = new Comparator<Student4VO>() {
		@Override
		public int compare(Student4VO o1, Student4VO o2) {
			return o1.classNumber - o2.classNumber;
		}
	};
}

