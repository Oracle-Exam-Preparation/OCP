package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.variables._static.b.b1;

public class Example {
    public static void main(String[] args) {

        SomeClass someClass = new SomeClass() {
            {
                System.out.println(name);
                name = "new value !!!";
                System.out.println(name);
            }
        };
    }
}

class SomeClass {
    static String name = "Some Class !!!";
}