package ex5_phone;

import java.util.Random;

public class GraphMain_t {
	public static void main(String[] args) {
		int[] num = new int[100];
		int[] count = new int[10];
		
		// 0 ~ 9 사이의 난수를 100개를 뽑는다.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] = new Random().nextInt(10));
		}
		System.out.println();
		for(int i = 0; i < num.length; i++) {
			count[num[i]]++;
		}
		Graph_t pg = new Graph_t();
		for(int i = 0; i <count.length; i++) {
			System.out.println(i + " 의 개수 : " + pg.Printpg('#', count[i]) + "  "+ count[i]);
		}
	}
}
