package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

// 특정 경로에 file.txt문서를 만들고 아무 문장이나 입력한다.
// file.txt의 내용을 FileInputStream으로 읽어온 뒤,
// 이 값이 회문인지 아닌지 판별하세요.

public class Ex4_work {
	public static void main(String[] args) {
		String path = "C:\\Web1900_kdk/file.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(path);
				fis.read(read);
				String ori = new String(read);
				StringBuilder rev = new StringBuilder(ori).reverse();
				if(ori.equals(rev.toString())) {
					System.out.print(ori + "는 회문입니다.");
				} else {
					System.out.print(ori + "는 회문이 아닙니다.");
				}
				fis.close();
			} catch (Exception e) {
			}
		}
	}
}
