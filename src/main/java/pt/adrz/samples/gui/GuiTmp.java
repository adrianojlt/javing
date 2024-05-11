package pt.adrz.samples.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiTmp extends JFrame implements ActionListener {

	// vars
	private String[] data = {"one","two","three"};
	private Container content;
	private Dimension dim;
	private int xWindowDim = 400;
	private int yWindowDim = 400;
	
	//lists
	private JList list;
	
	// panels
	private JPanel panel1;
	private JPanel panel2;
	
	// buttons
	private JButton button1;
	private JButton button2;
	private JButton buttonArray[];
	
	// textFields
	private JTextField tf1;
	private JTextField tf2;
	
	public GuiTmp() {
		super("empty frame!");
		
		// create components
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		button1 = new JButton("bt 1");
		button1.addActionListener(this);
		button2 = new JButton("bt 2");
		button2.addActionListener(this);
		buttonArray = new JButton[10];
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		
		content = this.getContentPane();
		content.setLayout(new FlowLayout(FlowLayout.LEFT));
//		content.setLayout(new FlowLayout());
		
//		for (int i=0 ; i <= 9 ; i++) {
//			buttonArray[i] = new JButton(String.valueOf(i));
//			content.add(buttonArray[i]);
//		}
		
//		content.add(panel1);
//		content.add(panel2);		
//		content.add(button1);
//		content.add(button2);
		
		this.ini();
		
	}
	
	private void ini() {
		this.setSize(xWindowDim, yWindowDim);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(false);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton tmp = (JButton)arg0.getSource();
		System.out.println(tmp.getText());
	}
}
