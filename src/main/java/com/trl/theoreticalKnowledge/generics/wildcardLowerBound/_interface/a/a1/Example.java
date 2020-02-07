package com.trl.theoreticalKnowledge.generics.wildcardLowerBound._interface.a.a1;

public class Example {
}

//interface SomeInterface <? super Father> {}                                                   // Compilation ERROR !!!

//interface SomeInterface <T super Father> {}                                                   // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}