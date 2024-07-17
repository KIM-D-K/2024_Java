package ex1_book;

public class Book {
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	public Book() {
	}
	
	public Book(String t) {
		title = t;
	}
	// 매개변수의 개수가 다른경우
	public Book(String t, int p) {
		title = t;
		page = p;
	}
	// 매개변수의 개수는 같으나 타입이 다른경우
	public Book(int p, String t) {
		title = t;
		page = p;
	}
	
	public Book(int s, String t, int p) {
		series = s;
		title = t;
		page = p;
	}
	
	
}


