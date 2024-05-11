package pt.adrz.samples.swing.mvc;

import javax.swing.table.DefaultTableModel;

public class SwingMvcModel extends DefaultTableModel {
	
	private static final long serialVersionUID = 1L;

	public SwingMvcModel() {
		super(SwingMvcConstants.DATA,SwingMvcConstants.TABLE_HEADER);
	}
}
