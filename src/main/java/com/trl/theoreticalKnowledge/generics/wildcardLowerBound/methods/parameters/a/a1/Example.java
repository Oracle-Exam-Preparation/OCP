package com.trl.theoreticalKnowledge.generics.wildcardLowerBound.methods.parameters.a.a1;

import static java.lang.System.*;

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
//        someMethod(sons);                                                                     // Compilation ERROR !!!
//        someMethod(grandsons);                                                                // Compilation ERROR !!!

        someMethod_2(rowList);
        someMethod_2(objects);
        someMethod_2(grandfathers);
        someMethod_2(fathers);
        someMethod_2(sons);                                                                 // Not compilation ERROR !!!
        someMethod_2(grandsons);                                                            // Not compilation ERROR !!!

    }

    public static void someMethod(List<? super Father> list) {
        list.forEach(out::println);
    }

    public static <T> void someMethod_2(List<? super T> list) {
        list.forEach(out::println);
    }

//    public static <T super Father> void someMethod_3(List<T> list) {                          // Compilation ERROR !!!
//        list.forEach(out::println);
//    }

//    public static <? super Father> void someMethod_4(List<T> list) {                          // Compilation ERROR !!!
//        list.forEach(out::println);
//    }
}

class Grandfather {
}

class Father extends Grandfather {
}

class Son extends Father {
}

class Grandson extends Son {
}