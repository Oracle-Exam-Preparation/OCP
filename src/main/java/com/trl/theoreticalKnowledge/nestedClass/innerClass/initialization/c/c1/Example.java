package com.trl.theoreticalKnowledge.nestedClass.innerClass.initialization.c.c1;

public class Example {
    {
//        Inner inner_1 = new Inner();                                                          // Compilation ERROR !!!
        Outer.Inner inner_2 = new Outer().new Inner();
    }

    static {
//        Inner inner_1 = new Inner();                                                          // Compilation ERROR !!!
        Outer.Inner inner_2 = new Outer().new Inner();
    }
}

class Outer {

    class Inner {
    }

    {
        Inner inner_1 = new Inner();                                                        // Not compilation ERROR !!!
        Outer.Inner inner_2 = new Outer().new Inner();
    }

    static {
//        Inner inner_1 = new Inner();                                                          // Compilation ERROR !!!
        Outer.Inner inner_2 = new Outer().new Inner();
    }
}