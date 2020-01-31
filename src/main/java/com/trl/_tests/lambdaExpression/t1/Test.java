package com.trl._tests.lambdaExpression.t1;

/**
 * This test is taken from the book:         OCP: Oracle ®
 *                                       Certified Professional
 *                                      Java® SE 8 Programmer II
 *                                 by Scott Selikoff, Jeanne Boyarsky
 *                                       Released December 2015
 *                                        Publisher(s): Wiley
 *                                        ISBN: 9781119067900
 *
 * @link https://www.oreilly.com/library/view/ocp-oracle-certified/9781119067900/
 */
public class Test {
    public static void main(String[] args) {
        String str = someMethod(() -> "");
    }

    public static String someMethod (SomeFunctionaInterface functionInterface){
        return functionInterface.someMethod();
    }
    interface SomeFunctionaInterface {
        String someMethod ();
    }
}

/*
Which of the following are valid lambda expressions? (Choose all that apply.)

A. () -> ""
B. x,y -> x+y
C. (Coyote y) -> return 0;
D. (Camel c) -> {return;}
E. Wolf w -> 39
F. () ->
G. (Animal z, m) -> a

A, D. The first lambda expression is valid, taking no arguments and returning the empty string, so A is correct.
B is incorrect, as more than one parameter requires parentheses ().
C is incorrect, as brackets {} are required when using return.
D is correct, as the expression takes one Camel input and returns void.
E is incorrect, as parentheses are required when using the data type Wolf.
F is incorrect, as it has no right-side expression.
Finally, G is incorrect, as specifying the data type for one parameter in a lambda expression requires you to specify
the data type for all parameters in the expression. In this case, z has a data type and m does not, therefore the expression is invalid.
*/