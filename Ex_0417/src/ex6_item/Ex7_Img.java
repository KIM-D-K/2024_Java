package ex6_item;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex7_Img {
	public static void main(String[] args) {
		JFrame f = new JFrame("테이블 만들기");
		f.setLayout(null);
		
		ImageIcon back = new ImageIcon("src/images/img.jpg");
		JLabel jl_back = new JLabel(back);
		jl_back.setBounds(0,0,500,500);
		
		f.add(jl_back);
		
		f.setBounds(400, 400, 700, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
