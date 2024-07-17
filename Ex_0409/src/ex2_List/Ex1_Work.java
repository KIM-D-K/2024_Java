package ex2_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ArrayLsit문제
// 아래의 결과를 도출하세요
// 아이디 생성 : abc
// abc
// 아이디 생성 : abc2
// abc abc2
// 아이디 생성 : abc3
// abc abc2 abc3

public class Ex1_Work {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			list.add(id);
			for(String s : list) {
				System.out.println(s+ " ");
			}
			
			System.out.println();
			if(list.size() == 3) {
				break;
			}
		}
	}
}

