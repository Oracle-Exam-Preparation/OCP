package com.trl.virtualMethod.b.b1;

public class Practice {
    public static void main(String... args) {

        Animal animal_1 = new Dog();
        animal_1.method_A();

        Animal animal_2 = new Cat();
        animal_2.method_A();

        Animal animal_3 = new Parrot();
        animal_3.method_A();
    }
}

abstract class Animal {
    public abstract void eat();

    public void method_A() {
        eat();
    }
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