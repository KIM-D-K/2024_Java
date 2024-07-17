package ex7_phone;

// 인터페이스 상속 implements를 쓴다.
public class PineapplePhone implements Phone{
	
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("@@@powerOn@@@");
			isOn = true;
		}else {
			System.out.println("Low battery...");
		}
		
	}
	@Override
	public void powerOff() {
		System.out.println("@@@powerOff@@@\n");
		isOn = false;
	}
	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
		return false;
		}
	}
	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("---Watching Utube---");
			batteryCapacity -= 10;
			System.out.println("enough..." + batteryCapacity + " %\n");
		}else {
			System.out.println("Low Battery...");
			powerOff();
		}
	}
	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("---charging---");
			batteryCapacity += 5;
			System.out.println("Charged..." + batteryCapacity + "%\n");
		}else {
			System.out.println("Yoy don't have to charge....");
			System.out.println("It's enough..." + batteryCapacity + "%\n");
			
		}
	}
}
