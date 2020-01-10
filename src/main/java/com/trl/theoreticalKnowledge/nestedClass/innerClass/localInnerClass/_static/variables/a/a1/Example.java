package com.trl.theoreticalKnowledge.nestedClass.innerClass.localInnerClass._static.variables.a.a1;

public class Example {
}

class Outer {

    public void someMethod() {

        class LocalInnerClass {

            private String v1 = "";
//            private static String v_2 = "";                                                   // Compilation ERROR !!!
        }
    }
}