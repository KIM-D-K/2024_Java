package ex2_super;

public class HybridWaterCar extends HybridCar{
	private double WaterGauge;
	
	public HybridWaterCar(double gasGauge, double ElctricGauge, double WaterGauge) {
		super(gasGauge, ElctricGauge);
		this.WaterGauge = WaterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물의 양 : " + WaterGauge);
	}
}
