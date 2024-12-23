package com.accessspecifier;

//When no access modifier is specified, it is known as the default access modifier. It allows access to the members of a class within the same package only.


class DefaultExample {
    int data = 10; // default access modifier

    void display() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println(obj.data); // Accessible
        obj.display(); // Accessible
    }
}