// RainbowTest.java
// test Rainbow.java

import javax.swing.JFrame;

public class ArcSpiralTest {
	public static void main(String[] args) {
		ArcSpiral panel = new ArcSpiral();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
}