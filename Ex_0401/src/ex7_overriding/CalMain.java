package ex7_overriding;

// Calculator 클래스를 만들고
// 반환형은 정수, 매개변수는 정수형 변수 n1, n2 반환값은 -1인
// getResult()함수를 정의하세요

// CalPlus클래스를 만들고 Calculator를 상속받으세요
// 오버라이딩 하여 getResult()를 n1과 n2를 더하여 반환하는
// 메서드로 만든다.

// CalMinus클래스를 만들고 Calculator를 상속 받으세요
// 오버라이딩하여 getResult()를 n1과 n2를 빼서 반환하는
// 메서드로 만든다.

// Main에서 실행하여 결과를 확인하세요.
// 예시
// Calminus : 15
// CalPluse : 30

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		System.out.println(cp.getResult(4, 5));
		
		CalMinus cm = new CalMinus();
		System.out.println(cm.getResult(10, 5));
		
	}
}
