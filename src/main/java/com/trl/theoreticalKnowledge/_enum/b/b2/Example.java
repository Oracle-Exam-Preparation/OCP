package com.trl.theoreticalKnowledge._enum.b.b2;

public class Example {
}

enum Color_1 {
    WHITE, BLACK, RED, YELLOW                                                                      // Without semicolon.
}

enum Color_2 {
    WHITE, BLACK, RED, YELLOW;                                                                        // With Semicolon.
}

//enum Color_3 {
//    WHITE, BLACK, RED, YELLOW                                              // Compilation ERROR !!! Without Semicolon.
//
//    Color_3() {
//    }
//}

enum Color_4 {
    WHITE, BLACK, RED, YELLOW;                                              // Not Compilation ERROR !!! With Semicolon.

    Color_4() {
    }
}

//enum Color_5 {
//    WHITE, BLACK, RED, YELLOW                                              // Compilation ERROR !!! Without Semicolon.
//
//    public void someMethod (){}
//}

enum Color_6 {
    WHITE, BLACK, RED, YELLOW;                                              // Not Compilation ERROR !!! With Semicolon.

    public void someMethod () {}
}