package t1_ArrayList;

import java.util.ArrayList;

public class T3_array {
	public static void main(String[] args) {
		//ArrayList<Integer[]> vos = new ArrayList<>();  // ArrayList가 2차원 배열처럼 사용할 수 있음.
		ArrayList<int[]> vos = new ArrayList<>();  // 에러 발생x  // vector linkedlist 같음 용도에 따라 다름  // dtos
		
		int[] jum1 = new int[4];  // 번호/국어/영어/수학 점수
		jum1[0] = 1;
		jum1[1] = 100;
		jum1[2] = 90;
		jum1[3] = 80;
		vos.add(jum1);  // 1차원 배열을 ArrayList에 넣으면 마치 2차원 배열인것처럼

		int[] jum2 = new int[4];  // 번호/국어/영어/수학 점수
		jum2[0] = 2;
		jum2[1] = 90;
		jum2[2] = 80;
		jum2[3] = 70;
		vos.add(jum2);

		int[] jum3 = new int[4];  // 번호/국어/영어/수학 점수
		jum3[0] = 3;
		jum3[1] = 80;
		jum3[2] = 70;
		jum3[3] = 50;
		vos.add(jum3);  // List 객체 vos의 개수 : 3
		
		System.out.println("1.vos의 크기 : " + vos.size());
		System.out.println("1.toString : " + vos);  // 오버라이드x 배열의 변환된 주소
		System.out.println();
		
		System.out.println("2.vos객체 안의 배열값 출력");
		for(int[]	voArray : vos) {
			for(int v : voArray) {  // 1줄씩
				System.out.print(v + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3.vos객체 안의 배열값 출력");
		int[] imsi = new int[jum1.length];  // 배열은 length
		for(int i=0; i<vos.size(); i++) {
			imsi = vos.get(i);  // 행 // 배열로 넣음
			for(int j=0; j<imsi.length; j++) {
				System.out.print(imsi[j] + " ");  // 열
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("4.vos객체 안의 배열값 출력");
		System.out.println(vos.get(0)[0] + " ");
		System.out.println(vos.get(0)[1] + " ");
		System.out.println(vos.get(0)[2] + " ");
		System.out.println(vos.get(0)[3] + " ");
		System.out.println();
		System.out.println(vos.get(1)[0] + " ");
		System.out.println(vos.get(1)[1] + " ");
		System.out.println(vos.get(1)[2] + " ");
		System.out.println(vos.get(1)[3] + " ");
		System.out.println();
		System.out.println(vos.get(2)[0] + " ");
		System.out.println(vos.get(2)[1] + " ");
		System.out.println(vos.get(2)[2] + " ");
		System.out.println(vos.get(2)[3] + " ");
		System.out.println();

		System.out.println("5.vos객체 안의 배열값 출력");
		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<vos.get(i).length; j++) {
				System.out.print(vos.get(i)[j] + " ");
			}
			System.out.println();
		}
	}
}
