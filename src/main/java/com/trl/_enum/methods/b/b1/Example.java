package com.trl._enum.methods.b.b1;

public class Example {
    public static void main(String[] args) {

        Color.WHITE.doSomething();
        Color.BLACK.doSomething();
        Color.RED.doSomething();
        Color.YELLOW.doSomething();
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

    public abstract void doSomething();
}
