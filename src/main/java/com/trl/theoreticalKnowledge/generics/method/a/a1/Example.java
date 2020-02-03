package com.trl.theoreticalKnowledge.generics.method.a.a1;

import static java.lang.System.out;

public class Example {

    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();

        out.println(someClass.getInf(""));
        out.println(someClass.getInf('a'));
        out.println(someClass.getInf(1));
        out.println(someClass.getInf(1L));
        out.println(someClass.getInf(1.0));
        out.println(someClass.getInf(1.0F));
        out.println(someClass.getInf(someClass));

    }
}

class SomeClass {

    public <V> String getInf(V v) {
        return v.getClass().getName();
    }

//    public String getInf_2(V v) {                                               // Compilation ERROR !!! I must say that this method is generic <V>
//        return v.getClass().getName();
//    }

    // Ignoring the generic type.
    public <S, I> Integer getSize(String s1, String s2) {
        return 1;
    }
}
