package pt.adrz.myjavatutorial.tmp;

import java.util.HashMap;

public class CloneTest implements Cloneable {

	private int id;
	private String name;
	private HashMap props;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
		 
	public void setName(String name) {
		this.name = name;
	}
		 
	public HashMap getProps() {
		return props;
	}
		 
	public void setProps(HashMap props) {
		this.props = props;
	}
		
		 
	
}
