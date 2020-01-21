package com.trl.theoreticalKnowledge.instanceOf.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        Birds birdsNull = null;
        out.println(birdsNull instanceof Object);                                                      // Output: false.
        out.println(birdsNull instanceof Forest);                                                      // Output: false.
        out.println(birdsNull instanceof Animal);                                                      // Output: false.
        out.println(birdsNull instanceof Birds);                                                       // Output: false.
        out.println(birdsNull instanceof Crow);                                                        // Output: false.
        out.println(birdsNull instanceof Parrot);                                                      // Output: false.
//        out.println(birdsNull instanceof Fish);                                               // Compilation ERROR !!!
        out.println();

        Birds birds = new Birds() {
        };
        out.println(birds instanceof Object);                                                           // Output: true.
        out.println(birds instanceof Forest);                                                          // Output: false.
        out.println(birds instanceof Animal);                                                           // Output: true.
        out.println(birds instanceof Birds);                                                            // Output: true.
        out.println(birds instanceof Crow);                                                            // Output: false.
        out.println(birds instanceof Parrot);                                                          // Output: false.
//        out.println(birds instanceof Fish);                                                   // Compilation ERROR !!!
        out.println();

        Birds crow = new Crow();
        out.println(crow instanceof Object);                                                            // Output: true.
        out.println(crow instanceof Forest);                                                           // Output: false.
        out.println(crow instanceof Animal);                                                            // Output: true.
        out.println(crow instanceof Birds);                                                             // Output: true.
        out.println(crow instanceof Crow);                                                              // Output: true.
        out.println(crow instanceof Parrot);                                                           // Output: false.
//        out.println(birds instanceof Fish);                                                   // Compilation ERROR !!!
        out.println();

        Crow crow1 = new Crow();
        out.println(crow1 instanceof Object);                                                           // Output: true.
        out.println(crow1 instanceof Forest);                                                          // Output: false.
        out.println(crow1 instanceof Animal);                                                           // Output: true.
        out.println(crow1 instanceof Birds);                                                            // Output: true.
        out.println(crow1 instanceof Crow);                                                             // Output: true.
//        out.println(crow1 instanceof Parrot);                                                 // Compilation ERROR !!!
//        out.println(birds instanceof Fish);                                                   // Compilation ERROR !!!
        out.println();

        // Attention Concatenation !!!
        out.println("crow1 instanceof Object = " + crow1 instanceof Object);                            // Output: true.
        out.println("birds instanceof Object = " + birds instanceof Object);                            // Output: true.
        out.println("crow1 instanceof Object = " + (crow1 instanceof Object));                          // Output: crow1 instanceof Object = true.
        out.println("birds instanceof Object = " + (birds instanceof Object));                          // Output: firds instanceof Object = true.

    }
}

interface Forest {
}

interface Animal {
}

abstract class Birds implements Animal {
}

abstract class Fish implements Animal {
}

class Crow extends Birds {
}

class Parrot extends Birds {
}