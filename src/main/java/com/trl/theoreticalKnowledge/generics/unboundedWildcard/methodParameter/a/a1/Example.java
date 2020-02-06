package com.trl.theoreticalKnowledge.generics.unboundedWildcard.methodParameter.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List rowList = new ArrayList();
        List<Object> objects = new ArrayList<>();
        List<Grandfather> grandfathers = new ArrayList<>();
        List<Father> fathers = new ArrayList<>();
        List<Son> sons = new ArrayList<>();
        List<Grandson> grandsons = new ArrayList<>();

        someMethod(rowList);
        someMethod(objects);
        someMethod(grandfathers);
        someMethod(fathers);
        someMethod(sons);
        someMethod(grandsons);
    }

    public static void someMethod(List<?> list) {
        list.forEach(out::println);
    }
}

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}