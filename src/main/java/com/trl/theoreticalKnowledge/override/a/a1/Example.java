package com.trl.theoreticalKnowledge.override.a.a1;

public class Example {
}

class Parent {
    public void someMethod() {}
}

class Parent_2 {
    public void someMethod() throws Exception {}
}

class Parent_3 {
    public void someMethod() throws RuntimeException {}
}

class Child_1 extends Parent {

    @Override
    public void someMethod() {}
}

class Child_2 extends Parent {

    // Not compilation ERROR !!! If "parent class" not throws exception, so "overrided method" from "child class" allowed throws "unchecked exception".
    // Not compilation ERROR !!! Is allow throws unchecked exception if parent not throws unchecked exception.
    @Override
    public void someMethod() throws RuntimeException {
        System.out.println("Child_2");
    }
}

class Child_3 extends Parent {

    @Override
    public final void someMethod() {}                                         // Not compilation ERROR !! Is allowed override method and make this method final.
}

class Child_4 extends Parent {

//    @Override
//    public void someMethod() throws Exception {}                            // Compilation ERROR !!! Parent not throws checked exception.
}

class Child_5 extends Parent {

    //    @Override                                                          // Compilation ERROR !!!  Is not overriding. Is overloading.
    public void someMethod(String value) {}
}

class Child_6 extends Parent {

    //    @Override                                                         // Compilation ERROR !!! Is not overriding. Is definition of other method whu name is "SomeMethod".
    public void SomeMethod() {}
}

class Child_7 extends Parent {

//    @Override                                                            // Compilation ERROR !! Is not allowed override method and make this method static.
//    public static void someMethod() {}
}

class Child_8 extends Parent {

//    @Override                                                            // Compilation ERROR !! Is not allowed override method and put this access modifier less that have parent class.
//    void someMethod() {}
}

class Child_9 extends Parent_2 {

    @Override
    public void someMethod() throws Exception { }
}

class Child_10 extends Parent_2 {

    // Not compilation ERROR !!! If "parent class" throws "checked exception" so "overrided method" from "child class" allowed throws "unchecked exception".
    @Override
    public void someMethod() throws RuntimeException { }
}

class Child_11 extends Parent_2 {

    // Not compilation ERROR !!! If "parent class" throws "checked exception" so "overrided method" from "child class" can be not throws "checked exception".
    @Override
    public void someMethod() { }
}

class Child_12 extends Parent_3 {

    @Override
    public void someMethod() throws RuntimeException { }
}

class Child_13 extends Parent_3 {

    // Compilation ERROR !!! If "parent class" throws "unchecked exception" so "overrided method" from "child class" not allowed throws "checked exception".
//    @Override
//    public void someMethod() throws Exception { }
}

class Child_14 extends Parent_3 {

    // Not compilation ERROR !!! If "parent class" throws "unchecked exception" so "overrided method" from "child class" can be not throws "unchecked exception".
    @Override
    public void someMethod() { }
}