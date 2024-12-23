package com.basic.java.Exceptions;


class math{
	
public void div() throws ArithmeticException {
		
		int a = 10/0;
		
	}
}
public class ExceptionOnArrayIndexOutOfBound {

    public static void main(String[] args) { 
    	
    	math mat = new math();
    	try {
        	mat.div();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	

    }
}
    