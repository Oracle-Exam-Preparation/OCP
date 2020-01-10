package com.trl.theoreticalKnowledge.nestedClass.innerClass.localInnerClass.methods.a.a1;

public class Example {
}

class Outer {

    public void someMethod() {

        class LocalInnerClass {
            {
                someMethod();
                someMethod_1();
                someMethod_2();
                someMethod_3();
                someMethod_4();
                someMethod_5();
                someMethod_6();
                someMethod_7();
            }
        }
    }

    public void someMethod_1() {
    }

    protected void someMethod_2() {
    }

    void someMethod_3() {
    }

    private void someMethod_4() {
    }

    public static void someMethod_5() {
    }

    public final void someMethod_6() {
    }

    public static final void someMethod_7() {
    }
}