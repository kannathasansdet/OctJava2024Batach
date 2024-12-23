package com.java.methods;

public class SubrationDemo {

	//no argument method
	
	
	public static void main(String[] args) {

		SubrationDemo subobj = new SubrationDemo();

		int d = subobj.sub(60, 90);
		
		System.out.println(d);
		
		SubrationDemo subobj1 = new SubrationDemo();
		
		int e =subobj1.sub(80, 40);
		
		System.out.println(e);

		

	}

	public int sub(int a, int b) {

		int c = a-b;
		
	   return c ;

	}	
}
