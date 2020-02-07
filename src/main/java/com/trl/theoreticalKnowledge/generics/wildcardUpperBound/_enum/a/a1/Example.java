package com.trl.theoreticalKnowledge.generics.wildcardUpperBound._enum.a.a1;

public class Example {
}

//enum  SomeEnum <? extends Father> {}                                                          // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_1 <A extends Father> { }                                                       // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_2 <A extends SomeEnum> { }                                                     // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_3 <A> { }                                                                      // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_3 <?> { }                                                                      // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//class SomeClass_2 <A extends Father & SomeClass> { }                                          // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_3 <A extends Father & SomeInterface> { }                                       // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_4 <A extends Father & SomeInterface & SomeInterface_2> { }                     // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

//enum  SomeEnum_5 <A extends SomeInterface & SomeInterface_2> { }                              // Compilation ERROR !!! Java doesn't allow generic types on enum constants.

enum SomeEnum_6 implements SomeInterface_3 <Father> {}

enum SomeEnum_7 implements SomeInterface_3 {}

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

interface SomeInterface_3 <T extends Father> {
}

class SomeClass {}

enum  SomeEnum {}