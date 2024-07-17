package ex6_anmal;

public class Snake extends Animal{
	
	// 메서드의 오버라이딩
	// 메서드의 재정의
	// 상속관계의 객체에서 부모의 메서드를 자식이 가져와 사용하되
	// 이름은 그대로 두고, 내용만 현재 자식 클래스의 상황에 맞게 재정의 하는 것
	
	// 메서드의 오버라이딩 재정의
	// 부모의 값이 있더라도 자식 객체의 오버라이딩이 먼저 호출되어 값이 적용된다.
	@Override // 오버라이드 된 메서드를 알려주는 태그
	public int getLeg() {
		return 0;
	}
	
	String sensor = "감각이 발달";
}
