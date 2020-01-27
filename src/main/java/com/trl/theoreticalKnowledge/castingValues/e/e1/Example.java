package com.trl.theoreticalKnowledge.castingValues.e.e1;

public class Example {
    public static void main(String[] args) {

        Parent parentParent = new Parent();
        Child child = (Child) parentParent;                    // Not Compilation ERROR !!! But an ClassCastException will be thrown at runtime.
    }
}

class Parent {}

class Child extends Parent {}