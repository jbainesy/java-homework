// DrawSmileyTest.java
// application that displays a smiley face

import javax.swing.JFrame;

public class DrawSmileyTest {

	public static void main(String[] args) {
		DrawSmiley panel1 = new DrawSmiley();
		DrawBullseye panel2 = new DrawBullseye();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel2);
		application.setSize(266, 288);
		application.setVisible(true);
	} // end main method
} // end DrawSmileyTest class
