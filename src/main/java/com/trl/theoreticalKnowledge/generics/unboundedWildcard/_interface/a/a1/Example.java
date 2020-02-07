package com.trl.theoreticalKnowledge.generics.unboundedWildcard._interface.a.a1;

public class Example {
}

//interface SomeInterface <?> {}                                                                // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}