package com.trl.theoreticalKnowledge.generics.unboundedWildcard._enum.a.a1;

public class Example {
}

//enum  SomeEnum <?> {}                                                                        // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}