package com.basic.java.oops.polymorphisum;

public class MethodOverLoadingIftheOrderOfParametersIsChanged {

    public void get(String name,  int id)
   { 
System.out.println("Company Name :"+ name);
  System.out.println("Company Id :"+ id); 
    } 

    public void get(int id, String name)
   { 
System.out.println("Company Id :"+ id); 
  System.out.println("Company Name :"+ name);
    } 


    public static void main (String[] args) { 
  MethodOverLoadingIftheOrderOfParametersIsChanged obj = new MethodOverLoadingIftheOrderOfParametersIsChanged();
  obj.get("Cherry", 1);
  obj.get(2,"Jhon");
    } 
}


