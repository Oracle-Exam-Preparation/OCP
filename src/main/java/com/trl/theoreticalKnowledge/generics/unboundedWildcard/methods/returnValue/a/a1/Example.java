package com.trl.theoreticalKnowledge.generics.unboundedWildcard.methods.returnValue.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static List<?> someMethod_1() {
        return new ArrayList();
    }

    public static List<?> someMethod_2() {
        return new ArrayList<Object>();
    }

    public static List<?> someMethod_3() {
        return new ArrayList<Grandfather>();
    }

    public static List<?> someMethod_4() {
        return new ArrayList<Father>();
    }

    public static List<?>  someMethod_5() {
        return new ArrayList<Son>();
    }

    public static List<?>  someMethod_6() {
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