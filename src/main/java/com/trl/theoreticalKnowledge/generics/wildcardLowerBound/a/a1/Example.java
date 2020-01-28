package com.trl.theoreticalKnowledge.generics.wildcardLowerBound.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<? super Father> list_1 = new ArrayList<Object>();
        List<? super Father> list_2 = new ArrayList<Grandfather>();
        List<? super Father> list_3 = new ArrayList<Father>();
//        List<? super Father> list_4 = new ArrayList<Son>();                                   // Compilation ERROR !!!
//        List<? super Father> list_5 = new ArrayList<Grandson>();                              // Compilation ERROR !!!
    }
}

class Grandfather {}

class Father extends Grandfather {}

class Son extends Father {}

class Grandson extends Son {}