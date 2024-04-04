package t7_Comparable_Comparator;

import java.util.Comparator;

// 익명 이너클래스를 사용하여 객체를 비교
class Student3VO { // implement 안걸겠다
	int age; // 나이
	int classNumber; // 학급

	public Student3VO(int age, int classNumber) {
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

	// return this.age - o.age; // 위의 것과 같지만 위험을 감수해야 함. 음수가 나올 경우 Integer니까
}

/*
 * 객체 비교.. Comparable() - 인터페이스 : 자기 자신과 매개변수를 비교한다. // 인터페이스는 익명 이너클래스로 사용가능
 * compareTo() : 메소드를 반드시 구현해야 한다.
 */
public class T1_객체비교3 { // 객체비교는 값이 2개 이상 있므녀 비교x
	public static void main(String[] args) {
		// 익명 객체 구현방법1
		Comparator<Student3VO> comp1 = new Comparator<Student3VO>() {

			@Override
			public int compare(Student3VO o1, Student3VO o2) {
				return o1.classNumber - o2.classNumber;
			}
		};
	}

	// 익명 객체 구현방법2
	public static Comparator<Student3VO> com2 = new Comparator<Student3VO>() {
		@Override
		public int compare(Student3VO o1, Student3VO o2) {
			return o1.classNumber - o2.classNumber;
		}
	};
}
