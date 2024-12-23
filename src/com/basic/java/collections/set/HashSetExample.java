package com.basic.java.collections.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* Output-
 * 		
 *  Java
	C
	JavaScript
	Python
 *  
 * */
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> list= new HashSet<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JavaScript");
		
		System.out.println(list);

		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removed Element: "+list.remove("Python"));
		
		  // Declaring a string
        String check = "C";

        // Check if the above string exists in
        // the SortedSet or not
        // using contains() method
        System.out.println("Contains " + check + " "
                           + list.contains(check));
	}
}
