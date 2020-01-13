package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.variables._final.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass someClass = new SomeClass() {
            {
                System.out.println(name);
            }
        };
    }
}

class SomeClass {
    final String name = "Some Class !!!";
}