package com.trl.theoreticalKnowledge.generics.unboundedWildcard.abstractClass.a.a1;

public class Example {
}

//abstract class SomeAbstractClass <?> {}                                                       // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}