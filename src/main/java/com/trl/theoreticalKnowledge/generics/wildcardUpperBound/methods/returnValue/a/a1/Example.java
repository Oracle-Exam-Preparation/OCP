package com.trl.theoreticalKnowledge.generics.wildcardUpperBound.methods.returnValue.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static List<? extends Father> someMethod_1() {
        return new ArrayList();
    }

//    public static List<? extends Father> someMethod_2() {
//        return new ArrayList<Object>();                                                       // Compilation ERROR !!!
//    }

//    public static List<? extends Father> someMethod_3() {
//        return new ArrayList<Grandfather>();                                                  // Compilation ERROR !!!
//    }

    public static List<? extends Father> someMethod_4() {
        return new ArrayList<Father>();
    }

    public static List<? extends Father>  someMethod_5() {
        return new ArrayList<Son>();
    }

    public static List<? extends Father>  someMethod_6() {
        return new ArrayList<Grandson>();
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