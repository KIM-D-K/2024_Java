package ex5_generic;

public class Student<T> {
	private T id;
	
	// 여기서 제네릭은 필드위에 T를 사용한 경우
	public T getId(T id) {
		return id;
	}
	
	// 여기서 제네릭은 K가 K를 사용한 경우
//	public <K> K getId(K id) {
//		return id;
//	}
}
