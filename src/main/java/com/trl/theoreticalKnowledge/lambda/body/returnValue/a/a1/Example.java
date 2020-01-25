package com.trl.theoreticalKnowledge.lambda.body.returnValue.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(
                testLambda_1(
                        "Hello",
                        str -> str.concat(" World !!!")                                      // Single‐line lambda body.
                )
        );

        // If the "Functional Interface" method have "return value", then this "Lambda Body" must have "return value".
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

        // Compilation ERROR !!! If the "Functional Interface" method have "return value", then this "Lambda Body" must have "return value".
//        out.println(
//                testLambda_2(
//                        "Hello", " World",
//                        (String str1, String str2) -> {
//                            str1 = str1.concat(str2);
//                            str1 = str1.concat(" !!!");
//                        }
//                )
//        );

        //  When using {} in the body of the lambda expression, you must use the return statement if the functional interface
        //  method that lambda implements returns a value. Alternatively, a return statement is optional when the return
        //  type of the method is void.
        testLambda_3(
                "Hello", " World",
                (String str1, String str2) -> {
                    str1 = str1.concat(str2);
                    str1 = str1.concat(" !!!");
                }
        );
        testLambda_3(
                "Hello", " World",
                (String str1, String str2) -> {
                    str1 = str1.concat(str2);
                    str1 = str1.concat(" !!!");
                    return;
                }
        );

        // Compilation ERROR !!! If the keyword "return" is used, braces is must be used to.
//        out.println(
//                testLambda_1(
//                        "Hello",
//                        str -> return str.concat(" World !!!");
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