package com.trl.theoreticalKnowledge.inheritance._class.constructor.accessModifier.a.a1;

public class Example {
}

class Parent {

    private Parent() {
    }
}

//class Child_1  extends Parent{ }                                                              // Compilation ERROR !!!

//class Child_2  extends Parent{
//    public Child_2 (){}                                                                        // Compilatio ERROR !!!
//}

//class Child_3  extends Parent{
//    private Child_3 (){}                                                                        // Compilatio ERROR !!!
//}

//class Child_4  extends Parent{
//
//    private String name;
//
//    public Child_4 (String name){                                                              // Compilatio ERROR !!!
//        this.name = name;
//    }
//}