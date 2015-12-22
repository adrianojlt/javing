package pt.adrz.myjavatutorial.gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

public class DynamicList extends JList {
	
	// field used to search
	private FilterField filterField;
	
	// Model
	private FilterModel filterModel;
	
	// width of the search field
	private int FIELD_WIDTH = 20;
	
	public DynamicList() {
		super();
		filterField = new FilterField(FIELD_WIDTH, this);
		filterModel = new FilterModel(filterField);
		this.setModel(filterModel);
	}
	
	
	public JTextField getFilterField() {
		return this.filterField;
	}
	
	public FilterModel getModel() {
		return this.filterModel;
	}
	

}
