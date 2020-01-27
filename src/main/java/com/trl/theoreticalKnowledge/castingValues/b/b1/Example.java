package com.trl.theoreticalKnowledge.castingValues.b.b1;

public class Example {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = child;                                                          // Not require explicit casting.
        Parent parent_2 = (Child) child;                                                  // Redundant explicit casting.
    }
}

class Parent {}

class Child extends Parent {}