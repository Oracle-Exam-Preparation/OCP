package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.methods._static.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass anonymousClass_1 = new SomeClass() {
        };

        SomeClass anonymousClass_2 = new SomeClass() {
//        @Override                                                                             // Compilation ERROR !!!
//        public void someMethod() {
//            System.out.println("Some Class !!!");
//        }
        };

        anonymousClass_1.someMethod();
        anonymousClass_2.someMethod();
    }
}

class SomeClass {
    public static void someMethod() {
        System.out.println("FM");
    }
}