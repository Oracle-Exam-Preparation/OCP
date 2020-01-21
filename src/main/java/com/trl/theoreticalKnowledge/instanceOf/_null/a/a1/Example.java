package com.trl.theoreticalKnowledge.instanceOf._null.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        Birds birds = null;
        out.println(null instanceof Animal);
        out.println(null instanceof Object);
//        out.println(birds instanceof null);                                                   // Compilation ERROR !!!
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