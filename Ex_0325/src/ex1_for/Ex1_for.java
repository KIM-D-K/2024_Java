package ex1_for;

import java.util.Scanner;

public class Ex1_for {
	public static void main(String[] args) {
		// 반복문
		// 특정 수행문을 원하는 만큼하여 실행하는 제어문
		// 반복문의 종류 : for, while
		
		// for
		// for(초기식; 조건식; 증감식) {
		// 조건이 참일 때 반복할 명령;
		// }
		
		// 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		// 조건식 : 반복을 하기 위한 종료값으로 바교연산자를 많이 사용한다.
		// 증감식 : 변수의 값을 증감 시켜주는 역할, 증감 연산자를 많이 사용한다.
		
//		for(int i = 0; i <= 3; i++) {
//			System.out.println(i);
//		}

		
		// 1부터 10까지 출력하는 반복문 작성
		
//		for (int i = 1; i <= 10; i++) {
//			System.err.println(i);
//		}

			
		// 10부터 1까지 출력하는 반복문 작성
			
//		for (int i = 10; i > 0 ; i--) {
//			System.out.println(i);
//		}

		// 1부터 10까지 3의 배수만 출력하는 반복문 작성하기
		
//		for (int i = 1; i <= 10 ; ++i) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//		}

		// 1부터 100까지의 총합을 구하는 반복문
//		int sum = 0;
//			for (int i = 1; i <= 100; ++i) {
//				sum += i;
//				System.out.println(sum);
//		}	

		// 정수형 변수 dan에 1 ~ 9사이의 수를 초기화 한다.
		// dan에 해당하는 구구단 출력하기
		
//		for (int i = 2; i <= 9; ++i) {
//			for (int b = 1; b <= 9 ; ++b) {
//				System.out.println(i + " X " + b + " = "+ b * i);
//				}
//			}

		Scanner sc = new Scanner(System.in);
		// 키보드로부터 정수를 하나 입력받는다.
		// 1부터 입력받은 정수까지의 합을 계산하여 출력하세요
		// 예) 5를 입력받았다면 1+2+3+4+5의 연산
		
//		System.out.print("숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		sum = 0;
//		for (int i = 1; i <= n; ++i) {
//			sum += i;
//			System.out.println(sum);
//		}

		
		// 10개의 정수를 입력받아 그 수들 중 짝수가 몇개인지
		// 출력하는 프로그램
		
		int count = 0;
		for (int i = 1; i <= 10; ++i) {
			System.out.println("정수를 입력하세요.");
			int b = sc.nextInt();	
			if (b % 2 == 0) {
				count++;
			}
		}
		System.out.println(" 입력받은 짝수는 " + count + "개 입니다.");
		
	}
}	




