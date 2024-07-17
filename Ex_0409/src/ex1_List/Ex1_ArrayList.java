package ex1_List;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// list에 데이터 추가하기
		list.add(100);
		list.add(100);
		list.add(20);
		
		// list의 크기
		System.out.println("list의 크기 : " + list.size());
		
		System.out.println(list);
		
		// 2번 index의 값을 반한
		int res = list.get(2);
		System.out.println(res);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			}
		// forEach문
		for(int i : list) {
			System.out.println(i+ " ");
		}
	}
}
