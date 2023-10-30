package org.example;

interface Animal {
    void bark();
}

// Implement the Animal interface in the Dog class
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        dog.bark();
    }
}