package com.trl._enum.methodsOfEnum.values.a.a1;

public class Example {
    public static void main(String[] args) {

        System.out.println();
        for (Color color : Color.values()) {
            System.out.println(color.name() + " " + color.ordinal());
        }
    }
}

enum Color {
    WHITE, BLACK, YELLOW, RED
}