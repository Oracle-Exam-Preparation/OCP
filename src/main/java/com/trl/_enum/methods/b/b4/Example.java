package com.trl._enum.methods.b.b4;

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

//    public abstract void doSomething();
}
