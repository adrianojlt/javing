package pt.adrz.myjavatutorial.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Collections {

	LinkedList<String> stringList;
	
	LinkedList<TestClass> objList;
	
	
	
	public Collections() {
		stringList = new LinkedList<String>();
		objList = new LinkedList<TestClass>();
		
	}
	
	public void doSomething() {
		
		TestClass obj1, obj2;
		
		obj1 = new TestClass("primeiro", 	"primeiro obj");
		obj2 = new TestClass("segundo", 	"segundo obj");
		
		stringList.add("primeiro");
		stringList.add("segundo");
		
		objList.add(obj1);
		objList.add(obj2);
		
		TestClass tmpObj;
		tmpObj = objList.getFirst();
		System.out.println(tmpObj.getData());
//		Iterator it = stringList.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next() + " ");
//		}
		
//		System.out.println(myList.getFirst());
	}
	
	public void test() {
		Set<String> set = new HashSet<String>();
		java.util.Collections.addAll(set, "cn","fr","gb","ru");
		System.out.println(set);
		set.add("new");
		System.out.println(set);
	}
	
	public void hash() {
		
		Collection<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1));
		persons.add(new Person(2));
		Person p3 = new Person(3);
		persons.add(p3);
		Person p4 = new Person(4);
		if (persons.contains(p4)) 
			System.out.println("contains");
	}
	
	public class Person {
		
		private int id;
		public Person(int id) { this.id = id; }
		public int getId() { return id; }
		public void setId(int id) { this.id = id; }
	}
	
	
}
