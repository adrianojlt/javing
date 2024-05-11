package pt.adrz.samples.tmp;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.Transferable;

public class Flavor implements FlavorListener, ClipboardOwner {
	
	private Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	
	public Flavor() {

		System.out.println("new Flavor");

		clip.setContents(clip.getContents(null), this);
		clip.addFlavorListener(this);
		
		try {
			Thread.sleep(100000L);
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Flavor flavor = new Flavor();
	}

	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {
		 System.out.println("ownership losted");
	}

	@Override
	public void flavorsChanged(FlavorEvent e) {

		Transferable tf = null;

		System.out.println("ClipBoard Changed!!!");
		
		try {

			clip.removeFlavorListener(this);
			clip = Toolkit.getDefaultToolkit().getSystemClipboard();
			tf = clip.getContents(null);
			clip.addFlavorListener(this);

			if ( tf.isDataFlavorSupported(DataFlavor.stringFlavor) ) {
				String fromClipboard = (String)tf.getTransferData(DataFlavor.stringFlavor);
				System.out.println("String from ClipBoard: " + fromClipboard);
			}

		}
		catch (Exception eex) {
			eex.printStackTrace();
		}
		
		clip.removeFlavorListener(this);
		clip.setContents(clip.getContents(null), this);
		clip.addFlavorListener(this);
	}
}
