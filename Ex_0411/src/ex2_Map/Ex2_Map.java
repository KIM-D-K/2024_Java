package ex2_Map;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		map.put("k1", 100.f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		// value값 조회하기
		System.out.println(map.get("k1"));
		
		// 요소 삭제하기
		map.remove("k2");
		System.out.println(map);
		
		// map의 크기
		System.out.println("map의 크기 : " + map.size());
		
		// containskey(Object key)
		// map객체 안에 해당 key가 존재하냐
		if(map.containsKey("k3")) {
			System.out.println("k3라는 key가 존재한다.");
		}
		
		// containsvalue(Object value) 
		// map객체 안에 해당 value가 존재하냐
		if(map.containsValue(4.15f)) {
			System.out.println("4.15라는 value가 있슴다잉");
		}
		
		// 비어있는지 요소가 있는지 검사
		// 비어있으면 true
		if(map.isEmpty()) {
			System.out.println("map이 비어있습니다.");
		}
	}
}
