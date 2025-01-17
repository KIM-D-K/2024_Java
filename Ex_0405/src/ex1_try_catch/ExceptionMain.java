package ex1_try_catch;

import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			
			if(age < 0) {
				throw new InputErrorException("입력이 잘못 되었습니다.");
			}
			
			if(age > 19)System.out.println("성인입니다.");
			else if(age > 13) System.out.println("청소년 입니다.");
			else if(age > 6)System.out.println("어린이 입니다.");
			else System.out.println("아동 입니다");
		} catch (InputErrorException e) {
			System.out.println(e.getMessage());
		}
	}
}
