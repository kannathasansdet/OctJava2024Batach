package com.basic.java.oops.polymorphisum;

public class MethodOverloadingWithDifferenttype {

	void sum(int l,long b)
	 {
	  System.out.println("Sum is"+(l+b)) ;
	 }
	 void sum(int l, int b, int h)
	 {
	  System.out.println("Sum is"+(l+b+h));
	 }
	 public static void main (String[] args)
	 {
		 MethodOverloadingWithDifferenttype  ar = new MethodOverloadingWithDifferenttype();
	  ar.sum(8,5);
	 }
	}

