package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.initialization.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeInterface anonymousClass_1 = new SomeInterface() {
            @Override
            public void someMethod() {
                System.out.println("Some Interface !!!");
            }
        };

        SomeAbstractClass anonymousClass_2 = new SomeAbstractClass() {
            @Override
            public void someMethod() {
                System.out.println("Some Abstract Class !!!");
            }
        };

        SomeClass anonymousClass_3 = new SomeClass() {
            @Override
            public void someMethod() {
                System.out.println("Some Class !!!");
            }
        };

//    static SomeEnum anonymousClass_4 = new SomeEnum(){};                                      // Compilation ERROR !!!

        anonymousClass_1.someMethod();
        anonymousClass_2.someMethod();
        anonymousClass_3.someMethod();
    }
}

interface SomeInterface {
    void someMethod();
}

abstract class SomeAbstractClass {
    public abstract void someMethod();
}

class SomeClass {
    public void someMethod() {
    }
}

enum SomeEnum {
    WHITE, BLACK, RED;

    public void someMethod() {
    }
}