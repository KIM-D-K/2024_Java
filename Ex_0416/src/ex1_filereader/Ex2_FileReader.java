package ex1_filereader;

import java.io.FileReader;

// test.txt에 아무 내용이나 적는다 한글, 영어 대 소문자
// 섞어서 작성을 하고 test.txt의 내용을 읽어와서
// 영어 대문자와 소문자의 개수를 출력하세요.

// 대문자 : x 개
// 소문자 : x 개

public class Ex2_FileReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Web1900_kdk/test.txt");
			int code = 0;
			int countA = 0;
			int countB = 0;
			while((code = fr.read()) != -1) {
				if (code >= 'A' && code <= 'Z') {
					countA++;
				} else if (code >= 'a' && code <= 'z') {
					countB++;
				}	
			}
			System.out.println("대문자 : " + countA);
			System.out.println("소문자 : " + countB);
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
