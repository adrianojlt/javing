package pt.adrz.myjavatutorial.swing.mvc;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class SwingMvcView {
	
	public SwingMvcView() {

		// Create views swing UI components
		JTextField searchTermTextField = new JTextField(26);
		JButton filterButton = new JButton("Filter");
		JTable table = new JTable();

		// Create table model
		SwingMvcModel model = new SwingMvcModel();
		table.setModel(model);

		// Create controller
		SwingMvcController controller = new SwingMvcController(searchTermTextField, model);
		filterButton.addActionListener(controller);

		// Set the view layout
		JPanel ctrlPane = new JPanel();
		ctrlPane.add(searchTermTextField);
		ctrlPane.add(filterButton);

		JScrollPane tableScrollPane = new JScrollPane(table);
		tableScrollPane.setPreferredSize(new Dimension(700, 182));
		tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Market Movers", TitledBorder.CENTER, TitledBorder.TOP));

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, tableScrollPane);
		splitPane.setDividerLocation(35);
		splitPane.setEnabled(false);

		// Display it all in a scrolling window and make the window appear
		JFrame frame = new JFrame("Swing MVC Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
