package t7_Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;

class Student5VO {
	int age;					// 나이
	int classNumber; 	// 학급
	
	public Student5VO(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
}

public class T2_exam {
	public static void main(String[] args) {
		Student5VO[] arr = new Student5VO[5];
		arr[0] = new Student5VO(17, 2);
		arr[1] = new Student5VO(18, 1);
		arr[2] = new Student5VO(16, 3);
		arr[3] = new Student5VO(19, 5);
		arr[4] = new Student5VO(15, 4);

		System.out.print("정렬전 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].classNumber + " , ");
		}
		System.out.println();
		
		Arrays.sort(arr, comp);
		
		System.out.print("정렬후 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].classNumber + " , ");
		}
	}
	
	public static Comparator<Student5VO> comp = new Comparator<Student5VO>() {
		@Override
		public int compare(Student5VO o1, Student5VO o2) {
			return o1.classNumber - o2.classNumber;  // 오름차순
			//return o2.classNumber - o1.classNumber;  // 내림차순
		}
	};
}
