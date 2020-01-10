package com.trl.theoreticalKnowledge.nestedClass.innerClass.localInnerClass.variables.a.a1;

public class Example {
}

class Outer {

    public String v;

    public String v_1 = "";
    protected String v_2 = "";
    String v_3 = "";
    private String v_4 = "";

    public static String v_5 = "";
    public final String v_6 = "";
    public static final String v_7 = "";

    public void someMethod() {

        class LocalInnerClass {
            {
                String v_8 = v;
                v_8 = v_1;
                v_8 = v_2;
                v_8 = v_3;
                v_8 = v_4;
                v_8 = v_5;
                v_8 = v_6;
                v_8 = v_7;
            }
        }
    }
}