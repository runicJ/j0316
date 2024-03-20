package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

// List객체를 배열로 변환 : toArray()
public class T2_toArray {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(20);
		vos.add(30);
		vos.add(40);
		vos.add(50);
		System.out.println("1.vos : " + vos);
		System.out.println();
		
		Object[] objects = vos.toArray();  // 가장 큰 그릇
		System.out.println("2.objects : " + objects);  // 원래 이렇게 출력되지만 String Integer 등은 오버라이딩 되어있음.
		System.out.println();
		
		for(Object obj : objects) {  // 기존에 숫자였었도 받아주는 그릇이 Object
			System.out.println("obj : " + obj);
		}
		System.out.println();
		
		int cnt = 0;
		for(Object obj : objects) {
			System.out.println("obj["+cnt+"] : " + obj + " , " + ((Integer)obj + 10));  // 타입이 Object 였어서 연산하려면 다운캐스팅 해야함.
			cnt++;
		}
		System.out.println();
		
		Integer[] integers = vos.toArray(new Integer[vos.size()]);  // new로 Integer 객체화(배열로 줌) 시킴  // 배열은 ()가 없어야함  // 배열(개별자료 처리)로 바꾼 이유는 연산하려고
		cnt = 0;
		for(Integer ii : integers) {
			System.out.println("Integer["+cnt+"] : " + ii + " , " + (ii + 10));
			cnt++;
		}
		System.out.println();
		
		Integer[] integers2 = vos.toArray(new Integer[0]);  // 항상 값이 0부터 들어가기 때문에 크기를 지정해주지 않아도 됨.  // List계열이 array계열로 바뀐다.
		cnt = 0;
		for(Integer ii : integers2) {
			System.out.println("Integers2["+cnt+"] : " + ii + " , " + (ii + 10));
			cnt++;
		}
		System.out.println();
		
	}
}
