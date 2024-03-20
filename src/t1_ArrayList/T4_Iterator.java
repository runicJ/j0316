package t1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class T4_Iterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> vos = new ArrayList<>();  // 지금은 int로 넣으면 에러  // Integer 객체 비교는 equals
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*100)+1);
		}
		System.out.println("1.vos : " + vos);
		System.out.println();
		
		// 향상된 for문 = for ~ each문
		for(Integer vo : vos) {
			System.out.print(vo + " ");
		}
		System.out.println();
		
		// 수를 입력받아 vos에 들어있으면 '당첨' 그렇지 않으면 '다음기회에~~' 출력하시오.
		int cnt = 0;
		System.out.print("찾고자 하는 수를 입력하세요? ");
		int su = sc.nextInt();
		for(int i=0; i<vos.size(); i++) {
			//if(vos.get(j) == su) {
			if(vos.get(i).equals(su)) {
				System.out.println("당첨");
				break;
			}
			cnt++;
		}
		if(vos.size() == cnt) System.out.println("다음기회에~~");
		System.out.println("작업끝");
		System.out.println();
		
		// Iterator(반복지시자)로 vos객체 꺼내기
		Iterator<Integer> it = vos.iterator();  // get x
		System.out.println("2.it : " + it);
		while(it.hasNext()) {  // hasMoreElement // it 안에 vos 자료가 있는지, 주머니 안에 자료가 있는가  // BoF,EoF
			int item = it.next();  // hasNext()
			System.out.print(item + " ");
		}
		System.out.println("\n");
	
		// 스트링(Stream)객체로 출력하기
		Stream<Integer> stream = vos.stream();  // 향상된 for문은 iterator, stream 불가
		stream.forEach(no -> System.out.print(no + " "));  // -> 함수적 코딩기법(람다식)
		
		sc.close();
	}
}
