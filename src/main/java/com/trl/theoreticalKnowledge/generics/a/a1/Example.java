package com.trl.theoreticalKnowledge.generics.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Father> list_0A = new ArrayList();                                                 // Compilation ERROR !!!
//        List<Father> list_0B = new ArrayList<Object>();                                       // Compilation ERROR !!!
//        List<Father> list_1 = new ArrayList<Grandfather>();                                   // Compilation ERROR !!!
        List<Father> list_2 = new ArrayList<Father>();
//        List<Father> list_3 = new ArrayList<Son>();                                           // Compilation ERROR !!!
//        List<Father> list_4 = new ArrayList<Grandson>();                                      // Compilation ERROR !!!

        List<Object> list_5A = new ArrayList();
        List<Object> list_5B = new ArrayList<Object>();
//        List<Object> list_5C = new ArrayList<Grandfather>();                                  // Compilation ERROR !!!
//        List<Object> list_6 = new ArrayList<Father>();                                        // Compilation ERROR !!!
//        List<Object> list_7 = new ArrayList<Son>();                                           // Compilation ERROR !!!
//        List<Object> list_8 = new ArrayList<Grandson>();                                      // Compilation ERROR !!!

        List list_9A = new ArrayList();
        List list_9B = new ArrayList<Object>();
        List list_10 = new ArrayList<Grandfather>();
        List list_11 = new ArrayList<Father>();
        List list_12 = new ArrayList<Son>();
        List list_13 = new ArrayList<Grandson>();

        List<?> list_14A = new ArrayList();
        List<?> list_14B = new ArrayList<Object>();
        List<?> list_15 = new ArrayList<Grandfather>();
        List<?> list_16 = new ArrayList<Father>();
        List<?> list_17 = new ArrayList<Son>();
        List<?> list_18 = new ArrayList<Grandson>();

        List<? extends Father> list_19A = new ArrayList();
//        List<? extends Father> list_19B = new ArrayList<Object>();                            // Compilation ERROR !!!
//        List<? extends Father> list_20 = new ArrayList<Grandfather>();                        // Compilation ERROR !!!
        List<? extends Father> list_21 = new ArrayList<Father>();
        List<? extends Father> list_22 = new ArrayList<Son>();
        List<? extends Father> list_23 = new ArrayList<Grandson>();


        List<? super Father> list_24A = new ArrayList();
        List<? super Father> list_24B = new ArrayList<Object>();
        List<? super Father> list_25 = new ArrayList<Grandfather>();
        List<? super Father> list_26 = new ArrayList<Father>();
//        List<? super Father> list_27 = new ArrayList<Son>();                                  // Compilation ERROR !!!
//        List<? super Father> list_28 = new ArrayList<Grandson>();                             // Compilation ERROR !!!
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