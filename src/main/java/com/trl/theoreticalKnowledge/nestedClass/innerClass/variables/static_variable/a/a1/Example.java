package com.trl.theoreticalKnowledge.nestedClass.innerClass.variables.static_variable.a.a1;

public class Example {
    public static void main(String[] args) {

    }
}

class Human {

    private static String name;

    class Arm {

        {
            System.out.println(name);
        }
    }

}
