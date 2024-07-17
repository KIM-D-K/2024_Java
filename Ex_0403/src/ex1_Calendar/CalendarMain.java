package ex1_Calendar;

public class CalendarMain {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색",6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		Calendar c  = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging();
		// c.onTheDesk(); -> 불가능 자식 클래스의 메서드는 호출 불가
	}
}
