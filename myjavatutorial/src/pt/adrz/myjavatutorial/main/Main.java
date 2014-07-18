package pt.adrz.myjavatutorial.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		//list();
		//date_calculation();
		//varIncrement();
		//tmp();
		System.out.println(divide(1000, 2));
		
	}
	
	public static void tmp() {
		//String teste = "string de teste";
		//System.out.println(teste.substring(0, 4));
		int num_days_interval = 5;
		float interval_millisecouds= 3014577011L;
		float interval_days = interval_millisecouds /(1000*60*60*24);
		System.out.println(interval_days);
		
		if ( interval_days >= num_days_interval ) {
			System.out.println("true");
		}
	}
	
	public static int divide(int a, int b) {
		
		int sign = 1;
		int result = 0;
		
		if ( b == 0 ) throw new IllegalArgumentException("nao pode ser 0");
		
		while ( a >= 0 ) {
			a -= b;
			result++;
		}

		return result;
	}
	
	public static void date_calculation() {
		
		Date today = new Date();
		Date date1 = new Date(); 
		String dateString = "2014/05/15";

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		try {  date1 = sdf.parse(dateString); } catch (ParseException e) { e.printStackTrace(); }
		int compVal = today.compareTo(date1);
		
		long interval = today.getTime() - date1.getTime();
		
		int days  = (int) interval / (1000*60*60*24);

		System.out.println("today: " + today.toString());
		System.out.println("date1: " + date1.toString());
		System.out.println("compV: " + compVal);
		System.out.println("interval (millisecounds): " + interval);
		System.out.println("days: " + days);
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
		euler.p001_multiples_of_3_and_5();
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
