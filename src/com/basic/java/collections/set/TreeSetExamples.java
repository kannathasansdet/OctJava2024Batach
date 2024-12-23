package com.basic.java.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

	 // Main driver method
    public static void main(String[] args)
    {
        // Creating a Set object and declaring it of String
        // type
        // with reference to TreeSet
        Set<String> ts = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("UK");
        ts.add("South Africa");
        ts.add("USA");
        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();

        while (i.hasNext())
            System.out.println(i.next());
    }
}
