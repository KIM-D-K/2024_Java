package ex2_super;

public class HybridCar extends Car{
	private double ElctricGauge;
	
	public HybridCar(double gasGauge, double ElctricGauge) {
		super (gasGauge);
		this.ElctricGauge = ElctricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량 : " + ElctricGauge);
	}
}

