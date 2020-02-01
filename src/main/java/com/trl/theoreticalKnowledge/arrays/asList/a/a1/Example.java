package com.trl.theoreticalKnowledge.arrays.asList.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");
//        list.add("--");                                                               // Runtime ERROR !!! UnsupportedOperationException
        out.println(list);
        out.println();

        List<String> list_2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        list_2.add("--");
        out.println(list_2);
        out.println();
    }
}
