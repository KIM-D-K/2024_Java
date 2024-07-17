package ex3_bread;

public class Bread {
	
	// method1번
	public void makeBread() {
			System.out.println("빵을 만들었습니다.");
			System.out.println("-------------------------");
		}
	
	// method2번
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + n + "개의 빵을 만들었습니다.");
		System.out.println("-------------------------");
	}
	
	// method3번
	public void makeBread(String b, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + b + "빵을" + n + "개 만들었습니다.");
		System.out.println("-------------------------");
	}
}

