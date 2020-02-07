package com.trl.theoreticalKnowledge.generics.wildcardUpperBound._interface.a.a1;


public class Example {
}

//interface SomeInterface_1 <? extends Father> {}                                             // Compilation ERROR !!!

interface SomeInterface_2 <T extends Father> {}

//interface SomeInterface_2 <A extends Father & SomeClass> { }                                // Compilation ERROR !!! Multiple class inheritance not allowed.

interface SomeInterface_3 <A extends Father & SomeInterface> { }

interface SomeInterface_4 <A extends Father & SomeInterface & SomeInterface_2> { }            // Not compilation ERROR !!! Multiple interface inheritance allowed.


class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}

class SomeClass {}

interface SomeInterface {}