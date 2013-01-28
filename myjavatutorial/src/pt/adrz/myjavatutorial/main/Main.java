package pt.adrz.myjavatutorial.main;

import javax.swing.JFrame;

import pt.adrz.myjavatutorial.collections.Collections;
import pt.adrz.myjavatutorial.designPatterns.DesignPatterns;
import pt.adrz.myjavatutorial.generics.Generics;
import pt.adrz.myjavatutorial.gui.DynamicListFrame;
import pt.adrz.myjavatutorial.gui.GuiTmp;
import pt.adrz.myjavatutorial.gui.ListExample;
import pt.adrz.myjavatutorial.swingHacks.components.BlurJButtonExample;
import pt.adrz.myjavatutorial.swingHacks.components.SwingHacks;
import pt.adrz.myjavatutorial.swingHacks.components.TabFade;
import pt.adrz.myjavatutorial.tmp.Calculator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//testCollections();
		testDesignPatterns();
		//testGui();
		//list();
		//testSwingHacks();
		//testCalc();
	}
	
	public static void testDesignPatterns() {
		new DesignPatterns().swingObserverPatterns();
		new DesignPatterns().coffeDecorator();
	}
	
	public static void testGenerics() {
		Generics generics = new Generics();
		generics.tryBox2();
	}
	
	public static void testCollections() {
		Collections coll = new Collections();
		coll.doSomething();
		coll.test();
		
	}
	
	public static void testGui() {
		GuiTmp gui = new GuiTmp();
	}
	
	public static void list() {
//		ListExample  list = new ListExample();
		DynamicListFrame listFrame = new DynamicListFrame();
	}
	
	public static void testCalc() {
		Calculator calc = new Calculator();
	}
	
	public static void testSwingHacks() {
		SwingHacks swingHacks = new SwingHacks();
		swingHacks.blurButton();
		swingHacks.tabEfects();
		swingHacks.filteredList();
	}

}
