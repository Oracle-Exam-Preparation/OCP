package com.trl.theoreticalKnowledge.generics.wildcardUpperBound.abstractClass.a.a1;

public class Example {
}

//abstract class SomeAbstractClass_1 <? extends Father> {}                                        // Compilation ERROR !!!

//abstract class SomeAbstractClass_2 <? extends Father> {}                                        // Compilation ERROR !!!

abstract class SomeAbstractClass_3 <T extends Father> {}

//abstract class SomeAbstractClass_4 <A extends Father & SomeClass> { }                          // Compilation ERROR !!! Multiple class inheritance not allowed.

abstract class SomeAbstractClass_5 <A extends Father & SomeInterface> { }

abstract class SomeAbstractClass_6 <A extends Father & SomeInterface & SomeInterface_2> { }      // Not compilation ERROR !!! Multiple interface inheritance allowed.

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

interface SomeInterface_2 {}