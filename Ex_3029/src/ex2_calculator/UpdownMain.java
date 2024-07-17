package ex2_calculator;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		// Updown 클래스를 생성하고 1 ~ 50 사이의 난수를 발생시킨다.
		// Main클래스에서 키보드를 통해 정수를 입력받는다.
		// Updown클래스에서 사용자가 입력한 숫자를 판단하여
		// 발생한 난수보다 크다면 down!, 작다면 up!을 출력
		// 사용자가 입력한 숫자와 발생한 난수가 같은 경우 
		// 프로그램을 종료
		// 몇 회만에 맞췄는지도 출력
		Updown ud = new Updown();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			count++;
			int answer = ud.UpdownNumber(sc.nextInt());
			if(answer == 1) {
				System.out.println("정답 !" + count + "회");
				break;
			} else if(answer == 2) {
				System.out.println("down!");
			} else {
				System.out.println("up!");
			}
		}
	}
}
