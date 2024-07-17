package ex1_filereader;

import java.io.FileReader;

public class Ex1_FileReader {
	// file은 왼쪽부터 오른쪽으로 한 글자식 읽어온다.
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Web1900_kdk/test.txt");
			int code = 0;
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
