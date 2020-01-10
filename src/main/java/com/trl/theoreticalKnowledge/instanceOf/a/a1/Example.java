package com.trl.theoreticalKnowledge.instanceOf.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        Birds birdsNull = null;
        out.println(birdsNull instanceof Object);
        out.println(birdsNull instanceof Forest);
        out.println(birdsNull instanceof Animal);
        out.println(birdsNull instanceof Birds);
        out.println(birdsNull instanceof Crow);
        out.println(birdsNull instanceof Parrot);
//        out.println(birdsNull instanceof Fish);                                               // Compilation ERROR !!!
        out.println();

        Birds birds = new Birds() {
        };
        out.println(birds instanceof Object);
        out.println(birds instanceof Forest);
        out.println(birds instanceof Animal);
        out.println(birds instanceof Birds);
        out.println(birds instanceof Crow);
        out.println(birds instanceof Parrot);
//        out.println(birds instanceof Fish);                                                   // Compilation ERROR !!!
        out.println();

        Birds crow = new Crow();
        out.println(crow instanceof Object);
        out.println(crow instanceof Forest);
        out.println(crow instanceof Animal);
        out.println(crow instanceof Birds);
        out.println(crow instanceof Crow);
        out.println(crow instanceof Parrot);
//        out.println(birds instanceof Fish);                                                   // Compilation ERROR !!!
        out.println();

        Crow crow1 = new Crow();
        out.println(crow1 instanceof Object);
        out.println(crow1 instanceof Forest);
        out.println(crow1 instanceof Animal);
        out.println(crow1 instanceof Birds);
        out.println(crow1 instanceof Crow);
//        out.println(crow1 instanceof Parrot);                                                 // Compilation ERROR !!!
//        out.println(birds instanceof Fish);                                                   // Compilation ERROR !!!
        out.println();

        // Attention Concatenation !!!
        out.println("crow1 instanceof Object = " + crow1 instanceof Object);
        out.println("birds instanceof Object = " + birds instanceof Object);
        out.println("crow1 instanceof Object = " + (crow1 instanceof Object));
        out.println("birds instanceof Object = " + (birds instanceof Object));

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