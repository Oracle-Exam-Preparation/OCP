package com.trl._tests.equals_hashCode.t3;

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

String s1 = "Canada";
String s2 = new String(s1);
if(s1 == s2) System.out.println("s1 == s2");
if(s1.equals(s2)) System.out.println("s1.equals(s2)");

A. There is no output.
B. s1 == s2
C. s1.equals(s2)
D. Both B and C.
E. The code does not compile.
F. The code throws a runtime exception.

C. s1 points to the string pool. s2 points to an object on the heap, since it is created at runtime. == checks for
reference equality. These are different references, making B incorrect. String overrides equals() so the actual values
are the same, making C correct. And yes, this question could have appeared on the OCA. Remember that the OCP is cumulative.
A question may appear to be about one thing and actually be about a simpler concept.
*/