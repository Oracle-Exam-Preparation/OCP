package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.constructors.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass anonymousClass_1 = new SomeClass() {
//            public SomeClass (String name) { }                                                // Compilation ERROR !!!
        };

    }
}

class SomeClass {

    public SomeClass() {
    }
}