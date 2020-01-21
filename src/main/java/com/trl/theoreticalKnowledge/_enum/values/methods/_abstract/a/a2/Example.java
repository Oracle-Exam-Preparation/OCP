package com.trl.theoreticalKnowledge._enum.values.methods._abstract.a.a2;

public class Example {
}

enum Color_1 {

    WHITE {
        public void doSomething() {
            System.out.println("WHITE");
        }
    },
    BLACK {
        public void doSomething() {
            System.out.println("BLACK");
        }
    },
    RED {
        public void doSomething() {
            System.out.println("RED");
        }
    },
    YELLOW {
        public void doSomething() {
            System.out.println("YELLOW");
        }
    };

    public abstract void doSomething();
}

enum Color_2 {

    WHITE {
        public void doSomething() {
            System.out.println("WHITE");
        }
    },
    BLACK {
        public void doSomething() {
            System.out.println("BLACK");
        }
    },
    RED {
        public void doSomething() {
            System.out.println("RED");
        }
    };
    // Compilation ERROR !!! 'Color' is abstract; cannot be instantiated.
    // Compilation ERROR !!! This means that each and every enum value, required to implement this abstract method.
//    YELLOW;

    public abstract void doSomething();
}

// Compilation ERROR !!! Class 'Color_3' must either be declared abstract or implement abstract method 'doSomething()' in 'Color_3'.
// Enum cannot be abstract.

//enum Color_3 {
//
//    WHITE, BLACK, RED, YELLOW;
//
//    public abstract void doSomething();
//}
