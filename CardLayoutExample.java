package cse22546;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CardLayout card;
	JButton b1,b2,b3,b4,b5,b6,b7;
	Container c;
	CardLayoutExample(){
		
		c=getContentPane(); 
		card=new CardLayout(40,40);
		c.setLayout(card);
		b1 = new JButton("Sunday");
		b2 = new JButton("Monday");
		b3 = new JButton("Tuesday");
		b4 = new JButton("Wednesday");
		b5 = new JButton("Thursday");
		b6 = new JButton("Friday");
		b7 = new JButton("Saturday");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		c.add("a",b1);
		c.add("b",b2);
		c.add("c",b3);
		c.add("d",b4);
		c.add("e",b5);
		c.add("f",b6);  
		c.add("g",b7); 
    }
	public void actionPerformed(ActionEvent e) {
		card.next(c);	
	}
	public static void main(String args[]) {
		CardLayoutExample cl = new CardLayoutExample(); 
		cl.setSize(400,400);
		cl.setVisible(true);
		cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
