package com.trl.theoreticalKnowledge.nestedClass.innerClass.in_the_method.a1;

public class Example {

    public Object method_1() {

        class NestedClass {
        }

        return new NestedClass();
    }

//    public NestedClass method_2() {                                       // Compilation ERROR !!!  Visibility zone.
//
//        class NestedClass { }
//
//        return new NestedClass();
//    }

}
