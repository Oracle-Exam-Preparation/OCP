package com.trl.theoreticalKnowledge.nestedClass.innerClass.localInnerClass.variables.localVariables.a.a1;

public class Example {
}

class Outer {

    public void someMethod() {

        String v;

//        public String v_1 = "";             // Compilation ERROR !!! Local variable can't have access modifier public.
//        protected String v_2 = "";       // Compilation ERROR !!! Local variable can't have access modifier protected.
        String v_3 = "";
//        private String v_4 = "";           // Compilation ERROR !!! Local variable can't have access modifier private.


//        static String v_5 = "";                               // Compilation ERROR !!! Local variable can't be static.
        final String v_6 = "";
//        static final String v_7 = "";                         // Compilation ERROR !!! Local variable can't be static.

        class LocalInnerClass {
            {
                String v_8 = "";
//              v_8 = v;                                        // Compilatio ERROR !!! Might not have been initialized.
//                v_8 = v_1;
//                v_8 = v_2;
                v_8 = v_3;
//                v_8 = v_4;
//                v_8 = v_5;
                v_8 = v_6;
//                v_8 = v_7;
            }
        }
    }
}