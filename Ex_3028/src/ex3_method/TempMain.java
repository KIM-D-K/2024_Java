package ex3_method;

public class TempMain {
	// 메서드의 정의는 메서드 밖에서만 가능
	// 메서드의 호출은 메서드 안에서만 가능 
	public static void main(String[] args) {
		TempMethod tm = new TempMethod();
		
		tm.fahrenheitOrCelsius();
	}
}
