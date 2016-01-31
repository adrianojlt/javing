package pt.adrz.myjavatutorial.swing.mvc;

import javax.swing.SwingUtilities;

public class SwingMvcMain {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				try {
					createAndShowGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void createAndShowGUI() throws Exception {
		new SwingMvcView();
	}
}
