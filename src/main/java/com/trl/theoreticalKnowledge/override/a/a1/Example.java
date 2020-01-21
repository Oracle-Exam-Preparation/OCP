package com.trl.theoreticalKnowledge.override.a.a1;

public class Example {
}

class Parent {
    public void someMethod() {
        System.out.println("Parent");
    }
}

class Child_1 extends Parent {

    @Override
    public void someMethod() {
        System.out.println("Child_1");
    }
}

class Child_2 extends Parent {

    @Override
    public void someMethod() throws RuntimeException {                         // Not compilation ERROR !!! Is allow throws unchecked exception if parent not throws unchecked exception.
        System.out.println("Child_2");
    }
}

class Child_3 extends Parent {

    @Override
    public final void someMethod() {                                          // Not compilation ERROR !! Is allowed override method and make this method final.
        System.out.println("Child_3");
    }
}

class Child_4 extends Parent {

//    @Override
//    public void someMethod() throws Exception {                             // Compilation ERROR !!! Parent not throws checked exception.
//        System.out.println("Child_4");
//    }
}

class Child_5 extends Parent {

    //    @Override                                                          // Compilation ERROR !!!  Is not overriding. Is overloading.
    public void someMethod(String value) {
        System.out.println("Child_5");
    }
}

class Child_6 extends Parent {

    //    @Override                                                         // Compilation ERROR !!! Is not overriding. Is definition of other method whu name is "SomeMethod".
    public void SomeMethod() {
        System.out.println("Child_6");
    }
}

class Child_7 extends Parent {

//    @Override                                                            // Compilation ERROR !! Is not allowed override method and make this method static.
//    public static void someMethod() {
//        System.out.println("Child_3");
//    }
}

class Child_8 extends Parent {

//    @Override                                                            // Compilation ERROR !! Is not allowed override method and put this access modifier less that have parent class.
//    void someMethod() {
//        System.out.println("Child_3");
//    }
}

