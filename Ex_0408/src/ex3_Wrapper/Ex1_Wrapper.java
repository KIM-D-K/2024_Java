package ex3_Wrapper;

public class Ex1_Wrapper {
	public static void main(String[] args) {
		// Wrapper클래스
		// 프로그램에 따라 기본 타입의 데이터를 객체형으로 표현해야 하는 경우가 있다.
		// 이를 위해 자바에서는 기본 자료형을 객체로 다루기 위한 클래스를 제공한다.
		// 이를 Wrapper클래스라고 부르는데 기본형의 데이터 타입을 클래스로 포장했기 때문이다.
		
		// 향후 업데이트 계획X
		// 사용을 권장하지 않음
		// 생성자를 통한 선언은 JDK1.9부터 사용하지 않는 것을 권
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);
		
		// 실수형 타입선언
		Double doubleNum01 = Double.valueOf(30.11);
		
		// 문자형 타입선언
		Character ch = Character.valueOf('A');
		
		System.out.println("정수형 1 : " + num01);
		System.out.println("정수형 1 : " + num02);
		System.out.println("실수형 : " + doubleNum01);
		System.out.println("문자형 : " + ch);
	}
}
