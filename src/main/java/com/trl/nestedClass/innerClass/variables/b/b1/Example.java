package com.trl.nestedClass.innerClass.variables.b.b1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InnerA innerA = outer.new InnerA();
        Outer.InnerA.InnerB innerB = innerA.new InnerB();
        innerB.someMethod();
    }
}

class Outer {
    private String name = "Outer";

    class InnerA {
        private String name = "InnerA";

        class InnerB {
            private String name = "InnerB";

            public void someMethod() {
                out.println(name);
                out.println(this.name);
                out.println(InnerB.this.name);
                out.println(InnerA.this.name);
                out.println(Outer.this.name);
            }
        }
    }
}