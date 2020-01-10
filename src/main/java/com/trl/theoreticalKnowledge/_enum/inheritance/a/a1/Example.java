package com.trl.theoreticalKnowledge._enum.inheritance.a.a1;

public class Example {
    public static void main(String[] args) {
    }
}

enum Color {
    WHITE, BLACK, YELLOW, RED
}

//enum Color_2 extends Color{}                                                                  // Compilation ERROR !!!
//enum Color_3 implements Color{}                                                               // Compilation ERROR !!!

class SomeClass {
    public void someMethod() {
    }
}

//enum Color_4 extends SomeClass {}                                                             // Compilation ERROR !!!
//enum Color_5 Implements SomeClass {}                                                          // Compilation ERROR !!!

//class SomeClass_2 extends Color {}                                                            // Compilation ERROR !!!
//class SomeClass_3 implements Color {}                                                         // Compilation ERROR !!!

abstract class SomeAbstractClass {
    public abstract void someAbstractMethod();

    public void someNotAbstractMethod() {
    }
}

//enum Color_6 extends SomeAbstractClass {}                                                     // Compilation ERROR !!!
//enum Color_7 implements SomeClass {}                                                          // Compilation ERROR !!!

//abstract class SomeAbstractClass_2 extends Color {}                                           // Compilation ERROR !!!
//abstract class SomeAbstractClass_3 implements Color {}                                        // Compilation ERROR !!!

interface SomeInterface {
    void someMethod();
}

//enum Color_8 extends SomeInterface {}                                                         // Compilation ERROR !!!
enum Color_9 implements SomeInterface {                                                     // Not Compilation ERROR !!!
    ;

    @Override
    public void someMethod() {
    }
}

//interface SomeInterface_2 extends Color {}                                                    // Compilation ERROR !!!
//interface SomeInterface_3 implements Color {}                                                 // Compilation ERROR !!!