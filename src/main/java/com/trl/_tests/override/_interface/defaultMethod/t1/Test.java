package com.trl._tests.override._interface.defaultMethod.t1;

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
Which of the following could be inserted to fill in the blank? (Choose all that apply.)

public interface Otter {
  default void play() { }
}

class RiverOtter implements Otter {
 _____________________________
}

A. @Override public boolean equals(Object o) { return false; }
B. @Override public boolean equals(Otter o) { return false; }
C. @Override public int hashCode() { return 42; }
D. @Override public long hashCode() { return 42; }
E. @Override public void play() { }
F. @Override void play() { }

A, C, E. Remember that @Override means that we are implementing a method from a superclass or interface. The Object
class declares methods with the signatures in Options A and C. Granted, it is a poor implementation of equals(), but it
does compile. Option E is also correct because the method is declared in Otter. Option F is incorrect because methods
from an interface are always public. Option B is incorrect because the parameter type does not match the one in Object.
Option D is incorrect because the return type does not match the one in Object.
*/