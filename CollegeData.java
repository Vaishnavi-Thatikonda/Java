package cse22546;

import java.awt.*;
import java.awt.event.*;

public class CollegeData extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label l;
	Button b;
	CollegeData(){
		Frame f = new Frame("College Data");
		MenuBar mb = new MenuBar();
		Menu CSE = new Menu("CSE");
		Menu ECE = new Menu("ECE");
		Menu IT = new Menu("IT");
		Menu EEE = new Menu("EEE");
		Menu AIML = new Menu("AIML");
		
		Menu CSE1 = new Menu("CSE1");
		Menu CSE2 = new Menu("CSE2");
		Menu CSE3 = new Menu("CSE3");
		Menu CSE4 = new Menu("CSE4");
		
		Menu ECE1 = new Menu("ECE1");
		Menu ECE2 = new Menu("ECE2");
		Menu ECE3 = new Menu("ECE3");
		Menu ECE4 = new Menu("ECE4");
		
		Menu IT1 = new Menu("IT1");
		Menu IT2 = new Menu("IT2");
		Menu IT3 = new Menu("IT3");
		Menu IT4 = new Menu("IT4");
		
		MenuItem EEE1 = new MenuItem("EEE1");
		MenuItem EEE2 = new MenuItem("EEE2");
		MenuItem EEE3 = new MenuItem("EEE3");
		MenuItem EEE4 = new MenuItem("EEE4");
		
		MenuItem AIML1 = new MenuItem("AIML1");
		MenuItem AIML2 = new MenuItem("AIML2");
		MenuItem AIML3 = new MenuItem("AIML3");
		MenuItem AIML4 = new MenuItem("AIML4");
		
		MenuItem CSE1A = new MenuItem("CSE1A");
		MenuItem CSE2A = new MenuItem("CSE2A");
		MenuItem CSE3A = new MenuItem("CSE3A");
		MenuItem CSE4A = new MenuItem("CSE4A");
		
		MenuItem CSE1B = new MenuItem("CSE1B");
		MenuItem CSE2B = new MenuItem("CSE2B");
		MenuItem CSE3B = new MenuItem("CSE3B");
		MenuItem CSE4B = new MenuItem("CSE4B");
		
		MenuItem CSE1C = new MenuItem("CSE1C");
		MenuItem CSE2C = new MenuItem("CSE2C");
		MenuItem CSE3C = new MenuItem("CSE3C");
		MenuItem CSE4C = new MenuItem("CSE4C");
		
		MenuItem ECE1A = new MenuItem("ECE1A");
		MenuItem ECE2A = new MenuItem("ECE2A");
		MenuItem ECE3A = new MenuItem("ECE3A");
		MenuItem ECE4A = new MenuItem("ECE4A");
		
		MenuItem ECE1B = new MenuItem("ECE1B");
		MenuItem ECE2B = new MenuItem("ECE2B");
		MenuItem ECE3B = new MenuItem("ECE3B");
		MenuItem ECE4B = new MenuItem("ECE4B");
		
		MenuItem IT1A = new MenuItem("IT1A");
		MenuItem IT2A = new MenuItem("IT2A");
		MenuItem IT3A = new MenuItem("IT3A");
		MenuItem IT4A = new MenuItem("IT4A");
		
		MenuItem IT1B = new MenuItem("IT1B");
		MenuItem IT2B = new MenuItem("IT2B");
		MenuItem IT3B = new MenuItem("IT3B");
		MenuItem IT4B = new MenuItem("IT4B");
		
		CSE1.add(CSE1A);
		CSE1.add(CSE1B);
		CSE1.add(CSE1C);
		CSE.add(CSE1);
		
		CSE2.add(CSE2A);
		CSE2.add(CSE2B);
		CSE2.add(CSE2C);
		CSE.add(CSE2);
		
		CSE3.add(CSE3A);
		CSE3.add(CSE3B);
		CSE3.add(CSE3C);
		CSE.add(CSE3);
		
		CSE4.add(CSE4A);
		CSE4.add(CSE4B);
		CSE4.add(CSE4C);
		CSE.add(CSE4);
		
		ECE1.add(ECE1A);
		ECE1.add(ECE1B);
		ECE.add(ECE1);
		
		ECE2.add(ECE2A);
		ECE2.add(ECE2B);
		ECE.add(ECE2);
		
		ECE3.add(ECE3A);
		ECE3.add(ECE3B);
		ECE.add(ECE3);
		
		ECE4.add(ECE4A);
		ECE4.add(ECE4B);
		ECE.add(ECE4);
		
		IT1.add(IT1A);
		IT1.add(IT1B);
		IT.add(IT1);
		
		IT2.add(IT2A);
		IT2.add(IT2B);
		IT.add(IT2);
		
		IT3.add(IT3A);
		IT3.add(IT3B);
		IT.add(IT3);
		
		IT4.add(IT4A);
		IT4.add(IT4B);
		IT.add(IT4);
		
		EEE.add(EEE1);
		EEE.add(EEE2);
		EEE.add(EEE3);
		EEE.add(EEE4);
		
		AIML.add(AIML1);
		AIML.add(AIML2);
		AIML.add(AIML3);
		AIML.add(AIML4);
		
		mb.add(CSE);
		mb.add(ECE);
		mb.add(IT);
		mb.add(EEE);
		mb.add(AIML);
		
		f.setMenuBar(mb);
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String args[]) {
		new CollegeData();
	}
}
