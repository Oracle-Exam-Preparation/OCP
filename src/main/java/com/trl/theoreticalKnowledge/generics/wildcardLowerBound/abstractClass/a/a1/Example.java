package com.trl.theoreticalKnowledge.generics.wildcardLowerBound.abstractClass.a.a1;

public class Example {
}

//abstract class SomeAbstractClass <? super Father> {}                                          // Compilation ERROR !!!

//abstract class SomeAbstractClass <T super Father> {}                                          // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}