package com.trl._enum.enumConstructor.a.a1;

public class Example {
    public static void main(String[] args) {
    }
}

enum Color {

    WHITE("#ffffff"),
    BLACK("#000000"),
    RED("#ff0000"),
    YELLOW("#ffff00");

    private String hexColorCode;

    private Color(String hexColorCode) {
        this.hexColorCode = hexColorCode;
    }

//    public Color(String hexColorCode) {                   // The code will not compile with a public access constructor.
//        this.hexColorCode = hexColorCode;
//    }
}
