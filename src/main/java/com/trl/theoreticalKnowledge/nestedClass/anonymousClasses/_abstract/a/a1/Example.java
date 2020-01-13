package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses._abstract.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeAbstractClass anonymousClass_1 = new SomeAbstractClass() {
            @Override
            public void someMethod() {
                System.out.println("AC1");
            }
        };

//        SomeAbstractClass anonymousClass_2 = new SomeAbstractClass() {};                  // Compilation ERROR !!!

        anonymousClass_1.someMethod();
        anonymousClass_1.someMethod_2();
    }
}

abstract class SomeAbstractClass {

    public abstract void someMethod();

    public void someMethod_2() {
        System.out.println("SAC2");
    }
}