package com.trl.theoreticalKnowledge.castingValues.c.c1;

public class Example {
    public static void main(String[] args) {

        Parent parentChild = new Child();
//        Child childChild = parentChild;                             // Compilation ERROR !!! Require explicit casting.
        Child childChild = (Child) parentChild;                       // Not Compilation ERROR !!! Explicit Casting.

        Parent parentParent = new Parent();
        Child childParent = (Child) parentParent;                    // Not Compilation ERROR !!! But an ClassCastException will be thrown.
    }
}

class Parent {}

class Child extends Parent {}