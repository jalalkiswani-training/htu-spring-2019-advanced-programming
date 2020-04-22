package edu.htu.ap.lesson15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * Factory method design pattern
 * @author Jalal Kiswani
 *
 */
public class ComponentFactory {
	public static JButton createButton(String title) {
		JButton btn=new JButton(title);
		btn.setForeground(Color.green);	
		btn.setBackground(Color.black);
		btn.setFont(new Font("Arial",Font.ITALIC,16));
		return btn;
	}
	
	public static JTextField createTextField(int width) {
		JTextField txt=new JTextField(width);
		txt.setPreferredSize(new Dimension(200,50));
		txt.setBorder(BorderFactory.createLineBorder(Color.white));
		txt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				txt.setBackground(Color.white);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				txt.setBackground(Color.yellow);
			}
		});
		return txt;
	}
}
