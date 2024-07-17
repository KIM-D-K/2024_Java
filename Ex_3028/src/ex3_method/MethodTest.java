package ex3_method;

import java.nio.file.spi.FileSystemProvider;

public class MethodTest {
	// 두 수를 더해 반환하는 함수 Add작성
	public int twoAdd (int first, int second) {
		return first + second;
	}
	
	// 1 ~ n까지의 총 합을 구해서 출력하는 함수 sum 작성
	public void totalAdd (int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1번 부터 ~" + n + "번 까지의 합 : " + sum );
	}
	
	// 배열의 최대값을 찾는 maxFinder메서드
	public void maxFinder(int[] max) {
		int a = max[0];
		for(int x : max) {
			 if(x > a) a = x;
		}
		System.out.println("최대 값 : " + a);
	}
	// main에서 반지름을 전달받아 원의 넓이를 구하는 circleArea
	// 원의 넓이(반지름 * 반지름 * 3.14)
	public void circleArea (double c) {
		System.out.println("원의 넓이는 = " + (c*c*3.14) + "입니다.");
	}
	
	// main에서 반지름을 전달받아 원의 둘레를 구하는 circleRound
	// 원의 둘레(2* 3.14 * 반지름)
	public void circleRound (double c) {
		System.out.println("원의 둘레는 = " + (2*3.14*c) + "입니다.");
	}

}
