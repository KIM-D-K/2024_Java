package ex5_generic;

public class People<T, M> {
// 멀티타입 파라미터
// 제네릭은 두 개 이상의 멀티타입 파라미터를 사용할 수 있고
// 각 파라미터 타입을 콤마(,)로 구분한다.
	
	private T name;
	private M age;
	
	public People (T name, M age) {
		this.name = name;
		this.age = age;
	}
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public M getAge() {
		return age;
	}

	public void setAge(M age) {
		this.age = age;
	}
	
}
