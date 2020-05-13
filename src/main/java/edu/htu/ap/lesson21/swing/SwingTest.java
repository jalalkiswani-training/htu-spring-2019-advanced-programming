package edu.htu.ap.lesson21.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingTest {
	public static void main(String[] args) {
		JFrame frm=new JFrame("My First Frame");
		
		//width: 500 pixel
		//height: 400 pixel
		frm.setSize(500, 400);
		//to centralize the frame in the middle of the screen
		frm.setLocationRelativeTo(null);
		//exit the application when you click the close window icon
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frm.setTitle("My first Frame");
		
		/**
		 * Add the components to the frame based on their preffered sizes
		 */
		frm.setLayout(new FlowLayout());
		
		JTextField txtName=new JTextField(10);
		JButton btnSayHello=new JButton("Say Hi");
		JLabel lblName=new JLabel("Your Name");
		
		frm.add(lblName);
		frm.add(txtName);
		frm.add(btnSayHello);
		
		btnSayHello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Hi , "+txtName.getText());
				JOptionPane.showMessageDialog(null, "Hi , "+txtName.getText());
			}
		});
		
		frm.setVisible(true);
	}
}
