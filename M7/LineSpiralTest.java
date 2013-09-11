// RainbowTest.java
// test Rainbow.java

import javax.swing.JFrame;

public class LineSpiralTest {
	public static void main(String[] args) {
		LineSpiral panel = new LineSpiral();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
}