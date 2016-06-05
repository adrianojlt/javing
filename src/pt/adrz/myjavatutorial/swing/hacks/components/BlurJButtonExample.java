package pt.adrz.myjavatutorial.swing.hacks.components;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BlurJButtonExample extends JFrame {
	
	public BlurJButtonExample() {
		final JButton button = new BlurJButton("blur button");
		JButton control = new JButton("Switch");
		control.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button.setEnabled(!button.isEnabled());
				
			}
		});
		
		this.getContentPane().add(button);
		this.getContentPane().add("South",control);
	}	
}


class BlurJButton extends JButton {

    public BlurJButton(String text) {
        super(text);
    }
    
    public void paintComponent(Graphics g) {
        if(isEnabled()) {
            super.paintComponent(g);
            return;
        }
        
        float[] my_kernel = {
            0.10f, 0.10f, 0.10f,
            0.10f, 0.20f, 0.10f,
            0.10f, 0.10f, 0.10f };
        ConvolveOp op = new ConvolveOp(new Kernel(3,3, my_kernel));
        BufferedImage buf = new BufferedImage(getWidth(),getHeight(),
            BufferedImage.TYPE_INT_RGB);
        super.paintComponent(buf.getGraphics());
        Image img = op.filter(buf,null);
        g.drawImage(img,0,0,null);
        
    }


}
