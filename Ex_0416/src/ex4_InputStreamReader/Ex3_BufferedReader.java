package ex4_InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex3_BufferedReader {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("문자열 입력 : ");
			String input = br.readLine();
			System.out.print("값 : " + input);
			System.out.println("---------------------------");
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(br.readLine());
			System.out.println("값 : " + num);
		} catch (Exception e) {
			System.out.println("v");
		}
	}
}
