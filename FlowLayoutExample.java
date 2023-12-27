package cse22546;

import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5;
	FlowLayoutExample(){
		b1 = new Button("CSE");
		b2 = new Button("ECE");
		b3 = new Button("IT");
		b4 = new Button("EEE");
		b5 = new Button("AIML");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});	
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	public void actionPerformed(ActionEvent ae){}
	public static void main(String args[]) {
		new FlowLayoutExample();
	}
}
