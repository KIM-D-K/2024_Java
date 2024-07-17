package ex5_phone;

public class Phone {
	String brand;
	int serise;
	String color = "검정색";
	
	public Phone(String b, int s, String c) {
		brand = b;
		serise = s;
		color = c;
	}
	
	public void phoneInfo() {
		System.out.print(color + " " + serise + " " + brand);
	}
	
}
