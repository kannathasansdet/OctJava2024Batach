package com.java.methods;

public class MoreThanOneMainMethodDemo {

	 public static void main(int a)
	 { 
	    System.out.println("Second main() method"); 
	    main(); 
	 } 
	 public static void main()
	 { 
	    System.out.println("Third main method"); 
	 } 
	// Main method
	 public static void main(String[] args) 
	 { 
	     System.out.println("main(String[] args)"); 
	     main(20); 
	 } 
	}