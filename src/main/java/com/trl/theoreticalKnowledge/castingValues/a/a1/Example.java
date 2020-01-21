package com.trl.theoreticalKnowledge.castingValues.a.a1;

public class Example {
    public static void main(String[] args) {
        Animal animal = new Bird();
        // Runtime Exception while be throw. While be throws a ClassCastException an Runtime.
        Amphibia amphibia = (Amphibia) animal;
    }
}

class Animal {
    public void eat () {
        System.out.println("Animal eating !!!");
    }
}

class Bird extends Animal {
    public void eat () {
        System.out.println("Bird eating !!!");
    }
}

class Amphibia extends Animal{
    public void eat () {
        System.out.println("Amphibia eating !!!");
    }
}