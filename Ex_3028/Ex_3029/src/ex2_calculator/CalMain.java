package ex2_calculator;

public class CalMain {
	public static void main(String[] args) {
		// CalTest클래스를 생성하고
		// 두 개의 정수와 산술연산자를 매개변수로 갖는 
		// getResult라는 메서드를 정의
		// main에서 숫자와 산술 연산자를 전달하고 결과 확인하기
		
		CalTest ct = new CalTest();
		
		ct.getResult(19, 7, "-");
	}
}
