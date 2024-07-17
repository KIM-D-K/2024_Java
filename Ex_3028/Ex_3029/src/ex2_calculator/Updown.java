package ex2_calculator;

import java.util.Random;

public class Updown {
	public int UpdownNumber (int c) {
		Random random = new Random();
		int b = random.nextInt(50)+1;
		if (b == c) {
			return 1;
		}
		else if (b < c) {
			return 2;
		}
		else if (b > c) {
			return 3;
		}	
	}
}
		
		
		
		
	

