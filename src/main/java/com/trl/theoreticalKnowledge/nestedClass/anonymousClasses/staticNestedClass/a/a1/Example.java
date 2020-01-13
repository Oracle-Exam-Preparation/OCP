package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.staticNestedClass.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass.Outer anonymousClass_1 = new SomeClass.Outer() {
            @Override
            public void someMethod() {
                System.out.println("AC1");
            }
        };

        anonymousClass_1.someMethod();
    }
}

class SomeClass {

    static class Outer {
        public void someMethod() {
            System.out.println("O");
        }
    }
}