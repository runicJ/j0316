package t9_exam;

import java.util.ArrayList;

// max,min / sort / search / merge / 통계(누적)

/* 정렬문제
	10개의 난수(10~100)를 발생시켜서 ArrayList 객체에 저장시킨 후
	원본/오름차순정렬/내림차순정렬 자료를 출력하시오.(ArrayList객체를 이용하시오)
*/ //.add .get  selection double sort
public class Ex1 {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int su = ((int)(Math.random()*91)+10);
			if(vos.contains(su)) {
				i--;
			}
			else vos.add(su);
		}
		
		System.out.println("원본 : " + vos);
		
		sort(vos);
		System.out.println("오름차순 : " + vos);

		sortReverse(vos);
		System.out.println("내림차순 : " + vos);
	}
	
	public static void sort(ArrayList<Integer> vos) {
		for(int i=0; i<vos.size()-1; i++) {
			for(int j=i; j<vos.size(); j++) {
				if(vos.get(i)>vos.get(j)) {
					System.out.println(vos.get(i) + ">" + vos.get(j));
					Integer temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
	}
	
	public static void sortReverse(ArrayList<Integer> vos) {
		for(int i=0; i<vos.size()-1; i++) {
			for(int j=i; j<vos.size(); j++) {
				if(vos.get(i)<vos.get(j)) {
					System.out.println(vos.get(i) + "<" + vos.get(j));
					Integer temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
	}
}
