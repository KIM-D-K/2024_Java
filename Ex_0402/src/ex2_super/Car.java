package ex2_super;

public class Car {
	private double gasGauge;
	
	public Car(double gasGauge) {
		this.gasGauge = gasGauge;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가스량 : " + gasGauge);
	}
}
