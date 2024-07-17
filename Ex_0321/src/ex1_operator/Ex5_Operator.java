package ex1_operator;

public class Ex5_Operator {
	public static void main(String[] args) {
		// 삼항 연산자
		// 하나의 조건을 정의하여 조건이 참일 때
		// 반환할 값, 조건이 거짓일 때 반환할 값을
		// 갖고있는 연산자
		
		// 조건식
		// 참과 거짓으로 판별할 수 있는 식
		// 비교 연산자, 논리 연산자
		
		int x = 10;
		int y = 15;
		
		boolean result = ++x >= y ? true : false;;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = (n1 += n1) == n2 ? 'o' : 'x';
		System.out.println(result2);
		
		// <연산 순서>
		// 1. .()
		// 2. !, ~, ++, --
		// 3. *, /, %
		// 4. +, -
		// 5. <<, >>
		// 6. <, <=, >, >=
		// 7. ==, !=
		// 8. &
		// 9. ^
		// 10. |
		// 11. &&
		// 12. ||
		// 13. ? :
		// 14. =, 복합 대입 연산자
		
		System.out.println("------------------------------------------------");
		
		int a = 10;
		int b = 15;
		
		result = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (b % a) > 10;
		// t || t && t && f = false
		System.out.println(result);
		
		System.out.println("------------------------------------------------");
		
		/* 과수원에서 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		 *  5, 7, 5개 입니다.
		 *  과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 총과일의 평균 생산 개수를 출력
		 *  평균값을 담는 변수는 float으로 할 것
		 */
		
		int P = 5;
		int A = 7;
		int O = 5;
		
		System.out.println("하루에 생산되는 각 과일의 갯수는");
		System.out.println("배 :" + P );
		System.out.println("사과 :" + A );
		System.out.println("오렌지 :" + O );
		
		int total = P + A + O;
		float avg = (float)total / 24;
		System.out.println("하루에 생산되는 총 과일의 갯수는 = " + total);
		System.out.println("시간당 총 과일의 생산 갯수는 = " + avg);
		
		System.out.println("-------------------------------------");
		
		/*
		 * 농구공을 담기 위해 필요한 상자의 개수를 구하세요.
		 * 상자 하나에는 농구공이 5개 들어갈 수 있다.
		 * 만약 농구공이 23개라면 몇개의 상자가 필요할까요??
		 */
		
		 int B = 23;
		 
		 int Box = B % 5 == 0 ? B / 5 : B / 5+1;
		 
		 System.out.println(Box);
	}
}
