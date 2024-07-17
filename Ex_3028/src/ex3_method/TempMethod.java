package ex3_method;

import java.util.Scanner;

public class TempMethod {
	// main에서 섭씨로 변화하고 싶으면 1, 화씨로 변화하고 싶으면 2로 입력받고
	// fahrenheitToCelsius 함수를 통해 화씨를 섭씨로 바꾸기 위한 온도
	// celsiusToFahrenheit 함수를 통해 섭씨를 화씨로 바꾸기 위한 온도
	// 출력하는 프로그램
	
	// (화씨 = 1.8 * 섭씨 + 32, 섭씨 (화씨 - 32) / 1.8)

	public void fahrenheitOrCelsius () {
		Scanner sc = new Scanner(System.in);
		System.out.print("1을 누르면 섭씨, 2를 누르면 화씨로 변경합니다. : ");
		int x = sc.nextInt();
		if(x == 1) {
			System.out.print("섭씨를 입력하세요 : ");
			double a = sc.nextDouble();
			System.out.println("섭씨 = " + a + " -> " + "화씨 = " + (1.8*a+32));
		}
		if(x == 2) {
			System.out.print("화씨를 입력하세요 : ");
			double b = sc.nextDouble();
			System.out.println("화씨 = " + b + " -> " + "섭씨 = " + ((b-32)/1.8));
		}
	}
	public void start () {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1 : fahrenheitToCelsius(sc);
		case 2 : celsiusToFahrenheit(sc);
		}
	}
	
	public void fahrenheitToCelsius (Scanner sc) {
		double cel;
		double faher;
		
		System.out.println("화씨를 입력하세요 : ");
		faher = sc.nextInt();
		
		cel = (faher - 32) / 1.8;
		System.out.println("섭씨로 변화된 온도는" + cel + "도 입니다.");
	}
	public void celsiusToFahrenheit (Scanner sc) {
		double cel;
		double faher;
		System.out.println("섭씨를 입력하세요 : ");
		cel = sc.nextInt();
		
		faher = 1.8 *cel + 32;
		System.out.println("화씨로 변화된 온도는 " + faher + "도 입니다.");
	}
}
