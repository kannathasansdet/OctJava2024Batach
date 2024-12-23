package com.basic.java.collection.map;

import java.util.HashMap;
import java.util.Map;

/*  
 * Output- 
    Value Associated with key 'two'= 2
	Keysets: [six, one, seven, two]
	Entry of map: [six=6, one=1, seven=7, two=2]
	Size of map: 4
	one : 1
	{six=6, one=1, seven=7, two=2}
 * 
 */
public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<>();
		m.put("six", 6);
		m.put("onee", 1);
		m.put("two", 20);
		m.put("seven", 70);
		System.out.print("Value Associated with key 'two'= "+m.get("two")+"\n");
		System.out.print("Keysets: "+m.keySet()+"\n");
		System.out.print("Entry of map: "+m.entrySet()+"\n");
		System.out.println("Size of map: "+m.size());
		if(m.containsKey("onee")) {
			Integer h =m.get("onee");
			System.out.println("one : "+h);
		}
		if(!m.isEmpty())
			System.out.println(m);
	}
}
