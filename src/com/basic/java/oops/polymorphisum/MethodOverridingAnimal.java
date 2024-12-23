package com.basic.java.oops.polymorphisum;

public class MethodOverridingAnimal {

	public void eat()
    {
        System.out.println("Eat all eatables");
    }
}

class Dog extends MethodOverridingAnimal
{
    public void eat()   //eat() method overridden by Dog class.
    {
        System.out.println("Dog like to eat meat");
    }}
    
    class cat extends MethodOverridingAnimal
    {
        public void eat()   //eat() method overridden by Dog class.
        {
            System.out.println("cat like to drink milk");
        }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        MethodOverridingAnimal methodOverridingAnimal = new MethodOverridingAnimal();
        methodOverridingAnimal.eat();  
        cat c = new cat(); 
        c.eat();
    }
}