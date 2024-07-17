package ex2_multi_array;

import java.util.Scanner;

public class Ex2_multi_array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		// 1. 총합
		// 2. 평균
		int total = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		double avg = (double)total/count;
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		
		System.out.println("------------------------------");
		
		// 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		// 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받은 후,
		// 입력받은 수만큼 학생들의 이름과 수학 영어성정을 입력받는 프로그램 작성
		
		// ex) 
		// 등록할 인원수 : 2
		// 이름 : 홍길동
		// 수학 : 90
		// 영어 : 87
		// --------------
		// 이름 : 제임스
		// 수학 : 70
		// 영어 : 100
		// --------------
		// 2명 등록 완료
		// 홍길동 90 87
		// 제임스 70 100
		
		Scanner sc = new Scanner(System.in);
		
		String[][] info = new String [2][3];
		
		System.out.print("등록할 인원 수 : ");
		int n = sc. nextInt();
		
		String[][] str = new String [n][3];
		
		
		for(int i = 0; i < str.length; i++) {
				System.out.print("이름 : ");
				str[i][0] = sc.next();
				
				System.out.print("수학 : ");
				str[i][1] = sc.next();
				
				System.out.print("영어 : ");
				str[i][2] = sc.next();
		}
		System.out.println(str.length + "명 등록 완료");
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}
}
