package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 배열 arr에 담겨있는 모든 값의 합을 출력하세요
		int [] arr = {10, 20, 30, 40, 50};
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			j += arr[i];
		}
		System.out.println("총합 = " + j);
		
		char[] cards = {'1', 'L', '2', 'O', 'V', '3', 'E'};
		String word = "";
		// 문자만 뽑아서 단어를 출력
		
		for(int i = 0; i < cards.length; i++) {
			int idx = cards[i];
			if((idx >= 65 && idx <= 90) || (idx >= 97 && idx <= 122)) {
				word += (char)idx;
			}
		}
		System.out.println("단어 : " + word);
		
		// 키보드에서 배열의 길이를 입력받는다.
		// 배열의 크기만큼 알파벳을 출력하세요.
		
		// 예를 들어 5를 입력받으면
		// ABCDE
		// 3을 입력받으면
		// ABC
		Scanner sc = new Scanner(System.in);
//		System.out.print("번호를 입력 : ");
//		int n = sc.nextInt();
//		char[] c = new char[n];
//		char c2 = 'A';
//		for(int i = 0; i < c.length; i++) {
//			System.out.print(c[i] = c2++);
//		}
		// 변수 money에 10 ~ 5000사이의 값을 넣는다.
		// money를 동전으로 바꾸면 동전이 몇 개씩 필요한지 판단하는
		// 코드 작성
		// 가능한 적은 수의 동전을 사용하도록 한다.
		
		System.out.print("10 ~ 5000 사이의 값을 입력하세요 : ");
		int money = sc.nextInt();
		int coin[] = {500, 100, 50, 10};  
		for(int i = 0; i <= 3; i++) {
			int b = money/coin[i];
			money = money-b*coin[i];
			System.out.println(coin[i] + "원 " + b + "개");
		}
	}	
}

