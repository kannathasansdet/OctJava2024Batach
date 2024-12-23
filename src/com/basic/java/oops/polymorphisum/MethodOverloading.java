package com.basic.java.oops.polymorphisum;

public class MethodOverloading {

	void sum (int a, int b)
	  {
	    System.out.println("sum is"+(a+b)) ;
	  }
	  void sum (float a, float b)
	  {
	    System.out.println("sum is"+(a+b));
	  }
	  public static void main (String[] args)
	  {
		MethodOverloading  cal = new MethodOverloading();
	    cal.sum (8,5);      //sum(int a, int b) is method is called.
	    cal.sum (4.6f, 3.8f); //sum(float a, float b) is called.
	  }
	}
