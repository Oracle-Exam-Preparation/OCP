package com.trl.theoreticalKnowledge.lambda.parameters.a.a1;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        // Compilation ERROR !!! If the parameter of "Lambda Expression" has a type, this parameter must be put into parenthesis.
//        out.println(
//                testLambda(
//                        "Hello",
//                        String str -> str.concat(" World !!!")
//                )
//        );

        out.println(
                testLambda(
                        "Hello",
                        (String str) -> str.concat(" World !!!")                             // Single‐line lambda body.
                )
        );

        // Parentheses can be omitted only if there is exactly one parameter and the data type is not specified.
        out.println(
                testLambda(
                        "Hello",
                        str -> str.concat(" World !!!")                                      // Single‐line lambda body.
                )
        );

        out.println(
                testLambda(
                        "Hello",
                        (str) -> str.concat(" World !!!")                                      // Single‐line lambda body.
                )
        );
    }

    public static String testLambda(String str, SomeFunctionlInterface_1 in) {
        return in.someMethod(str);
    }

}

@FunctionalInterface
interface SomeFunctionlInterface_1 {
    String someMethod(String str);
}