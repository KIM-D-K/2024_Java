package ex5_phone;

public class Graph_t {
	public String Printpg(char ch, int num) {
		char[] val = new char[num];
		String str = "";
		for(int i = 0; i < val.length; i++) {
			str += val[i] = ch;
		}
		return str;
	}
}
