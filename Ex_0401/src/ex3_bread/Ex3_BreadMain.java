package ex3_bread;

public class Ex3_BreadMain {

	// Bread클래스를 만들어 각기 다른 기능을 하는 makeBread()메서드를
	// 세 개 만듭니다.
	// 빵을 만들었습니다. - > method1번을 호출해서 나온 결과
	// ----------
	// xx빵을 만듦
	// xx빵을 만듦
	// xx빵을 만듦
	// ...
	// xx빵을 만듦
	// 요청하신 n개의 빵을 만들었습니다 - > method2번을 호출해서 나온 결과
	
	
	public static void main(String[] args) {
		Bread b = new Bread();
		b.makeBread();
		b.makeBread(5);
		b.makeBread("크림", 3);
	}
}
