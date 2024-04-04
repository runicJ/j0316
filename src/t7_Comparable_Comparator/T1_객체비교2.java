package t7_Comparable_Comparator;

class Student2VO implements Comparable<Student2VO> {  // 인터페이스는 implement
	int age;  // 나이
	int classNumber; // 학급
	
	public Student2VO (int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compareTo(Student2VO o) {  // 메소드 자동으로 넣어서
		if(this.age > o.age) {  // 들어오는 것의 나이와 비교(매개변수)   // 규칙을 그냥 만든 것
			return 1;
		}
		else if(this.age == o.age) {
			return 0;
		}
		else {
			return -1;
		}
	
		// return this.age - o.age;  // 위의 것과 같지만 위험을 감수해야 함. 음수가 나올 경우 Integer니까
	}
}

/* 객체 비교..
			Comparable() - 인터페이스 : 자기 자신과 매개변수를 비교한다.  // 인터페이스는 익명 이너클래스로 사용가능
			compareTo() : 메소드를 반드시 구현해야 한다.
 */
public class T1_객체비교2 {  // 객체비교는 값이 2개 이상 있므녀 비교x
	public static void main(String[] args) {
		Student2VO a = new Student2VO(17, 2);  // 17살 2반
		Student2VO b = new Student2VO(18, 1);	 // 18살 1반
		
		int res = a.compareTo(b);  // 객체 안 compareTo 메소드 사용 해서 값을 넘김 // if(a>b) 사용x
				
		if(res > 0) {
			System.out.println("a객체가 b객체보다 큽니다.");
		}
		else if (res == 0) {
			System.out.println("a객체와 b객체는 같습니다.");
		}
		else {
			System.out.println("a객체가 b객체보다 작습니다.");
		}
	}
}
