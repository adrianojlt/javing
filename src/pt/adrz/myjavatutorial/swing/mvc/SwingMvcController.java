package pt.adrz.myjavatutorial.swing.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingMvcController implements ActionListener {
	
	private JTextField searchTermTextField = new JTextField(26);
	private SwingMvcModel model;

	public SwingMvcController(JTextField searchTermTextField, SwingMvcModel model) {

		super();

		this.searchTermTextField = searchTermTextField;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String searchTerm = searchTermTextField.getText();

		if ( searchTerm != null && !"".equals(searchTerm) ) {

			Object[][] newData = new Object[SwingMvcConstants.DATA.length][];
			int idx = 0;

			for ( Object[] o: SwingMvcConstants.DATA ) {

				if ( "*".equals(searchTerm.trim()) ) {
					newData[idx++] = o;
				} else {
					if( String.valueOf(o[0]).startsWith(searchTerm.toUpperCase().trim()) ){
						newData[idx++] = o;
					}	
				}	
			}

			model.setDataVector(newData, SwingMvcConstants.TABLE_HEADER);

		} else {
			model.setDataVector(SwingMvcConstants.DATA,SwingMvcConstants.TABLE_HEADER);
		}
	}
}
