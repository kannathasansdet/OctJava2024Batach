package com.basic.java.oops.inheritance;

public class Numbers {
    // Properties
    public int a;
    public int b;
    public int e;

    // Methods
    public void sum(){
      System.out.println(a+b);
  }

    public void sub(){
        System.out.println(a-b);
  }
    
    public int addition() {
    	
    	e= a+b;
    	System.out.println(e);
    	return e;
   	
    }
    public void mul() {
    	
        System.out.println(a*b);

    }

  public static void main (String[] args) {
    
        // Creating Instance of Class
        // Object
      Numbers obj=new Numbers();
      
      Numbers obj2=new Numbers();

        // Assigning Values to the Properties
       obj.a=1;
       obj.b=2;
       
       obj2.a=20;
       obj2.b=10;
    
        // Using the Methods
        obj.sum();
        obj.sub();
        obj.mul();
        obj.addition();
        obj2.sum();
        obj2.sub();
        obj2.mul();
  }
}