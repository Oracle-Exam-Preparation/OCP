package com.trl.instanceOf.a.a1;

public class Example {
    public static void main(String[] args) {

        Animal animal_cat = new Cat();
//        System.out.println(animal_cat instanceof Animal);
//        System.out.println(animal_cat instanceof Cat);
//        System.out.println(animal_cat instanceof Dog);

        Animal animal_dog = new Dog();
        Animal animal_null = null;
//        System.out.println("animal_dog instanceof Object = " + (animal_dog instanceof Object));
//        System.out.println("animal_null instanceof Object = " + (animal_null instanceof Object));
        // Attention!!!
//        System.out.println("animal_dog instanceof Object = " + animal_dog instanceof Object);
//        System.out.println("animal_null instanceof Object = " + animal_null instanceof Object);

        Dog dog = new Dog();
//        System.out.println(dog instanceof Cat);              // Compilation ERROR!!!
//        System.out.println(dog instanceof Animal_2);              // Compilation ERROR!!!
        System.out.println("dog instanceof IAnimal = " + (dog instanceof IAnimal));

    }
}

interface IAnimal {
}

class Animal {
}

class Animal_2 {
}

class Cat extends Animal {
}

class Dog extends Animal {
}