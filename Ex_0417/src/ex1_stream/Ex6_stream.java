package ex1_stream;

import java.util.stream.IntStream;

public class Ex6_stream {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.printf("1 ~ 10 까지의 총합 :  %d\n", total);
		
		int total2 = IntStream.rangeClosed(1, 10).sum();
		System.out.printf("1 ~ 10 까지의 총합 :  %d\n", total2);
	}
}
