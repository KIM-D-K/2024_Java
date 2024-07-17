package ex1_if;

import java.util.Scanner;

public class Ex2_if_else {
	public static void main(String[] args) {
		// if - else
		// if(조건식) {
		//	조건식이 참일 때 실행할 명령;
		// } else {
		// 	조건식이 거짓일 때 실행할 명령;
		// }
		
		int num = 3;
		
		if (num > 4) {
			System.out.println(num + "은(는) 4보다 큽니다.");
		}
		else {
			System.out.println(num + "은(는) 4보다 작습니다.");
		}
		System.out.println("------------------------------------");
		
		int x = 10;
		int y = 70;
		
		int max = 0;
		if (x > y) {
			max = x;
		}
		else {
			max = y;
		}
		
		System.out.printf("%d와 %d 중 큰 수는 %d입니다.\n",x, y, max);
		
		System.out.println("------------------------------------");
		
		// 키보드에서 나이를 입력받아 age라는 변수에 저장한다.
		// 나이가 20살 이상이면 "성인입니다"
		// 나이가 20살보다 어리면 "미성년자입니다" 출력하기
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("나이를 입력하세요 : ");
//
//		
//		int age = scan.nextInt();
//		if (age >= 20) {
//			System.out.println("성인입니다.");
//		}
//		else {
//			System.out.println("미성년자입니다.");
//		}
		System.out.println("------------------------------------");
		
		// 삼항 연산자로 만들었던 x개의 농구공을 담기 위한 박스의 개수 구하기
		// 키보드에서 값을 입력받아 ball변수에 저장하기
		// 입력받은 공의 개수에 따라 보관이 필요한 박스의 개수 구하기
		
		System.out.println("농구공의 개수를 입력하세요 : ");
		int ball = scan.nextInt();
		int Box = 0;
		
		if(ball % 5 == 0) {
			Box = ball / 5;
		}
		else {
			Box = ball / 5 + 1;
		}
		System.out.printf("필요한 박스의 개수는 %d개 입니다 \n",Box);
	}
}
