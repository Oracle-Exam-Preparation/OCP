package com.trl.theoreticalKnowledge.inheritance._interface.variables.accessModifier.a.a1;

public class Example {
}

interface SomeInterface {

//    private String someValue_1 = "";                                                     // Compilation ERROR !!! Interface cannot have private variable.
    String someValue_2 = "";                                                                // Not compilation ERROR !!! This variable have public access modifier. Interface variables by default has public access modifier.
//    protected String someValue_4 = "";                                                   // Compilation ERROR !!! Interface cannot have protected variable.
    public String someValue_5 = "";                                                        //  Interface variables by default has public access modifier. Is not necessary define access modifier.
}