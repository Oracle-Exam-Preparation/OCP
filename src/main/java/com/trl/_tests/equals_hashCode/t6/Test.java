package com.trl._tests.equals_hashCode.t6;

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
15. Which of the following statements are true about the equals() method? (Choose all that apply.)

A. If equals(null) is called, the method should throw an exception.
B. If equals(null) is called, the method should return false.
C. If equals(null) is called, the method should return true.
D. If equals() is passed the wrong type, the method should throw an exception.
E. If equals() is passed the wrong type, the method should return false.
F. If equals() is passed the wrong type, the method should return true.

B, E. equals() should return false when the object it passed in is not equal to the current object. This includes null
and incorrect types. An equals() method should have a null check and an instanceof check.
*/