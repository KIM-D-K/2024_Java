package ex3_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		// set에 데이터 추가하기
		set.add("f");
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("d");
		
		System.out.println(set);
		
		// set에는 중복되는 데이터를 추가할 수 없다.
		set.add("a");
		set.add("b");
		System.out.println(set);
		
		// set에 저장되어 있는 a라는 데이터를 제거
		set.remove("a");
		System.out.println(set);
		
		// 모든 요소 제거하기
		set.clear();
		set.removeAll(set); // 둘 중 아무거나 가능
		System.out.println(set);
		
		// 중복이 없기 때문에 난수를 생성해서 넣기가 편하다
		HashSet<Integer> set2 = new HashSet<>();
		
		// 로또번호 6개 넣기
		Random rd = new Random();
		while (set2.size() !=6) {
			int random = rd.nextInt(45)+1;
			set2.add(random);
		}
		System.out.println(set2);
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,3,4,4,5,6,7,8));
		
		System.out.println(list);
		
		HashSet<Integer> set3 = new HashSet<>(list);
		
		System.out.println(set3);
	}
}
