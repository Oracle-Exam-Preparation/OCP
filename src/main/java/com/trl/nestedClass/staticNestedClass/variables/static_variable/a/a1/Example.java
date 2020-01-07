package com.trl.nestedClass.staticNestedClass.variables.static_variable.a.a1;

public class Example {
    public static void main(String[] args) {

    }
}

class Human {

    private static String name;

    static class Arm {

        {
            System.out.println(name);
        }
    }

}
