package com.trl.theoreticalKnowledge.lambda.body.semicolon.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(
                testLambda_1(
                        "Hello",
                        str -> str.concat(" World !!!")                                      // Single‐line lambda body.
                )
        );

        // If "lambda" use "braces" {}, each line of "Lambda Body" must have semicolon at the end.
        // You must explicitly terminate each statement in the body with a semicolon.
        out.println(
                testLambda_1(
                        "Hello",
                        str -> {
                            return str.concat(" World !!!");
                        }
                )
        );

        out.println(
                testLambda_2(
                        "Hello", " World",
                        (String str1, String str2) -> {
                            str1 = str1.concat(str2);
                            str1 = str1.concat(" !!!");
                            return str1;
                        }
                )
        );

        // Compilation ERROR !!!  If "Lambda Body" use braces {}, each line of "Lambda Body" must have semicolon at the end.
//        out.println(
//                testLambda_2(
//                        "Hello", " World",
//                        (String str1, String str2) -> {
//                            str1 = str1.concat(str2)
//                            str1 = str1.concat(" !!!")
//                            return str1
//                        }
//                )
//        );
    }

    public static String testLambda_1(String str, SomeFunctionlInterface_1 in) {
        return in.someMethod(str);
    }

    public static String testLambda_2(String one, String two, SomeFunctionlInterface_2 in) {
        return in.someMethod(one, two);
    }

    public static void testLambda_3(String one, String two, SomeFunctionlInterface_3 in) {
        out.println(one + "" + two);
    }
}

@FunctionalInterface
interface SomeFunctionlInterface_1 {
    String someMethod(String str);
}

@FunctionalInterface
interface SomeFunctionlInterface_2 {
    String someMethod(String one, String two);
}

@FunctionalInterface
interface SomeFunctionlInterface_3 {
    void someMethod(String one, String two);
}