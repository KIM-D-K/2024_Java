package ex7_phone;

// ㅄ같은 무넺 풀기
public interface Phone {

	// 상수는 전부 대문자로 쓴다 변수와 구분하기 위함
	public static int MAX_BATTERY_CAPACITY = 100;
	
	void powerOn();
	void powerOff();
	boolean isOn();
	void watchUtube();
	void charge();
}
