package ex5_generic;



public class GenEx<T> {
// 제네릭 특징 내가 사용할 때 타입을 정할 수 있다 하지만 기본 자료형은 쓸 수 없으므로 래퍼 클래스를 통해 사용한다.
// 래퍼 클래스를 new로 불러와 자동으로 박싱을 해제한다.  Integer -> int
// T를 타입변수 라고하며 Type의 첫 글자를 따온 것
// 다른 글자를 사용해도 되는데, E(Element), K(key), V(value)를
// 많이 사용한다.
	
	// 타입변수가 있는 value 
	T value;
	
	// value의 초기화
	public T getValue() {
		return value;
	}

	// value의 셋
	public void setValue(T value) {
		this.value = value;
	}
}
