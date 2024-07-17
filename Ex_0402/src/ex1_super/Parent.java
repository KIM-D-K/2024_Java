package ex1_super;

public class Parent { 
	public Parent(int n) {
		System.err.println("자식에게 받은 " + n + "출력");
	}
	public int result() {
		return 100;
	}
}
