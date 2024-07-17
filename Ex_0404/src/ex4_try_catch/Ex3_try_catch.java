package ex4_try_catch;

import java.util.InputMismatchException;

import java.util.Scanner;

// 문제
// 키보드에서 정수를 입력받도록 하고 정수 이외의 값이 입력되면
// "정수만 입력가능" 이라는 메세지 출력하기

// 정수 : 100 
// 입력받은 수  : 100

// 정수 : aaa
// 정수만 입력가능

public class Ex3_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수를 입력하세요 : ");
			int n = sc.nextInt();	
			System.out.println(n);
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능");
		}
		System.out.println("시스템 종료");
	}	
}
