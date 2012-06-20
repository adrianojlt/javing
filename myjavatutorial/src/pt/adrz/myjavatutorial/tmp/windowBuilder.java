package pt.adrz.myjavatutorial.tmp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windowBuilder {

	private JFrame frame;
	private JPanel panel1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowBuilder window = new windowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.desktop);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 5, 2));
		
		panel1 = new JPanel();
		panel1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		panel1.setBackground(SystemColor.desktop);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 49, 198, 213);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"primeiro", "segundo"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setVisibleRowCount(10);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel1.add(list);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 132, 27);
		textField.setFont(new Font("Verdana", Font.PLAIN, 10));
		panel1.add(textField);
		textField.setColumns(10);
		
		JButton findButton = new JButton("Find");
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		findButton.setBounds(152, 13, 56, 23);
		panel1.add(findButton);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(SystemColor.desktop);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 198, 251);
		textArea.setRows(10);
		textArea.setColumns(20);
		panel2.add(textArea);
	}
}
