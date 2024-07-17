package ex2_while;

import java.util.Scanner;

public class Ex1_while {
	public static void main(String[] args) {
		// while문
		// 간편한 구성을 가진 반복문
		// 반복횟수가 정해져있지 않고 조건식이 true일 경우 계속해서 반복하는 문법
		// for문 보다 구조가 간단하지만 주의해서 사용하지 않으면 무한 루프같은
		// 오류에 빠지기 쉽다.
		
		// 기본형
		// while(조건식) {
		// 조건식이 참일 때 반복할 명령
		// }
		
		// while문은 for문 처럼 시작값과 증감값을 가지고 있지 않기
		// 때문에 값을 변화 시켜주지 않으면 무한 반복이 일어나게 된다.
		
		int num = 1;
		
		while (num <= 10) {
			System.out.println(num);
			num ++; // 변수의 값을 변화를 줘야한다.
		}
		
		// 키보드에서 값을 받는데 -1을 입력하면 종료
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		while(n != -1) {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			System.out.println("입력한 숫자는 " + n);
		}
		// while문은 몇번을 반복해야 하는지 정확하지 않을 때 사용하면 좋다.
		
		
	}
}
