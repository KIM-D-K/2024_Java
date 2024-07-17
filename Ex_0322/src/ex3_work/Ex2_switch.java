package ex3_work;

import java.util.Scanner;

public class Ex2_switch {
	public static void main(String[] args) {
		// 키보드에서 두개의 값을 입력받는다.
		// 산술 연산자 기호를 문자열로 입력받는다.
		// switch문을 이용하여 정수의 연산을 수행하는
		// 코드 작성하기
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		int number1 = sc.nextInt();
//		System.out.print("두 번째 숫자를 입력하세요 : ");
//		int number2 = sc.nextInt();
//		System.out.print("두 수를 연산할 연산자를 입력하세요 : ");
//		char a = sc.next().charAt(0);
//		
//		switch (a) {
//		case '-' : 
//			//System.out.printf("%d - %d = %d/n",number1,number2,number1-number2); 이렇게도 가능
//			System.out.println(number1 + " - " +  number2  + " = " + (number1 - number2) + "입니다.");
//			break;
//		case '+' : 
//			System.out.println(number1 + " + " +  number2  + " = " + (number1 + number2) + "입니다.");
//			break;
//		case '*' :
//			System.out.println(number1 + " * " +  number2  + " = " + (number1 * number2) + "입니다.");
//			break;
//		case '/' :
//			System.out.println(number1 + " / " +  number2  + " = " + (number1 / number2) + "입니다.");
//			break;
//		case '%' :
//			System.out.println(number1 + " % " +  number2  + " = " + (number1 % number2) + "입니다.");
//			break;
//		}
		
		// 정수형 변수를 하나 키보드에서 값을 입력받고 (1~12)
		// 해당 달이 몇일까지 있는지 switch문을 통해 작성하세요.
		// 단 break는 3번만 사용할 것
		
		System.out.print("달을 입력 : ");
		int i = sc.nextInt();
		
		switch (i) {
		case 1, 3, 5, 7, 8, 10, 12 :
			System.err.println("2024년도 " + i + "월은 31일까지 있습니다.");
			break;
		case 4, 6, 9, 11 :
			System.out.println("2024년도 " + i + "월은 30일까지 있습니다.");
			break;
		case 2 : 
			System.out.println("2024년도 " + i + "월은 29일까지 있습니다.");
			break;
		}
	}
}
