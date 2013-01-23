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


public class TutorialMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//testCollections();
		testDesignPatterns();
		
		//testGui();
		//list();
		
//		testSwingHacks();
//		testCalc();
//		testCalc();
		
//		Arrays arr = new Arrays();
//		arr.test();
		
//		System.out.println("teste");
//		Tmp tmp = new Tmp();
//		System.out.println(Tmp.seven);
//		
//		// static field can be used without instantiate objects
//		int soma = Tmp.sum(30, 40);
//		
//		// ... or can be used with instantiated objects
//		System.out.println(tmp.sum(10, 20));
//		
//		SubsubClass subsubObj = new SubsubClass();
//		MainClass mainObj = subsubObj;
		
		
		
	}
	
	public static void testDesignPatterns() {
		DesignPatterns dp = new DesignPatterns();
		dp.tmp();
	}
	
	public static void testGenerics() {
		Generics generics = new Generics();
		generics.tryBox2();
	}
	
	public static void testCollections() {
		Collections coll = new Collections();
//		coll.doSomething();
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
//		swingHacks.blurButton();
		swingHacks.filteredList();
		

	}

}
