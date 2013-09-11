// TextFieldFrame.java
// Demonstrates the JTextField class
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class TextFieldFrame extends JFrame {
	private JTextField textField1;			//textField with set size
	private JTextField textField2;			//textField constructed with text
	private JTextField textField3;			//textField with text and size
	private JPasswordField passwordField;	//password field with text
	
	// TextFieldFrame constructor adds JTextFields to JFrame
	public TextFieldFrame() {
		super("Testing JTextField as JPasswordField");
		setLayout( new FlowLayout() );
		
		//construct textField with 10 columns (characters)
		textField1 = new JTextField( 10 );
		add( textField1 ); // add textField to JFrame
		
		//construct textField with default text
		textField2 = new JTextField( "Enter text here" );
		add( textField2 ); // add textField to JFrame
		
		//construct textField with default text and 21 chars
		textField3 = new JTextField( "Uneditable text field", 21 );
		textField3.setEditable(false);
		add( textField3 );
		
		//construct passwordField with default text
		passwordField = new JPasswordField( "Hidden text" );
		add( passwordField );
		
		
		//register event handlers
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener( handler );
		textField2.addActionListener( handler );
		textField3.addActionListener( handler );
		passwordField.addActionListener( handler );
		
		
	} // end textFieldFrame constructor
	
	//private inner class for event handling
	private class TextFieldHandler implements ActionListener {
		
		//process text field events
		public void actionPerformed( ActionEvent event ) {
			String string = ""; // declare string to display
			
			//user pressed Enter in textField1
			if (event.getSource() == textField1)
				string = String.format("textField1: %s", 
					event.getActionCommand());
			
			//user pressed Enter in textField2
			if (event.getSource() == textField2)
				string = String.format("textField2: %s", 
					event.getActionCommand());
			
			//user pressed Enter in textField3
			if (event.getSource() == textField3) {
				string = String.format("textField3: %s", 
					event.getActionCommand());
				textField3.setText("No, this text is UNEDITABLE"); }
			
			//user pressed Enter in passwordField
			if (event.getSource() == passwordField)
				string = String.format("passwordField: %s", 
					new String( passwordField.getPassword()));
			
			//display JTextField content
			JOptionPane.showMessageDialog( null, string);
			
		}// end actionPeformed method
		
	}// end inner class TextField Handler

}// end TextFieldFrame class
