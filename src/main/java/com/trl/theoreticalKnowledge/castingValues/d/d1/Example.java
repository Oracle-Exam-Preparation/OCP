package com.trl.theoreticalKnowledge.castingValues.d.d1;

public class Example {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
//        Forest forest_1 = dog;                                                                // Compilation ERROR !!!
//        Forest forest_2 = (Forest) dog;                                                       // Compilation ERROR !!!

        AppleTree appleTree = new AppleTree();
        Forest forest = appleTree;
//        Animal animal_1 = appleTree;                                                          // Compilation ERROR !!!
//        Animal animal_2 = (Animal) appleTree;                                                 // Compilation ERROR !!!
    }
}

class Animal {}

class Dog extends Animal {}

class Forest {}

class AppleTree extends Forest {}