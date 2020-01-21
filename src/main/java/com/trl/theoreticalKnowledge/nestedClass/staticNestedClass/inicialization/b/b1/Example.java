package com.trl.theoreticalKnowledge.nestedClass.staticNestedClass.inicialization.b.b1;

public class Example {
    {
//        StaticNestedClass staticNestedClass_1 = new StaticNestedClass();                      // Compilation ERROR !!!
        Outer.StaticNestedClass staticNestedClass_2 = new Outer.StaticNestedClass();
    }

    static {
//        StaticNestedClass staticNestedClass_1 = new StaticNestedClass();                      // Compilation ERROR !!!
        Outer.StaticNestedClass staticNestedClass_2 = new Outer.StaticNestedClass();
    }
}

class Outer {

    static class StaticNestedClass {
    }

    {
        StaticNestedClass staticNestedClass_1 = new StaticNestedClass();
        StaticNestedClass staticNestedClass_2 = new Outer.StaticNestedClass();
    }

    static {
        StaticNestedClass staticNestedClass_1 = new StaticNestedClass();
        StaticNestedClass staticNestedClass_2 = new Outer.StaticNestedClass();
    }
}