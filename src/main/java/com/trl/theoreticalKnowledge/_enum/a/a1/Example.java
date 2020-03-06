package com.trl.theoreticalKnowledge._enum.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(Color.WHITE);
        out.println(Color.WHITE.name());
        out.println(Color.WHITE.toString());
    }
}



enum Color {
    WHITE, RED, BLACK, YELLOW;
}
