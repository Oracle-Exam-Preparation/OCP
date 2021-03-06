package com.trl.theoreticalKnowledge._enum.methodsOfEnum.valueOf.a.a1;

public class Example {
    public static void main(String[] args) {

        System.out.println(Color.valueOf("WHITE"));

        // Carefully with case-sensitive. Due to "White", but should be "WHITE".This exception will be thrown "java.lang.IllegalArgumentException"
//        System.out.println(Color.valueOf("White"));

        // Carefully with case-sensitive. Due to "white", but should be "WHITE". This exception will be thrown "java.lang.IllegalArgumentException"
//        System.out.println(Color.valueOf("white"));
    }
}

enum Color {
    WHITE, BLACK, YELLOW, RED
}