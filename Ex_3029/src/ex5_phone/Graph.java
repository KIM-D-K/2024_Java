package ex5_phone;

import java.util.Random;

public class Graph {
	public int[] randomZero() {
		Random random = new Random();
		int[] arr = new int [100];
		int[] room = new int [10];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
				room[arr[i]]++;
		}
		return room;
	}
}

