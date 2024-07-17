package ex2_Bike;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		// b.add(); -> 자식 클래스의 메서드임
		
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.info();
		fwb.ride();
		fwb.addWheel();
	}
}
