package ex2_FileWriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		try {
			// 확장자 명을 마음대로 지정이 가능함
			FileWriter fw = new FileWriter("C:\\Web1900_kdk/fileWriter예제.sql", true);
			
			fw.write("첫 번째 줄 작성하기 \n");
			fw.write("두 번째 줄 작성하기 \n");
			
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
