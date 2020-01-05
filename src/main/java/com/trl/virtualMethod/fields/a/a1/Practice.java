package com.trl.virtualMethod.fields.a.a1;

public class Practice {
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
    private String name = "Animal";

    public abstract void eat();
}

class Dog extends Animal {
    private String name = "Dog";

    public void eat() {
        System.out.println(name + " eat() !!!");
    }
}

class Cat extends Animal {
    private String name = "Cat";

    public void eat() {
        System.out.println(name + " eat() !!!");
    }
}

class Parrot extends Animal {
    private String name = "Parrot";

    public void eat() {
        System.out.println(name + " eat() !!!");
    }
}
