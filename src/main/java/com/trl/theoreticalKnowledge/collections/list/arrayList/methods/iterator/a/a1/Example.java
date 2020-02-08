package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.iterator.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        Iterator iter = list.iterator();
        while(iter.hasNext()) {
            String string = (String) iter.next();
//            String string_2 = iter.next();        // Compilation ERROR !!!
            out.println(string);
        }

        Iterator<String> iter_2 = list.iterator();
        while(iter_2.hasNext()) {
            String string = iter_2.next();
            out.println(string);
        }
    }
}
