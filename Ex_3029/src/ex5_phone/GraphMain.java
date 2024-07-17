package ex5_phone;

public class GraphMain {
	public static void main(String[] args) {
		Graph g = new Graph();
		
		int x[] = g.randomZero();
		for(int i = 0; i < x.length; i++) {
			System.out.print(i + "의 갯수" + " : ");
			for(int j = 0; j < x[i]; j++) {
				System.out.print('#');
			}
			System.out.print(x[i] + "\n");
		}
	}
}
