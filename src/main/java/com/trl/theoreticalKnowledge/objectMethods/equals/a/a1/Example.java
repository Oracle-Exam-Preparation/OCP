package com.trl.theoreticalKnowledge.objectMethods.equals.a.a1;

public class Example {
    public static void main(String[] args) {

        Parent parent_parent = new Parent();
        Parent parent_child = new Child();

        System.out.println(parent_parent instanceof Parent);                                                     // true
        System.out.println(parent_child instanceof Parent);                                                      // true

        System.out.println();
        System.out.println(parent_parent.getClass() == Parent.class);                                            // true
        System.out.println(parent_child.getClass() == Parent.class);                                            // false

        System.out.println();
        System.out.println(parent_parent.getClass());                                                          // Parent
        System.out.println(parent_child.getClass());                                                            // Child
    }
}

class Parent {}

class Child extends Parent {}