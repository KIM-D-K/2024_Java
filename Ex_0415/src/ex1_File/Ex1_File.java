package ex1_File;

import java.io.File;

// File클래스
// 파일 또는 폴더에 대한 정보를 제공하는 클래스
// 경로명, 파일크기, 타입, 날짜 등의 속성 정보를 제공한다.
// 파일 생성, 삭제, 이름 변경 등 파일 관리 작업을 지원하기 위한 메서드로 구성되어 있다.

public class Ex1_File {
	public static void main(String[] args) {
		String path = "C:\\Web1900_kdk/test.txt";
		
		File f= new File(path);
		
		// isFile() : 최종 목적지가 파일형태면 true, 아니면 false
		if(f.isFile()) {
			// length() : 파일의 크기
			System.out.println(f.length()+"byte");
		}
	}
}
