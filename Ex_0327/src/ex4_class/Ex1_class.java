package ex4_class;

import java.util.Scanner;

class Dog{
}

public class Ex1_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dog dog = new Dog();
	}
}

// 코드를 컴파일한 결과물은 코드 파일을 각가 작성한 것과 동일하게 class별로 도출되어 2개가 생성된다.
// 그러나 추후 유지보수의 편리성과 클래스 재사용을 고려해 하나의 파일에 한 개의 클래스를 작성하는 것을 권장.