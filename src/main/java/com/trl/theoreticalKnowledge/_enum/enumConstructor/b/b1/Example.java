package com.trl.theoreticalKnowledge._enum.enumConstructor.b.b1;

public class Example {
    public static void main(String[] args) {

        Color firstCall = Color.WHITE;

        System.out.println("========================");
        Color secondCall = Color.WHITE;
    }
}

enum Color {

    WHITE,
    BLACK,
    RED,
    YELLOW;

    private String hexColorCode;

    private Color() {
        System.out.println("Initialization !!!");
    }
}
