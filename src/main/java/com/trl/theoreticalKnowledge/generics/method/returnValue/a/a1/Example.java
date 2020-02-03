package com.trl.theoreticalKnowledge.generics.method.returnValue.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();
        someClass.printInf("");
        someClass.printInf('a');
        someClass.printInf(1);
        someClass.printInf(1L);
        someClass.printInf(1.0);
        someClass.printInf(1.0F);
        someClass.printInf(someClass);
        out.println();

        out.println(someClass.getInf(""));
        out.println(someClass.getInf('a'));
        out.println(someClass.getInf(1));
        out.println(someClass.getInf(1L));
        out.println(someClass.getInf(1.0));
        out.println(someClass.getInf(1.0F));
        out.println(someClass.getInf(someClass));

        out.println();
        out.println(someClass.method_2("A"));
        out.println(someClass.method_2('a'));
        out.println(someClass.method_2(1));
        out.println(someClass.method_2(1L));
        out.println(someClass.method_2(1.0));
        out.println(someClass.method_2(1.0F));
        out.println(someClass.method_2(someClass));
    }
}

class SomeClass {

    public <V> void printInf(V v) {
        out.println(v.getClass().getName());
    }

    public <V> String getInf(V v) {
        return v.getClass().getName();
    }

    public <V> List<V> method_2(V v) {

        List<V> list = new ArrayList<>();
        list.add(v);

        return list;
    }
}
