package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses._interface.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeInterface anonymousClass_1 = new SomeInterface() {
            @Override
            public void someMethod() {
                System.out.println("AC1");
            }
        };

//        SomeInterface anonymousClass_2 = new SomeInterface() {};                              // Compilation ERROR !!!

        anonymousClass_1.someMethod();
        anonymousClass_1.someMethod_2();
        SomeInterface.someMethod_3();
    }
}

interface SomeInterface {

    void someMethod();

    default void someMethod_2() {
        System.out.println("SAC2");
    }

    static void someMethod_3() {
        System.out.println("SAC3");
    }
}