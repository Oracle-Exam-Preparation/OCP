package com.trl.theoreticalKnowledge._enum.methodsOfEnum.ordinal.a.a1;

public class Example {
    public static void main(String[] args) {

        System.out.println(Color.WHITE.ordinal());
        System.out.println(Color.BLACK.ordinal());
        System.out.println(Color.YELLOW.ordinal());
        System.out.println(Color.RED.ordinal());

        System.out.println();
        System.out.println(Color.valueOf("WHITE").ordinal());
    }
}

enum Color {
    WHITE, BLACK, YELLOW, RED
}