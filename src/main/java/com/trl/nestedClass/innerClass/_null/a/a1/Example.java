package com.trl.nestedClass.innerClass._null.a.a1;

public class Example {
    public static void main(String[] args) {

        Outer outer = null;
        Outer.Inner outerInner = outer.new Inner();
        System.out.println(outerInner);
    }
}

class Outer {
    class Inner {

    }
}