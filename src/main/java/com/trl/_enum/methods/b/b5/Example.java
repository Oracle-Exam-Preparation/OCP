package com.trl._enum.methods.b.b5;

public class Example {
    public static void main(String[] args) {

        Color.WHITE.doSomething();
        Color.BLACK.doSomething();
        Color.RED.doSomething();
        Color.YELLOW.doSomething();

        Color.WHITE.doSomething_2();
        Color.BLACK.doSomething_2();
        Color.RED.doSomething_2();
        Color.YELLOW.doSomething_2();
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

        public void doSomething_2() {
            System.out.println("BLACK_2");
        }
    },
    RED {
        public void doSomething() {
            System.out.println("RED");
        }

        public void doSomething_2() {
            System.out.println("RED_2");
        }
    },
    YELLOW {
        public void doSomething() {
            System.out.println("YELLOW");
        }
    };

    public void doSomething() {
        System.out.println("default value");
    }

    public void doSomething_2() {
        System.out.println("default value 2");
    }
}
