package com.trl.theoreticalKnowledge.generics.wildcardUpperBound.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

//        List<? extends Father> list_1 = new ArrayList<Object>();                              // Compilation ERROR !!!
//        List<? extends Father> list_2 = new ArrayList<Grandfather>();                         // Compilation ERROR !!!
        List<? extends Father> list_3 = new ArrayList<Father>();
        List<? extends Father> list_4 = new ArrayList<Son>();
        List<? extends Father> list_5 = new ArrayList<Grandson>();
    }
}

class Grandfather {}

class Father extends Grandfather {}

class Son extends Father {}

class Grandson extends Son {}