package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.variables._final.b.b1;

public class Example {
    public static void main(String[] args) {

        SomeClass someClass = new SomeClass() {
            {
                System.out.println(name);
//                name = "new value !!!";                                                       // Compilation ERROR !!!
            }
        };
    }
}

class SomeClass {
    final String name = "Some Class !!!";
}