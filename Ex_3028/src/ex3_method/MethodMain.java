package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		System.out.println("두 수의 합은 : " + mt.twoAdd(10, 8));
		
		mt.totalAdd(100);
		
		int[] arr = {3, 6, 1, 2, 4};
		mt.maxFinder(arr);
		
		mt.circleArea(5);
		mt.circleRound(5);
	}
}
