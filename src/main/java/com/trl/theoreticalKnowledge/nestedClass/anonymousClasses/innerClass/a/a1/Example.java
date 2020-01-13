package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.innerClass.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass.Outer anonymousClass_1 = new SomeClass().new Outer() {
            @Override
            public void someMethod() {
                System.out.println("AC1");
            }
        };

        anonymousClass_1.someMethod();
    }
}

class SomeClass {

    class Outer {
        public void someMethod() {
            System.out.println("O");
        }
    }
}