package com.trl.theoreticalKnowledge.virtualMethod.fields.c.c2;

public class Example {
    public static void main(String[] args) {
        action(new Child());
    }

    public static void action(Parent parent) {
        System.out.println(parent.name);
    }
}

class Parent {
    String name = "Parent";
}

class Child extends Parent {
}