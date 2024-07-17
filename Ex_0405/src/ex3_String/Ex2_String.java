package ex3_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_String {
	public static void main(String[] args) {
		// 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력 받는다.
		// 입력받은 문자열에서 소문자 a가 몇개있는지 판별하세요.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("알파벳을 입력하세요 : ");
//		String str = sc.next();
//		int count = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)=='a')
//				count++;
//		}
//		System.out.println("a의 개수는 " + count);
		
		System.out.println("-------------------------");
		
		// 키보드에서 문자열을 입력받아 회문인지 아닌지 판별하시오
		// 회문은 앞으로 읽어도 뒤로 읽어도 똑같은 문장을 말한다.
		
//		System.out.println("문자열 입력 : ");
//		String arr = sc.next();
//		String rev = "";
//		
//		for(int i = arr.length()-1; i >= 0; i--) {
//			rev += arr.charAt(i);
//		}
//		if(arr.equals(rev)) {
//			System.out.println(arr + "은 회문입니다.");
//		}else {
//			System.out.println(arr + "은 회문이 아닙니다.");
//		}
		System.out.println("-------------------------");
		
		// 주민번호를 입력하세요(-포함)
		// 두 번째에서 시작하는 1, 3은 남자 2, 4는 여자
		// 예) 991122-1483634634634
		// 당신은 1999년 11월 22일에 태어난 남자입니다.
		
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		String Number = sc.next();
		String year = Number.substring(0,2);
		String gender = Number.substring(7,8);
		String month = Number.substring(2, 4);
		String day = Number.substring(4, 6);
		
		switch (gender) {
		case "1" : System.out.println("19" + year + "년 " + month + "월 " + day + "일에 태어난 남자 입니다.");
			break;
		case "2" : System.out.println("19" + year + "년 " + month + "월 " + day + "일에 태어난 여자 입니다.");
			break;	
		case "3" : System.out.println("20" + year + "년 " + month + "월 " + day + "일에 태어난 남자 입니다.");
			break;
		case "4" : System.out.println("20" + year + "년 " + month + "월 " + day + "일에 태어난 여자 입니다.");
			break;
		}
	}
	// 불변의 법칙
	// 문자열은 수정될 수 없다.
	// 메모리에 올라가있는 문자열은
	// 값이 수정됐을 때 기존의 메모리를 버리고
	// 새로운 값이 들어있는 메모리를 새로 점유

	// 가비지 컬렉터(GC)가 힙 영역을 돌아다니면서 더 이상 참조되지 않는 메모리들을 수거함
}

