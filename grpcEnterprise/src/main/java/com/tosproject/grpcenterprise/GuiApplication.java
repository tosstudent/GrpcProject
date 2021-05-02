package com.tosproject.grpcenterprise;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GuiApplication {
	public GuiApplication() {
		JFrame frame = new JFrame();
	
	
	
		JButton button = new JButton("Login");
		JLabel label = new JLabel ("Welcome to Cornelius Emergency Service");
		button.setBounds(50,50,90,50);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder (50,50,15,50));
		panel.setLayout(new GridLayout (0,1));
		panel.add(button);
		panel.add(label);
	
		
	
		
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle ("Gui Application");
		frame.pack();
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLayout(null);
	}

		public static void main(String[] args) {
			new GuiApplication();
		
		
	}

	}


