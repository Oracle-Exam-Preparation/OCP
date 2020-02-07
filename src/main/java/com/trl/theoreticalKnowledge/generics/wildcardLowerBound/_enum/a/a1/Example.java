package com.trl.theoreticalKnowledge.generics.wildcardLowerBound._enum.a.a1;

public class Example {
}

//enum  SomeEnum <? super Father> {}                                                            // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum <T super Father> {}                                                            // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}