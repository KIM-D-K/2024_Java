package ex4_InputStreamReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex1_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("C:\\Web1900_kdk/test.txt");
			is = new InputStreamReader(in, "UTF-8");
			
			int read = 0;
			while((read = is.read()) != - 1) {
				System.out.print((char)read);
			}
			is.close();
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
