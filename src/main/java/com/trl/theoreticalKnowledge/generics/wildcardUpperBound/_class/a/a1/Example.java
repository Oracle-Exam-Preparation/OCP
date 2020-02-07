package com.trl.theoreticalKnowledge.generics.wildcardUpperBound._class.a.a1;

public class Example {
}

//class SomeClass <? extends Father> { }                                                        // Compilation ERROR !!!

class SomeClass_1 <A extends Father> { }

//class SomeClass_2 <A extends Father & SomeClass> { }                                          // Compilation ERROR !!! Multiple class inheritance not allowed.

class SomeClass_3 <A extends Father & SomeInterface> { }

class SomeClass_4 <A extends Father & SomeInterface & SomeInterface_2> { }                      // Not compilation ERROR !!! Multiple interface inheritance allowed.

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}

interface SomeInterface {
}

interface SomeInterface_2 {
}

class SomeClass {}