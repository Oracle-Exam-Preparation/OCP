package com.trl._tests.override.t1;

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
Which of the following can be inserted to override the superclass method? (Choose all that apply.)

public class LearnToWalk {
  public void toddle() {}
  class BabyRhino extends LearnToWalk {
    // INSERT CODE HERE
  }
}

A. public void toddle() {}
B. public void Toddle() {}
C. public final void toddle() {}
D. public static void toddle() {}
E. public void toddle() throws Exception {}
F. public void toddle(boolean fall) {}

A, C. An override must have the same method signature. A and C both do. F is an overload because it has a different
parameter list. E does not compile because it throws a checked exception not declared in the superclass. D compiles but
is not an override because it is static. B has a different method name, so it is not even an overload.
*/