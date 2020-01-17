package com.trl.theoreticalKnowledge.nestedClass.innerClass.methods._static.a.a1;

public class Example {
}

class Outer {

    public static void someMethod_1() {
    }

    public void someMethod_2() {
    }

    class Inner {
        {
            someMethod_1();
            someMethod_2();
        }
    }
}