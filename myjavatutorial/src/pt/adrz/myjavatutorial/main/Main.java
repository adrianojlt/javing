package pt.adrz.myjavatutorial.main;

import java.util.Date;

import javax.swing.JFrame;

import pt.adrz.myjavatutorial.basics.Dates;
import pt.adrz.myjavatutorial.collections.Collections;
import pt.adrz.myjavatutorial.euler.Euler;
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
		//testDesignPatterns();
		//simpleCalculator();
		//testSwingHacks();
		//testEuler();
		//dates();
		//list();
		varIncrement();
		tmp();
	}
	
	public static void tmp() {
		
	}
	
	public static void varIncrement() {
		int h = 1; // teste
		int a = h++; // add value then increment
		int b = --h; // decrement then add i value
		System.out.println("h = " + h + " ; a = " + a + " ; b = " + b + " ;");
	}
	
	public static void dates() {
		Dates dates = new Dates();
		dates.temp();
	}
	
	public static void testEuler() {
		Euler euler = new Euler();
		Euler.p004_largest_palindrome_product();
		//Euler.p001_multiples_of_3_and_5();
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
	
	public static void simpleCalculator() {
		Calculator calc = new Calculator();
	}
	
	public static void testSwingHacks() {
		SwingHacks swingHacks = new SwingHacks();
		swingHacks.blurButton();
		swingHacks.tabEfects();
		swingHacks.filteredList();
	}

}
