package ex2_JFrame;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	public JFrameTest() {
		setTitle("제목");
		// 매개변수가 4개다.
		setBounds(300, 300, 300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrameTest f = new JFrameTest();
	}
}
