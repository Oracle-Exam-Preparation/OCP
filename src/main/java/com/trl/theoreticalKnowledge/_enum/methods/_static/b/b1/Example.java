package com.trl.theoreticalKnowledge._enum.methods._static.b.b1;

public class Example {
}

enum Color {

    // Inner classes cannot have static declarations
//    WHITE {
//        public static void doSomething() {
//            System.out.println("WHITE");
//        }
//    },
//    BLACK {
//        public static doSomething() {
//            System.out.println("BLACK");
//        }
//    },

    // Instance method 'doSomething()' in 'Anonymous class derived from 'Color' cannot override static method 'doSomething()' in 'Color'
//    RED {
//        public void doSomething() {
//            System.out.println("RED");
//        }
//    },
//    YELLOW {
//        public void doSomething() {
//            System.out.println("YELLOW");
//        }
//    }
    ;

    public static void doSomething() {
        System.out.println("default value");
    }
}
