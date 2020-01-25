package com.trl.theoreticalKnowledge.lambda.parameters.a.a2;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        // Compilation ERROR !!! If lambda has two or more parameters is mandatory use parenthesis.
//        out.println(
//                testLambda(
//                        "Hello", " World",
//                        String str1, String str2 -> {
//                            str1 = str1.concat(str2);
//                            str1 = str1.concat(" !!!");
//                            return str1;
//                        }
//                )
//        );


        // Compilation ERROR !!! If lambda has two or more parameters is mandatory use parenthesis.
//        out.println(
//                testLambda(
//                        "Hello", " World",
//                        str1, str2 -> {
//                            str1 = str1.concat(str2);
//                            str1 = str1.concat(" !!!");
//                            return str1;
//                        }
//                )
//        );

        out.println(
                testLambda(
                        "Hello", "World",
                        (String str1, String str2) -> {
                            str1 = str1.concat(str2);
                            str1 = str1.concat(" !!!");
                            return str1;
                        }
                )
        );

        out.println(
                testLambda(
                        "Hello", "World",
                        (str1, str2) -> {
                            str1 = str1.concat(str2);
                            str1 = str1.concat(" !!!");
                            return str1;
                        }
                )
        );

        // These examples both take two parameters and ignore one of them, since there is no rule that says the lambda
        // expression must use all of the input parameters.
        out.println(
                testLambda(
                        "Hello", "World",
                        (String str1, String str2) -> {
                            return str1.concat(" !!!");
                        }
                )
        );

        // As mentioned, the data types for the input parameters of a lambda expression are optional. When one parameter
        // has a data type listed, though, all parameters must provide a data type.
        // The following lambda expressions are each invalid for this reason:
//        out.println(
//                testLambda(
//                        "Hello", "World",
//                        (String str1, str2) -> {                                              // Compilation ERROR !!!
//                            str1 = str1.concat(str2);
//                            str1 = str1.concat(" !!!");
//                            return str1;
//                        }
//                )
//        );

        // Compilation ERROR !!!
//        out.println(
//                testLambda(
//                        "Hello", "World",
//                        (str1, String str2) -> {                                              // Compilation ERROR !!!
//                            str1 = str1.concat(str2);
//                            str1 = str1.concat(" !!!");
//                            return str1;
//                        }
//                )
//        );
    }

    public static String testLambda(String one, String two, SomeFunctionlInterface_1 in) {
        return in.someMethod(one, two);
    }

}

@FunctionalInterface
interface SomeFunctionlInterface_1 {
    String someMethod(String one, String two);
}