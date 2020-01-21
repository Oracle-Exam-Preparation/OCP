package com.trl.theoreticalKnowledge.inheritance.variable.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        Parent parent = new Parent();
//        out.println(parent.someValue_1);                                             // Compilation ERROR !!! Access Modifier is private.
        out.println(parent.someValue_2);                                               // Output: P
        out.println(parent.someValue_3);                                               // Output: P
        out.println(parent.someValue_4);                                               // Output: P
        out.println(parent.someValue_5);                                               // Output: P
        out.println(parent.someValue_6);                                               // Not ERROR !!! Compiler look for the type of reference.
        out.println(parent.someValue_7);                                               // Not ERROR !!! Compiler look for the type of reference.
        out.println();

        Child child = new Child();
//        out.println(child.someValue_1);                                             // Compilation ERROR !!! Access Modifier is private.
        out.println(child.someValue_2);                                               // Output: C
        out.println(child.someValue_3);                                               // Output: C
        out.println(child.someValue_4);                                               // Output: C
        out.println(child.someValue_5);                                               // Output: C
        out.println(child.someValue_6);                                               // Not ERROR !!! Compiler look for the type of reference.
        out.println(child.someValue_7);                                               // Not ERROR !!! Compiler look for the type of reference.
        out.println();

        Parent parent_child = new Child();
//        out.println(parent_child.someValue_1);                                      // Compilation ERROR !!! Access Modifier is private.
        out.println(parent_child.someValue_2);                                        // Output: P. Variables is not have overriding. Variables is not virtual.
        out.println(parent_child.someValue_3);                                        // Output: P. Variables is not have overriding. Variables is not virtual.
        out.println(parent_child.someValue_4);                                        // Output: P. Variables is not have overriding. Variables is not virtual.
        out.println(parent_child.someValue_5);                                        // Output: P. Variables is not have overriding. Variables is not virtual.
        out.println(parent_child.someValue_6);                                        // Not ERROR !!! Compiler look for the type of reference.
        out.println(parent_child.someValue_7);                                        // Not ERROR !!! Compiler look for the type of reference.
    }
}

class Parent {

    private String someValue_1 = "P";
    String someValue_2 = "P";
    protected String someValue_3 = "P";
    public String someValue_4 = "P";

    public final String someValue_5 = "P";
    public static String someValue_6 = "P";
    public static final String someValue_7 = "P";
}

class Child extends Parent {

    private String someValue_1 = "C";
    String someValue_2 = "C";
    protected String someValue_3 = "C";
    public String someValue_4 = "C";

    public final String someValue_5 = "C";
    public static String someValue_6 = "C";
    public static final String someValue_7 = "C";
}