package ex1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "C:\\Web1900_kdk/aaa/bbb";
		
		File f = new File(path);
		
		// 경로로 접근하는 중 정상적으로 파일이나 폴더가 존재하면 true
		// 폴더 존재 여부
		if(!f.exists()) {
			System.out.println("폴더생성");
			// mkdir() : 폴더 생성하는 메서드
			f.mkdirs();
		}
		
		// 코드를 통해 목적지를 자동으로 만들어준다.
		// 실제로 많은 프로그램들이 이런 기능들을 가진 클래스를 가지고 있다.
		// 파일을 만드는 기능은 없다.
	}
}
