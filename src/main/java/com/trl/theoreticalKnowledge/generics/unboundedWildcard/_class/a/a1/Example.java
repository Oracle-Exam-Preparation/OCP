package com.trl.theoreticalKnowledge.generics.unboundedWildcard._class.a.a1;

public class Example {
}

//class SomeClass <?> {}                                                                        // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}