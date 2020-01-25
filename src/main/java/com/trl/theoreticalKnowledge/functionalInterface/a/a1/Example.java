package com.trl.theoreticalKnowledge.functionalInterface.a.a1;

public class Example {
}

@FunctionalInterface
interface SomeFunctionalInterface_1 {

    void someMethod ();
}

@FunctionalInterface
interface SomeFunctionalInterface_2 extends SomeFunctionalInterface_1 {}

@FunctionalInterface
interface SomeFunctionInterface_3 extends SomeFunctionalInterface_1 {
    void someMethod();
}

@FunctionalInterface
interface SomeFunctionalInterface_4 extends SomeFunctionalInterface_1 {
    default void someDefaultMethod() {}
    static void someStaticMethod() {}
}

@FunctionalInterface
interface SomeFunctionalInterface_5 {
    String SOMEVALUE_1 = "";
    String SOMEVALUE_2 = "";
    void someMethod ();
}

// Compilation ERROR !!! "Functional Interface" must have one abstract method.
//@FunctionalInterface
//interface SomeFunctionalInterface_6 {
//}

// Compilation ERROR !!! "Functional Interface" must have one abstract method. But this "Functionl Interface" have two
// "Abstract Methods". One "Abstract Method" is someMethod_1() and another is someMethod().
//@FunctionalInterface
//interface SomeFunctionInterface_7 extends SomeFunctionalInterface_1 {
//    void someMethod_1();
//}
