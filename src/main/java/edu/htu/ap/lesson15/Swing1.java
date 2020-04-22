package edu.htu.ap.lesson15;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing1 {
	public static void main(String[] args) {
		JFrame frm=new JFrame("My First Swing");
		frm.setLayout(new FlowLayout());//add components with their appropariate size
		
		frm.setSize(700, 300);
		frm.setLocationRelativeTo(null);
		
//		JButton btnAdd=new JButton("Add");
//		btnAdd.setForeground(Color.blue);
//		setColor(btnAdd);
		JButton btnAdd=ComponentFactory.createButton("Add");

//		JButton btnUpdate=new JButton("Update");
//		btnUpdate.setForeground(Color.blue);
		JButton btnUpdate=ComponentFactory.createButton("Update");
		
//		JButton btnDelete=new JButton("Delete");
//		btnDelete.setForeground(Color.blue);
		JButton btnDelete=ComponentFactory.createButton("Delete");
		
//		JButton btnShow=new JButton("Show All");
//		btnShow.setForeground(Color.blue);
		JButton btnShow=ComponentFactory.createButton("Show All");
		
//		setColor(btnAdd,btnDelete,btnShow,btnUpdate);
		
		JTextField txtId=ComponentFactory.createTextField(5) ;//new JTextField(10);
		JTextField txtName=ComponentFactory.createTextField(20) ;//new JTextField(20);
		JTextField txtSalary=ComponentFactory.createTextField(20) ;//new JTextField(20);
		
//		txtId.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				txtId.setBackground(Color.white);
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				txtId.setBackground(Color.yellow);
//			}
//		});
		
//		txtName.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				txtName.setBackground(Color.white);
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				txtName.setBackground(Color.yellow);
//			}
//		});
//		txtSalary.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				txtSalary.setBackground(Color.white);
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				txtSalary.setBackground(Color.yellow);
//			}
//		});		
		
		JPanel pnl=new JPanel();
		pnl.add(txtId);
		pnl.add(txtName);
		pnl.add(txtSalary);
		
		JPanel pnl2=new JPanel();
		pnl2.add(btnAdd);
		pnl2.add(btnUpdate);
		pnl2.add(btnDelete);
		pnl2.add(btnShow);
		
		frm.add(pnl);
		frm.add(pnl2);
		
		frm.setVisible(true);
	}
	
//	public static void setColor(JButton ... buttons) {
//		for (JButton btn: buttons) {
//			btn.setForeground(Color.red);			
//		}
//	}
}

