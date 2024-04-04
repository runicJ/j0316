package t7_Comparable_Comparator;

class Student1VO {
	int age;  // 나이
	
	public Student1VO (int age) {
		this.age = age;
	}
}

public class T1_객체비교1 {  // 객체비교는 값이 2개 이상 있므녀 비교x
	public static void main(String[] args) {
		Student1VO s1 = new Student1VO(17);  // 17살
		Student1VO s2 = new Student1VO(18);  // 18살
		
		// 객체 비교.. (객체끼리의 비교는 안됨)
//		if(s1 > s2) {
//			System.out.println("s1객체가 더 크다");  // 객체 자체로는 비교x 배열로 바꿔서 하나씩만 비교 가능
//		}
//		else {
//			System.out.println("s2객체가 더 크다");
//		}
		
		if(s1.age > s2.age) {
			System.out.println("s1객체가 더 크다");  // 객체가 크다x 값이 크다, 객체비교x
		}
		else {
			System.out.println("s2객체가 더 크다");
		}

	}
}
