package ex3_FileOutputStream;

import java.io.FileOutputStream;

public class Ex1_FileOutputStream {
	public static void main(String[] args) {
		try {
			// FileOutputStream(경로, 이어쓰기 옵션);
			// 이어쓰기 옵션이 true이면 기존 파일에 이어서 내용을 추가하고
			// false면 기존 내용을 무시하고 새로 쓰게된다.
			FileOutputStream fos = new FileOutputStream("C:\\Web1900_kdk/fileOut.txt", false);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능합니다.";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch (Exception e) {
		}
	}
}
