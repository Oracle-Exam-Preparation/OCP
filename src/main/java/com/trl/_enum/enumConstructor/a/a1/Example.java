package com.trl._enum.enumConstructor.a.a1;

public class Example {
    public static void main(String[] args) {
        System.out.println(Color.WHITE);
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

    Color(String hexColorCode, String somthingValue) {
        this.hexColorCode = hexColorCode;
    }

//    public Color(String hexColorCode, String somthingValue, String somthingValue_2) {                   // The code will not compile with a public access modifer of constructor.
//        this.hexColorCode = hexColorCode;
//    }

//    protected Color(String hexColorCode, String somthingValue, String somthingValue_2, String somthingValue_3) {                   // The code will not compile with a protected access of constructor.
//        this.hexColorCode = hexColorCode;
//    }
}
