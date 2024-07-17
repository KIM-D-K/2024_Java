package ex4_InputStreamReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex2_OutputStreamWriter {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter is = null;
		
		try {
			out = new FileOutputStream("C:\\Web1900_kdk/outtest.txt");
			is = new OutputStreamWriter(out);
			
			System.out.println("파일생성 시작");
			
			String[] strArray = {"OutputStreamWrite에 대해 배웁니다.",
									"we are learning about OutputStreamWrite"};
			
			for(String s : strArray) {
				is.write(s);
			}
			is.close();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
