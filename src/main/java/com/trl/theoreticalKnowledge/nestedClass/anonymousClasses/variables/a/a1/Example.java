package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.variables.a.a1;

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
    String name = "Some Class !!!";
}