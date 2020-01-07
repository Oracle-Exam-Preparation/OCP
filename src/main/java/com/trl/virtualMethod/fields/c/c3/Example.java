package com.trl.virtualMethod.fields.c.c3;

public class Example {
    public static void main(String[] args) {
        action(new Child());
    }

    public static void action(Parent parent) {
//        System.out.println(parent.name);                                                      // Compilation ERROR !!!
    }
}

class Parent {
}

class Child extends Parent {
    String name = "Child";
}