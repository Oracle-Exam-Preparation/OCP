package com.trl._enum.methods.a.a2;

public class Example {
    public static void main(String[] args) {
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
    // Not compilation ERROR !!! This means that each and every enum value, not required to implement this method.
    RED,
    YELLOW;

    public void doSomething() {
        System.out.println("default action !!!");
    }
}
