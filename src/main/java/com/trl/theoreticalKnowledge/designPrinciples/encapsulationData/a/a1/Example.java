package com.trl.theoreticalKnowledge.designPrinciples.encapsulationData.a.a1;

public class Example {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "someName";
        animal.age = 10;
        animal.canSwim = true;
        animal.canRun = true;
    }
}

class Animal {

    public String name;
    public int age;
    public boolean canSwim;
    public Boolean canRun;
}
