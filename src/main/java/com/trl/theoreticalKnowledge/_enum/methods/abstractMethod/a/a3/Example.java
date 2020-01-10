package com.trl.theoreticalKnowledge._enum.methods.abstractMethod.a.a3;

public class Example {
    public static void main(String[] args) {

//        Color.WHITE.doSomething();              // Compilation ERROR !!! Cannot resolve method 'doSomething' in 'Color'.
//        Color.BLACK.doSomething();              // Compilation ERROR !!! Cannot resolve method 'doSomething' in 'Color'.
//        Color.RED.doSomething();                // Compilation ERROR !!! Cannot resolve method 'doSomething' in 'Color'.
//        Color.YELLOW.doSomething();             // Compilation ERROR !!! Cannot resolve method 'doSomething' in 'Color'.
    }
}

enum Color {

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

    // Is mandatory definition of this method if you want to use method "doSomething()".
//    public abstract void doSomething();
}
