package com.trl._enum.methods.b.b3;

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
    RED,
    YELLOW;

    public void doSomething() {
        System.out.println("default action !!!");
    }
}
