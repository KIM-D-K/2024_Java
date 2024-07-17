package ex4_try_catch;

import java.util.Scanner;

public class Ex2_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수를 입력하세요 : ");
			int score = sc.nextInt();
			
			if(score >= 65) {
				System.out.println("합격 입니다.");
			} else {
				System.out.println("불합격 입니다.");
			}
			// 익셉션 예외처리 중 가장 위에 있는 부모 클래스 -> 이렇게 처리하면 ㅈㄴ 못하는 거임
			// 에러 코드 익셉션을 따라 갈 것
		} catch (Exception e) {
			System.err.println("정수만 입력 가능합니다.");
		}
		System.out.println("프로그램 종료");
	}
}
