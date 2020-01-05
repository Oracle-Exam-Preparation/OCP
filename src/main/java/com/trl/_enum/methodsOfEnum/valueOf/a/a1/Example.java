package com.trl._enum.methodsOfEnum.valueOf.a.a1;

public class Example {
    public static void main(String[] args) {

        System.out.println(Color.valueOf("WHITE"));
//        System.out.println(Color.valueOf("White"));                              // java.lang.IllegalArgumentException
//        System.out.println(Color.valueOf("white"));                              // java.lang.IllegalArgumentException
    }
}

enum Color {
    WHITE, BLACK, YELLOW, RED
}