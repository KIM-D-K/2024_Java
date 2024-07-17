package ex2_super;

// Car클래스는 잔여 가스량인 gasGauge를 필드로 갖고 있다.
// 잔여량을 출력하는 메서드인 showCurrentGauge()를 갖고 있다.
// gasGauge는 생성자를 통해 초기화 한다.

// HybridCar클래스는 Car클래스를 상속 받는다.
// ElectricGauge를 필드로 갖는다.
// 메서드는 오버라이딩 하여 잔여 가스량과 전기량을 출력

// HybridWaterCar클래스는 HybridCar클래스를 상속 받는다.
// WaterGauge를 필드로 갖고 있고, 메서드는 오버라이딩하여
// 잔여 가스량, 잔여 전기량, 잔여 물의 양을 출력한다.

// Main에서 HybridWaterCar 객체를 생성하여 잔여 연료들을 출력하세요.

public class CarMain {
	public static void main(String[] args) {
		HybridWaterCar car = new HybridWaterCar(30.5, 50.9, 10.6);
		car.showCurrentGauge();
		
	}
}
