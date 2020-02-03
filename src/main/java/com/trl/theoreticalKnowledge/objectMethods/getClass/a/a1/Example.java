package com.trl.theoreticalKnowledge.objectMethods.getClass.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        String s = "";
        String s_2 = "";

        out.println(s.getClass() == s_2.getClass());
        out.println(s.getClass().equals(s_2.getClass()));
        out.println(String.class == String.class);

        out.println();
        out.println(String.class.getClass() == String.class.getClass());
        out.println(((Object) String.class.getClass()) == ((Object) String.class.getClass()));

        out.println();
        out.println(((Object) String.class) == String.class.getClass());
        out.println(((Object) String.class) == ((Object) String.class.getClass()));
        out.println(((Object) String.class) == ((Object) String.class.getClass().getClass()));

        out.println();
        out.println(String.class);
        out.println("".getClass());
        out.println(String.class.getClass());
        out.println(String.class.getClass().getClass());
    }
}
