package ex4_static;

public class Bank {
	// static 변수
	// static은 정적인, 고정적이라는 뜻을 가지고 있다.
	// 객체마다 바뀌는 것이 아닌, 클래스에 고정되어 있는 변수나 머세드
	
	// 특징 
	// 메모리에 한 번 만 고정적으로 할당
	// 객체 생성없이 사용가능 
	// 프로그램이 시작되면 메모리의 static영역에 적재되고, 프로그램이 종료될 때 해제된다.
	
	String name = "우리은행";
	String point; // 지점 
	String tel; // 전화번호
	static float interest = 10f; // 이자율
			
			public Bank(String point, String tel) {
				this.point = point;
				this.tel = tel;
			}
			public void printBank() {
				System.out.println("이름 : " + name);
				System.out.println("위치 : " + point);
				System.out.println("전화번호 : " + tel);
				System.out.println("이자율 : " + interest);
				System.out.println("-------------");
			}
			
}
