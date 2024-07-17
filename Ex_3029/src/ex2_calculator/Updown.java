package ex2_calculator;

import java.util.Random;

public class Updown {
	Random random = new Random();
	int b = random.nextInt(50)+1;
	public int UpdownNumber (int c) {
		if (b == c) {
			return 1;
		}
		else if (b < c) {
			return 2;
		}
		else {
			return 3;
		}	
	}
}
		
		
		
		
	

