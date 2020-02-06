package com.trl.theoreticalKnowledge.generics.wildcardLowerBound.methodReturnValue.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static List<? super Father> someMethod_1() {
        return new ArrayList();
    }

    public static List<? super Father> someMethod_2() {
        return new ArrayList<Object>();
    }

    public static List<? super Father> someMethod_3() {
        return new ArrayList<Grandfather>();
    }

    public static List<? super Father> someMethod_4() {
        return new ArrayList<Father>();
    }

//    public static List<? super Father>  someMethod_5() {
//        return new ArrayList<Son>();                                                          // Compilation ERROR !!!
//    }

//    public static List<? super Father>  someMethod_6() {
//        return new ArrayList<Grandson>();                                                     // Compilation ERROR !!!
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