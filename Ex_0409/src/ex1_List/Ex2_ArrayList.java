package ex1_List;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10); // 데이터를 index에 저장된 가장 마지막에 추가
		list.add(10);
		list.add(1, 14); // 데이터를 1번 index 추가하여 방 번호가 밀림
		list.set(2, 20); // 2번 index의 데이터를 수정
		list.add(50);
		System.out.println(list);
		
		int res = list.remove(1); // 1번 index를 삭제
		// 중간에 있는 index에 담긴 데이터를 삭제하면 뒤에있는 데이터들이 삭제한 index를 기준으로 당겨진다.
		System.out.println(res);
		System.out.println(list);
		
		list.clear(); // index안에 있는 모든 데이터를 삭제
		System.out.println(list);
	}
}
