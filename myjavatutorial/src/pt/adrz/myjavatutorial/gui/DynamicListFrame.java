package pt.adrz.myjavatutorial.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class DynamicListFrame extends JFrame {
	
	// list
	private DynamicList list;
	
	private JScrollPane pane;
	
	public DynamicListFrame() {
		this.getContentPane().setLayout(new BorderLayout());
		list = new DynamicList();
		
		
		// add items to the linked list
		list.getModel().addElement("primerio");
		list.getModel().addElement("segundo");
		list.getModel().addElement("terceiro");
		list.getModel().addElement("quarto");
		list.getModel().addElement("quinto");
		list.setSelectedIndex(0);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		this.addComp();
		
		this.windowOptions();
	}
	
	
	private void addComp() {
		pane = new JScrollPane(list,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.getContentPane().add(pane, BorderLayout.CENTER);
		this.getContentPane().add(list.getFilterField(), BorderLayout.NORTH);
	}
	
	private void windowOptions() {
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	
}
