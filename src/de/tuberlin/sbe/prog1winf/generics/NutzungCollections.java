package de.tuberlin.sbe.prog1winf.generics;

import de.tuberlin.sbe.prog1winf.objectOrientedProgramming.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

public class NutzungCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
//		LinkedList list = new LinkedList();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(56.89237497829387d);
		//list.add("String"); // not allowed
		System.out.println(list);
		list.add(3);
		list.add(3.3);
		System.out.println(list);
		System.out.println(list.indexOf(3));

//		int i =0;
////		for (int i=0; i< list.size(); i++) {
//		for (Object o : list) {
////			Object o = list.get(i);
//			System.out.println(o);
//			if (o instanceof Integer) {
////				int curr = ((Integer) o).intValue();
//				Integer three = 3;
//				if (o == three) {
//					// do something
//					System.out.println("Found a 3 at pos: " + i);
//				}
//			}
//			i++;
//		}
//
//		for (Number n : list){
//			if (n.doubleValue() > 5) {
//				System.out.println("Greater than 5: " + n);
//			}
//		}

//		Employee employeeA = new Employee();
//		Employee employeeB = new Employee();
//		System.out.println(employeeA.getEmployeeID());
//		System.out.println(employeeB.getEmployeeID());
//		employeeA.setEmployeeID(1);
//		if (employeeA.equals(employeeB)) {
//			System.out.println("true");
//		} else  {
//			System.out.println("false");
//		}

		printList(list);
		Number [] arr = list.toArray(new Number[list.size()]);
		NumberUtils utils = new NumberUtils();
		System.out.println(utils.sum(list));

		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("hello World", 123);
		myMap.put("hello World", 1234);
		System.out.println(myMap.get("hello World"));
		System.out.println(myMap.get("hello Mars"));

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(7);
		list2.add(8);
		list2.add(9);
		printList(list2); //funktioniert nur bei Verwendung von Wildcard beim printList-Parameter


		Paar<Number> paar = new Paar<>();
		paar.a = 123;
		paar.b = 456.7d;
//		paar.a = "hello"; // Compilerfehler
		Paar<String> strPaar = new Paar<>();
		strPaar.a = "hello";
//		ZweitesZahlenPaar<String> paarString = new ZweitesZahlenPaar<>(); //Compilerfehler
		ZweitesZahlenPaar<Integer> zweites = new ZweitesZahlenPaar<>();
		List<Paar<? extends Number>> paare = new ArrayList<>();
		paare.add(paar);
		paare.add(zweites);

	}

	public static void printList(List<? extends Number> list) {
		for (Number n : list)
			System.out.println(n);
	}

}

// eigene Generics-Klassen implementieren -- zu verstehen in Analogie zu List<T>:

class Paar<T>{
	public T a; //speichert beliebige Paare
	public T b; //aber: a und b müssen beide vom Typ T sein! (T wird vorher festgelegt, Subklassen gehen auch)
}

//alternativ, mit Typsicherheit, für jeden Typen separat:
class IntegerPaar{
	public Integer a;
	public Integer b;
}
//class StringPaar...

//oder alternativ ohne Typsicherheit:
class ObjectPaar{
	public Object a;
	public Object b;
}

class ZahlenPaar<T extends Number> {
	public T a; //speichert beliebige Paare, die aber Number oder Kindklasse von Number sein müssen
	public T b;
}

class ZweitesZahlenPaar<T extends Number> extends Paar<T>{
	//macht das gleiche wie ZahlenPaar, nutzt aber Vererbung aus
}