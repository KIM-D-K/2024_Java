package ex4_try_catch;

public class Ex1_try_catch {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = 10/0;
			System.out.println(result);
		} catch (Exception e) {
			// 오류코드 printStackTrace
			// e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료"); 
	}
}
