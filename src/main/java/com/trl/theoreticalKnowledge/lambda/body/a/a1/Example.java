package com.trl.theoreticalKnowledge.lambda.body.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        // There is one more issue you might see with lambdas. We’ve been defining an argument list in our lambda
        // expressions. Since Java doesn’t allow us to re‐declare a local variable, the following is an issue:
//        out.println(
//                testLambda_1(
//                        "Hello",
//                        str -> {
//                            String str = "";                                                  // Compilation ERROR !!!
//                            return str.concat(" World !!!");
//                        }
//                )
//        );

        out.println(
                testLambda_1(
                        "Hello",
                        str -> {
                            String str_2 = "";
                            return str.concat(" World !!!");
                        }
                )
        );
    }

    public static String testLambda_1(String str, SomeFunctionlInterface_1 in) {
        return in.someMethod(str);
    }
}

@FunctionalInterface
interface SomeFunctionlInterface_1 {
    String someMethod(String str);
}