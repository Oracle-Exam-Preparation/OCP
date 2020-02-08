package com.trl.theoreticalKnowledge.generics.wildcardUpperBound.methods.parameters.a.a1;

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
//        someMethod(objects);                                                                  // Compilation ERROR !!!
//        someMethod(grandfathers);                                                             // Compilation ERROR !!!
        someMethod(fathers);
        someMethod(sons);
        someMethod(grandsons);

        someMethod_2(rowList);
        someMethod_2(objects);                                                              // Not compilation ERROR !!!
        someMethod_2(grandfathers);                                                         // Not compilation ERROR !!!
        someMethod_2(fathers);
        someMethod_2(sons);
        someMethod_2(grandsons);

        someMethod_3(rowList);
//        someMethod_3(objects);                                                                // Compilation ERROR !!!
//        someMethod_3(grandfathers);                                                           // Compilation ERROR !!!
        someMethod_3(fathers);
        someMethod_3(sons);
        someMethod_3(grandsons);
    }

    public static void someMethod(List<? extends Father> list) {
        list.forEach(out::println);
    }

    public static <T> void someMethod_2(List<? extends T> list) {
        list.forEach(out::println);
    }

    public static <T extends Father> void someMethod_3(List<T> list) {
        list.forEach(out::println);
    }

//    public static <? extends Father> void someMethod_4(List<T> list) {                        // Compilation ERROR !!!
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