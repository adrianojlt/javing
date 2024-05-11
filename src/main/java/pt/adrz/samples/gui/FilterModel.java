package pt.adrz.samples.gui;

import java.util.LinkedList;

import javax.swing.AbstractListModel;
import javax.swing.JList;

public class FilterModel extends AbstractListModel {
	
	private LinkedList<String> items;
	private LinkedList<String> filterItems;
	
	private FilterField filterField;
	
	
	public FilterModel(FilterField field) {
		super();
		this.filterField = field;
		items 		= new LinkedList<String>();
		filterItems = new LinkedList<String>();
	}
	
	public LinkedList<String> getItems() {
    	return items;
    }
    
    public int getSize() {
        return filterItems.size();
    }
    
    public void addElement(String str) {
    	items.add(str);
    	this.refilter();
    }
    
    public void addElementTo(String str, int index) {
    	items.add(index,str);
    	this.refilter();
    }
    
    public void remove(int index) {
    	items.remove(index);
    	this.refilter();
    }
    
    public void refilter() {
    	filterItems.clear();
    	String term = this.filterField.getText();
    	for (int i = 0; i < items.size() ; i++) {
    		if (items.get(i).toString().indexOf(term,0)!=-1) {
    			filterItems.add(items.get(i));
    		}
    	}
    	fireContentsChanged(this, 0, getSize());
    }

	@Override
	public Object getElementAt(int index) {
		 if (index < filterItems.size())
             return filterItems.get (index);
         else
             return null;
	}

	

}
