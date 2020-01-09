package com.trl.nestedClass.innerClass.localInnerClass._static.methods.a.a1;

public class Example {
}

class Outer {

    public void someMethod() {

        class LocalInnerClass {

            public void someMethod() {
            }

//            public static void someMethod_2 () { }                                            // Compilation ERROR !!!
        }
    }
}