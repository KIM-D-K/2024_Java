package ex5_enum;

// 상수들의 집합
// enum타입의 클래스
public enum Item {START("시작", "s"), STOP("멈춤", "p"), EXIT("종료", "e");
	protected String itemStr, symbol;
	
//	클래스로 선언 했을 때 위 상수와 비슷한 코드라고 본다.
//	public static final Item START = new Item("시작", "s");
//	public static final Item STOP = new Item("멈춤", "p");
//	public static final Item EXIT = new Item("종료", "e");
	
	
	Item(String itemStr, String symbol) {
		this.itemStr = itemStr;
		this.symbol = symbol;
	}
	
	public String getItemStr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
// Enum클래스가 컴파일 될 떄 자동으로 추가되는 메서드
// name() : 열거형의 상수의 이름을 문자열로 반환
// ordinal() : 열거형 상수가 정의된 순서를 반환
// valueof("상수명") : String값을 enum에서 가져온다. 값이 없으면 예외를 발생시킨다.
// valueof(Item.class, "상수명") : 넘겨받은 class에서 상수명을 찾아서 받아온다.
// values() : 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환
