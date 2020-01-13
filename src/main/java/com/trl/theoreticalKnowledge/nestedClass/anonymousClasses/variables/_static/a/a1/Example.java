package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.variables._static.a.a1;

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
    static String name = "Some Class !!!";
}