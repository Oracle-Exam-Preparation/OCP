package com.trl.theoreticalKnowledge.generics.wildcardUpperBound.initialization.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<? extends Father> list_1A = new ArrayList();
//        List<? extends Father> list_1 = new ArrayList<Object>();                              // Compilation ERROR !!!
//        List<? extends Father> list_2 = new ArrayList<Grandfather>();                         // Compilation ERROR !!!
        List<? extends Father> list_3 = new ArrayList<Father>();
        List<? extends Father> list_4 = new ArrayList<Son>();
        List<? extends Father> list_5 = new ArrayList<Grandson>();

//        List<? extends Father> list6 = new ArrayList<? extends Father>();                     // Compilation ERROR !!!
//        List<? extends Father> list7 = new ArrayList<? super Father>();                       // Compilation ERROR !!!
//        List<? extends Father> list8 = new ArrayList<?>();                                    // Compilation ERROR !!!

//        list_1A.add(new Object());                                                            // Compilation ERROR !!!
//        list_1A.add(new Grandfather());                                                       // Compilation ERROR !!!
//        list_1A.add(new Father());                                                            // Compilation ERROR !!!
//        list_1A.add(new Son());                                                               // Compilation ERROR !!!
//        list_1A.add(new Grandson());                                                          // Compilation ERROR !!!

//        list_3.add(new Object());                                                             // Compilation ERROR !!!
//        list_3.add(new Grandfather());                                                        // Compilation ERROR !!!
//        list_3.add(new Father());                                                             // Compilation ERROR !!!
//        list_3.add(new Son());                                                                // Compilation ERROR !!!
//        list_3.add(new Grandson());                                                           // Compilation ERROR !!!

//        list_4.add(new Object());                                                             // Compilation ERROR !!!
//        list_4.add(new Grandfather());                                                        // Compilation ERROR !!!
//        list_4.add(new Father());                                                             // Compilation ERROR !!!
//        list_4.add(new Son());                                                                // Compilation ERROR !!!
//        list_4.add(new Grandson());                                                           // Compilation ERROR !!!

//        list_5.add(new Object());                                                             // Compilation ERROR !!!
//        list_5.add(new Grandfather());                                                        // Compilation ERROR !!!
//        list_5.add(new Father());                                                             // Compilation ERROR !!!
//        list_5.add(new Son());                                                                // Compilation ERROR !!!
//        list_5.add(new Grandson());                                                           // Compilation ERROR !!!
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