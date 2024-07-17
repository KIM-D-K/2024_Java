package ex2_List;

import java.util.ArrayList;
import java.util.Scanner;

// 유저의 아이디와 패스워드를 가지는 UserInfo클래스를 만들고
// UserMain에서 유저의 정보를 ArrayList에 추가하되
// 기존에 추가된 아이디가 있을 경우 "아이디가 중복됩니다."
// 라는 메세지와 함께 다시 입력하기
// 예시
// 아이디 입력 : aaa
// 패스워드 입력 : 1234
//아이디 입력 : aaa
//패스워드 입력 : 1234
//아이디 입력 : aaa
//패스워드 입력 : 1234
//아이디 입력 : aaa
//패스워드 입력 : 1234


public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> info = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		ot : while (true) {
			UserInfo ui = new UserInfo();
			System.out.print("아이디 입력 : ");
			ui.setId(sc.next());
			System.out.print("패스워드 입력 : ");
			ui.setPw(sc.next());
			
			for(int i = 0; i < info.size(); i++) {
				if(ui.getId().equals(info.get(i).getId())) {
					System.out.println("중복된 아이디 입니다.");
					continue ot;
				}
			}
			info.add(ui);
			for(UserInfo i : info) {
				System.out.println(i.getId());
				System.out.println(i.getPw());
				System.out.println("-----------------");
			}
		}
	}
}
