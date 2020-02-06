package com.trl.theoreticalKnowledge._enum.initialization.a.a1;

public class Example {
     public static void main(String[] args) {

          Color white = Color.WHITE;

          Object object = Color.WHITE;

          Class<? extends Color> white_2 = Color.WHITE.getClass();

//          Color color = new Color();                                                          // Compilation ERROR !!!
     }
}

enum Color {
     WHITE, BLACK, RED, YELLOW;
}