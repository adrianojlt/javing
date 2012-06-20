package pt.adrz.myjavatutorial.gui;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FilterField extends JTextField implements DocumentListener{

	// reference to list
	DynamicList list;
	
	public FilterField(int width, DynamicList list) {
		super(width);
		this.getDocument().addDocumentListener(this);
		this.list = list;
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		list.getModel().refilter();
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		((FilterModel)list.getModel()).refilter();
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		((FilterModel)list.getModel()).refilter();
	}
	
	
	
	
	
}
