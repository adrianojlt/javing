package pt.adrz.samples.gui;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListExample extends JFrame{
	
	private int xWindowDim = 400;
	private int yWindowDim = 400;
	
	DefaultListModel		model 		= new DefaultListModel();
	JList 					list 		= new JList(model);
	JScrollPane				scrollPane1 = new JScrollPane(list);
	JTextArea				textArea 	= new JTextArea();
	JScrollPane				scrollPane2 = new JScrollPane(textArea);
	
	
	static String labels[] = {"primeiro", "segundo", "terceiro","quarto"};
	
	public ListExample() {
		super("jlist");
		
		
		
		// fill model
		for (int i = 0, n = labels.length ; i < n ; i++)
			model.addElement(labels[i]);
		
		this.add(scrollPane1, BorderLayout.WEST);
		this.add(scrollPane2, BorderLayout.CENTER);
		
		this.setSize(xWindowDim, yWindowDim);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
}
