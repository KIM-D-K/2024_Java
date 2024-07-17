package ex2_calculator;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	// TimesTable 클래스 생성
	// showTable()메서드를 정의한다.
	// showTable() 메서드에는 구구단을 출력하는 코드 작성.
	// main에서 키보드에서 값을 입력받아 showTable()메서드로 보내기
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		TimesTable tt = new TimesTable();
		tt.showTable(dan);
	}
}
