package com.trl._tests.inheritance.variables.t1;

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
What is the result of the following code?

public class FourLegged {
  String walk = "walk,";
  static class BabyRhino extends FourLegged {
    String walk = "toddle,";
  }
  public static void main(String[] args) {
    FourLegged f = new BabyRhino();
    BabyRhino b = new BabyRhino();
    System.out.println(f.walk);
    System.out.println(b.walk);
 } }

A. toddle,toddle,
B. toddle,walk,
C. walk,toddle,
D. walk,walk,
E. The code does not compile.
F. A runtime exception is thrown.

C. Both objects are BabyRhino objects. Virtual method invocation says that the subclass method gets called at runtime
rather than the type in the variable reference. However, we are not calling methods here. We are referring to instance
variables. With instance variables, the reference type does matter.
*/