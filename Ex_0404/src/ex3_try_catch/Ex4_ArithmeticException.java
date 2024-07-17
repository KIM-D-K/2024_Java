package ex3_try_catch;

public class Ex4_ArithmeticException {
	public static void main(String[] args) {
		// ArithmeticException
		// 정수를 0으로 나누려고 할 때 발생한다.
		
	try {
		int result = 10/0;
		System.out.println(result);
	} catch (ArithmeticException e){
		System.out.println("정수에 0을 넣을 수는 없습니다.");
		}
	}
	
}
