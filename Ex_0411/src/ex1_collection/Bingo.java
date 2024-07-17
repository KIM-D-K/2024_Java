package ex1_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

// HashSet ArrayList를 이용하여 5*5의 랜덤 빙고판 만들기
// 1 ~ 50까지 25개를 뽑아서 랜덤으로 배치하세요.

// 풀기 시바
public class Bingo {
	public static void main(String[] args) {
		Random rd = new Random();
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>(set);
		Iterator<Integer> iter = list.iterator();
		set.add(new Random().nextInt(50)+1);
		while(true) {
			set.add(new Random().nextInt(50)+1);
			if(set.size() == 25) {
				break;
			}
		}
		Collections.shuffle(list);
		
		int [][] board = new int[5][5];
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d", board[i][j]);
			}
			System.out.println();
		}
	}
}
