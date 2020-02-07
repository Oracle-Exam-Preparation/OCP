package com.trl.theoreticalKnowledge.generics.wildcardLowerBound._class.a.a1;

public class Example {
}

//class SomeClass_1 <? super Father> {}                                                           // Compilation ERROR !!!

//class SomeClass_2 <A super Father> {}                                                           // Compilation ERROR !!!

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}