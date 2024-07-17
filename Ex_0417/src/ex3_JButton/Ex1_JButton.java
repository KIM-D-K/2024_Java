package ex3_JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// JButton은 클릭 기능을 제공한다.
// JButton클래스는 문자열 또는 아이콘을 사용하여 버튼을 생성할 수 있으며
// AbstractButton클래스로부터 상속 받는다.

public class Ex1_JButton {
	public static void main(String[] args) {
		JButton jbtn1, jbtn2, jbtn3;
		
		JFrame f = new JFrame();
		
		// 버튼의 변수 이름 =  new 버튼 이름
		jbtn1 = new JButton("1");
		// 프레임의 레이아웃이 flowlayout일 때
		// 버튼의 크기를 수정하고 싶으면 setPreferredSize(new Dimension(가로, 세로))
		jbtn1.setPreferredSize(new Dimension(100, 100));
		jbtn2 = new JButton("2");
		jbtn2.setPreferredSize(new Dimension(60, 30));
		jbtn3 = new JButton("3");
		jbtn3.setPreferredSize(new Dimension(60, 30));
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
		f.setLayout(new FlowLayout());
		f.setTitle("제목2");
		f.setBounds(300, 300, 500, 500);
		f.setVisible(true);
	}
}
