package com.trl.theoreticalKnowledge._enum.semicolon.a.a1;

public class Example {
    public static void main(String[] args) {

        Color s = Color.YELLOW;
        System.out.println(Color.YELLOW);
        System.out.println(s == Color.YELLOW);
    }
}

enum Color {
    WHITE, BLACK, YELLOW, RED
}

enum Color_2 {
    WHITE, BLACK, YELLOW, RED;
}