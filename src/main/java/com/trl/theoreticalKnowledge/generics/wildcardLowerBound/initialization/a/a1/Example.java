package com.trl.theoreticalKnowledge.generics.wildcardLowerBound.initialization.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<? super Father> list_1A = new ArrayList();
        List<? super Father> list_1 = new ArrayList<Object>();
        List<? super Father> list_2 = new ArrayList<Grandfather>();
        List<? super Father> list_3 = new ArrayList<Father>();
//        List<? super Father> list_4 = new ArrayList<Son>();                                   // Compilation ERROR !!!
//        List<? super Father> list_5 = new ArrayList<Grandson>();                              // Compilation ERROR !!!

//        List<? super Father> list6 = new ArrayList<? extends Father>();                       // Compilation ERROR !!!
//        List<? super Father> list7 = new ArrayList<? super Father>();                         // Compilation ERROR !!!
//        List<? super Father> list8 = new ArrayList<?>();                                      // Compilation ERROR !!!

//        list_1A.add(new Object());                                                            // Compilation ERROR !!!
//        list_1A.add(new Grandfather());                                                       // Compilation ERROR !!!
        list_1A.add(new Father());
        list_1A.add(new Son());
        list_1A.add(new Grandson());

//        list_1.add(new Object());                                                             // Compilation ERROR !!!
//        list_1.add(new Grandfather());                                                        // Compilation ERROR !!!
        list_1.add(new Father());
        list_1.add(new Son());
        list_1.add(new Grandson());

//        list_2.add(new Object());                                                             // Compilation ERROR !!!
//        list_2.add(new Grandfather());                                                        // Compilation ERROR !!!
        list_2.add(new Father());
        list_2.add(new Son());
        list_2.add(new Grandson());

//        list_3.add(new Object());                                                             // Compilation ERROR !!!
//        list_3.add(new Grandfather());                                                        // Compilation ERROR !!!
        list_3.add(new Father());
        list_3.add(new Son());
        list_3.add(new Grandson());
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