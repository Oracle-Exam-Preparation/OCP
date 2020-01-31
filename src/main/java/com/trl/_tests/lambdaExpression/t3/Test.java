package com.trl._tests.lambdaExpression.t3;

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
}

/*
Which lambda can replace the MySecret class to return the same value? (Choose all that apply.)

public interface Secret {
   String magic(double d);
}

public class MySecret implements Secret {
   public String magic(double d) {
      return "Poof";
   }
}

A. caller((e) -> "Poof");
B. caller((e) -> {"Poof"});
C. caller((e) -> { String e = ""; "Poof" });
D. caller((e) -> { String e = ""; return "Poof"; });
E. caller((e) -> { String e = ""; return "Poof" });
F. caller((e) -> { String f = ""; return "Poof"; });


A, F.
B is incorrect because it does not use the return keyword.
C, D, and E are incorrect because the variable e is already in use from the lambda and cannot be redefined. Additionally,
C is missing the return keyword and E is missing the semicolon.
A and F are the only correct lambda expressions that match the functional interface.
*/