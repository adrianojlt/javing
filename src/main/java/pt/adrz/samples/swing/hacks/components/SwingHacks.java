package pt.adrz.samples.swing.hacks.components;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class SwingHacks {

	/**
	 * tab pane with fading efects
	 */
	public void tabEfects() {
		TabFade tabFade = new TabFade();
		tabFade.setSize(200, 200);
		tabFade.setLocationRelativeTo(null);
		tabFade.pack();
		tabFade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabFade.setVisible(true);
	}
	
	/**
	 * Blur botton example
	 */
	public void blurButton() {
		JFrame frame = new BlurJButtonExample();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void filteredList() {
		String[] listItems = {
				"chris","maria","tonio","cunha",
				"teixeira","fonseca","meireles"
		};
		JFrame frame = new JFrame("Filtered List");
		frame.getContentPane().setLayout(new BorderLayout());
//		FilteredJList list = new FilteredJList();
//		for (int i=0; i<listItems.length; i++)
//            list.addItem (listItems[i]);
//        // add to gui
//        JScrollPane pane =
//            new JScrollPane (list,
//                             ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
//                             ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//        frame.getContentPane().add (pane, BorderLayout.CENTER);
//        frame.getContentPane().add (list.getFilterField(),
//                                    BorderLayout.NORTH);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setVisible(true);
	}
	
}
