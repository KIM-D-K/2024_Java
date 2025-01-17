package ex2_Map;

import java.util.HashMap;
import java.util.Scanner;

// id : aaa
// pw : 111
// 아이디가 없으면
// 아이디가 존재하지 않습니다.
// id : lee
// pw : 3333
// 비밀먼호 불일치
// id : park
// pw : 3333
// 로그인 성공

public class Ex3_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		map.put("Kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("pw : ");
		int pw = sc.nextInt();
		if(!map.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			if(map.get(id) != pw) {
				System.out.println("비밀번호 불일치");
			} else {
				System.out.println("로그인 성공!");
			}
		}
	}
}