package edu.htu.ap.lesson21.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingTest2 {
	public static void main(String[] args) {
		JFrame frmCal=new JFrame("Two numbers calculator");
		frmCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCal.setSize(220, 200);
		frmCal.setLayout(new FlowLayout());
		frmCal.setLocationRelativeTo(null);

		JLabel lbl1 = new JLabel("Number 1");
		JTextField txt1=new JTextField(10);
		JLabel lbl2 = new JLabel("Number 2");
		JTextField txt2=new JTextField(10);
		JButton btnAdd=new JButton("Add");
		//to control the size of the button
		btnAdd.setPreferredSize(new Dimension(170, 25));
		
		JLabel lbl3 = new JLabel("Result");
		JTextField txt3=new JTextField(10);
		
		frmCal.add(lbl1);
		frmCal.add(txt1);
		frmCal.add(lbl2);
		frmCal.add(txt2);
		frmCal.add(btnAdd);
		frmCal.add(lbl3);
		frmCal.add(txt3);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(txt1.getText());
				int n2=Integer.parseInt(txt2.getText());
				int results=n1+n2;
				//in Java i can convert from int to string in two ways
				//1)String str=Integer.toString(number);
				//2)String srr=number+"";
				txt3.setText(results+"");
			}
		});
		
		frmCal.setVisible(true);
	}
}
