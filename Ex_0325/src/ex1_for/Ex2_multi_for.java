package ex1_for;

public class Ex2_multi_for {
	public static void main(String[] args) {
		// 다중 for문
		// for문안에 for문이 있는 경우
		// for문 자체를 반복
		
		// for(초기식; 조건식; 증감식) {
		// for(초기식; 조건식; 증감식) {
		// 반복하고자 하는 명령
		// }
		//}
	
		// for문안에서 선언 된 변수 -> 지역변수
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= 3; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 1; j <= 4; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(1);
//			}
//			System.out.println();
//		}
//		
//		int count = 0;
//		for(int i = 0; i < 3; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.print(++count + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 65; j <= 68; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		
		int ch = 'A';
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print((char)ch++ + " ");
//				System.out.printf("%c", ch++);
			}
			System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
