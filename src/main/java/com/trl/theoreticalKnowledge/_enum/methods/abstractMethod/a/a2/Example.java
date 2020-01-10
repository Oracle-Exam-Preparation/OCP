package com.trl.theoreticalKnowledge._enum.methods.abstractMethod.a.a2;

public class Example {
    public static void main(String[] args) {

        Color.WHITE.doSomething();
        Color.BLACK.doSomething();
        Color.RED.doSomething();
//        Color.YELLOW.doSomething();
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
    };
    // Compilation ERROR !!! This means that each and every enum value, required to implement this abstract method.
//    YELLOW;

    public abstract void doSomething();
}