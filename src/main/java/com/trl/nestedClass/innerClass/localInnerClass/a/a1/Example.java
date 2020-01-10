package com.trl.nestedClass.innerClass.localInnerClass.a.a1;

public class Example {
}

class Outer {

    public Outer() {
        class LocalInnerClass {
        }
    }

    public void someMethod() {
        class LocalInnerClass {
        }
    }

    public static void someMethod_2() {
        /*
         * This is a difficult situation that I could not solve. This method is static. Because of this, this method
         * belongs to the "class type" and not "object type". Because of this, we can assume that, "LocalInnerClass"
         * which is defined in this method is an "LocalStaticNestedClass".
         * */
        class LocalInnerClass {
        }
    }

    {
        class LocalInnerClass {
        }
    }

    static {
        /*
         * This is a difficult situation that I could not solve. This area is static. Because of this, this method
         * belongs to the "class type" and not "object type". Because of this, we can assume that, "LocalInnerClass"
         * which is defined in this method is an "LocalStaticNestedClass".
         * */
        class LocalInnerClass {
        }
    }
}
