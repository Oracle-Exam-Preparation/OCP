package com.trl.theoreticalKnowledge._enum.semicolon.b.b1;

public class Example {
}

enum SomeEnum {}

//enum SomeEnum_2 {                                                                             // Compilation ERROR !!!
//    public void someMethod () {}
//}

/*
 * If you create a "Enum" with no values but with a method, then you definitely need to put semicolon.
 *
 * "Enum" without a value has no logical meaning. This example does not think that somewhere can be used,
 * but I would like to know it.
 * In this case, it is better to use a class.
 * */
enum SomeEnum_3 {                                                                           // Not Compilation ERROR !!!
    ;

    public void someMethod() {
    }
}