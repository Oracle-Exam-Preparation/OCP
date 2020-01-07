package com.trl.nestedClass.staticNestedClass.variables.a.a1;

public class Example {
    public static void main(String[] args) {

    }
}

class Human {

    private String name;

    static class Arm {

        {
//            System.out.println(name);                                                           // Compilation ERROR !!!
        }
    }

}
