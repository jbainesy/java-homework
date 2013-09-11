// RainbowTest.java
// test Rainbow.java

import javax.swing.JFrame;

public class RainbowTest {
	public static void main(String[] args) {
		Rainbow panel = new Rainbow();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
	}
}