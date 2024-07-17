package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		String path = "C:\\Web1900_kdk/test.txt";
		
		File f = new File(path);
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				int code = 0;
				while((code = fis.read()) != -1) {
					System.out.print((char)code);
				}
				// 스트림은 사용이 완료된 이후 close를 통해 닫아주는 것이 좋다.
				// 그래야 다음 작업을 하는데 문제가 생기지 않는다.
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
