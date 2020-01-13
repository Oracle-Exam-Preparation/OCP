package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.variables.accessModifier.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass someClass = new SomeClass() {
            {
                System.out.println(name_1);
                System.out.println(name_2);
                System.out.println(name_3);
//                System.out.println(name_4);                                                   // Compilation ERROR !!!
            }
        };
    }
}

class SomeClass {

    public String name_1 = "name 1";
    protected String name_2 = "name 2";
    String name_3 = "name 3";
    private String name_4 = "name 4";
}