package com.trl.theoreticalKnowledge.virtualMethod.a.a1;

public class Example {
    public static void main(String[] args) {

        Animal animal_1 = new Dog();
        animal_1.eat();

        Animal animal_2 = new Cat();
        animal_2.eat();

        Animal animal_3 = new Parrot();
        animal_3.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat() !!!");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eat() !!!");
    }
}

class Parrot extends Animal {
    public void eat() {
        System.out.println("Parrot eat() !!!");
    }
}