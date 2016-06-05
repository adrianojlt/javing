package pt.adrz.myjavatutorial.swing.hacks.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabFade extends JFrame{
	
	JTabbedPane tab;
	
	public TabFade() {
		tab = new VenetianPane();
		tab.addTab("t1", new JButton("test button 1"));
		tab.addTab("t2", new JButton("test button 2"));
		this.getContentPane().add(tab);
		
	}

}
